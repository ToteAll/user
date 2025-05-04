package com.toteall.user.controller;

import com.toteall.user.dto.Users;
import com.toteall.user.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserRepository userRepository;

    @GetMapping("/user")
    public List<Users> user() {
        return userRepository.findAll();
    }
}
