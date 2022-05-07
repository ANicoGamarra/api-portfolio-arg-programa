package com.ap.PorfolioApiV8.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

public class JwtTokenFilter extends OncePerRequestFilter {

    @Autowired
    private JwtProvider jwtProvider;
    
    @Autowired
	private UserDetailsServiceImpl userDetailsService;


    @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain filterChain)
            throws ServletException, IOException {
    //obtenemos el token de la solicitud HTTP
		String token = this.getTokenRequest(req);
		
		//validamos el token
		if(StringUtils.hasText(token) && jwtProvider.validateToken(token)) {
			//obtenemos el username del token
			String nombreUsuario = jwtProvider.getNombreUsuarioFromToken(token);
			
			//cargamos el usuario asociado al token
			UserDetails userDetails = userDetailsService.loadUserByUsername(nombreUsuario);
			UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null,userDetails.getAuthorities());
			authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(req));
			
			//establecemos la seguridad
			SecurityContextHolder.getContext().setAuthentication(authenticationToken);
		}
		filterChain.doFilter(req, res);
    }

    //Bearer token de acceso
	private String getTokenRequest(HttpServletRequest req) {
        String JWT="";
String bearerToken = req.getHeader("Authorization");
if(StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer")) {
    JWT= bearerToken.substring(7,bearerToken.length());
}
return JWT;
}

}
