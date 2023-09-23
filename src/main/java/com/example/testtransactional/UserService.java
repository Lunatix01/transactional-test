package com.example.testtransactional;


import io.vavr.control.Try;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public void test() {
        Try.of(() -> userRepository.findByName("aland").orElseThrow())
                .map(userEntity -> {
                    userEntity.setSlug("aland");
                    return userRepository.save(userEntity);
                })
                .<Void>map(ignored -> null)
                .onFailure(ex -> log.error("slug cannot be saved.", ex));
    }
}
