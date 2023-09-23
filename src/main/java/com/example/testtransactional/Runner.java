package com.example.testtransactional;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {
    private final UserService userService;
    @Override
    public void run(String... args) throws Exception {
        userService.test();
    }
}
