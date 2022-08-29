package id.hikari.oauth2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import id.hikari.oauth2.exception.ResourceNotFoundException;
import id.hikari.oauth2.model.User;
import id.hikari.oauth2.repository.UserRepository;
import id.hikari.oauth2.security.CurrentUser;
import id.hikari.oauth2.security.UserPrincipal;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
//    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
    
    @GetMapping("/ping")
    public String ping() {
    	return "pong";
    }
}
