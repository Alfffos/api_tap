package com.app.tap.controllers;


import com.app.tap.entitites.AuthResponse;
import com.app.tap.entitites.LoginRequest;
import com.app.tap.entitites.RegisterRequest;
import com.app.tap.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    @Autowired
    private final AuthService _authService;


    @PostMapping("login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request){

        return  ResponseEntity.ok(_authService.login(request));

    }

    @PostMapping( "register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request){

        return  ResponseEntity.ok(_authService.register(request));
    }

}
