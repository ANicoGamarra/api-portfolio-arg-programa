package com.ap.PorfolioApiV8.controllers;

import com.ap.PorfolioApiV8.models.Login;
import com.ap.PorfolioApiV8.security.JwtDto;
import com.ap.PorfolioApiV8.security.JwtProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class LoginController {
    
    @Autowired
    private JwtProvider jwtProvider;
    @Autowired
    private AuthenticationManager authenticationManager;
    private JwtDto token = new JwtDto("null");

    @PostMapping
    public ResponseEntity<?> authenticateUser(@RequestBody Login login) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(login.getNombreUsuario(), login.getPassword()));

       SecurityContextHolder.getContext().setAuthentication(authentication);

       String token = this.jwtProvider.generarToken(authentication);
        return ResponseEntity.ok(new JwtDto(token));
    }


}
