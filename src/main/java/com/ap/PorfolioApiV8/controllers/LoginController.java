package com.ap.PorfolioApiV8.controllers;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.ap.PorfolioApiV8.Services.Usuario.IUsuarioService;

import com.ap.PorfolioApiV8.models.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/login")
public class LoginController {
    
    
    @Autowired
    private IUsuarioService usuarioServ;

    private String getJWTToken(String username) {

        String secretKey = "W3L0v3Arg3nt1n4";

        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER");

        String token = Jwts
                .builder()
                .setId("ap17380")
                .setSubject(username)
                .claim("authorities",
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 60 * 60 * 1000)) // 1 hora de duración
                .signWith(SignatureAlgorithm.HS512,
                        secretKey.getBytes())
                .compact();

        return "Bearer " + token;
    }





    @PostMapping
    public ResponseEntity<Usuario> login(@Validated @RequestBody Usuario user) {

        Usuario usuarioRecuperado = usuarioServ.getByUsername(user.getNombreUsuario());
        if (usuarioRecuperado.getPassword().equals(user.getPassword())) {
            String token = getJWTToken(user.getNombreUsuario());
            usuarioRecuperado.setToken(token);
            usuarioRecuperado.setPassword(null);
            return ResponseEntity.ok().body(usuarioRecuperado);
        } else {
            return ResponseEntity.badRequest().build();
        }

    }

}
