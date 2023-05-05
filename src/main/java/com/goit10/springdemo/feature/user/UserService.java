package com.goit10.springdemo.feature.user;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    @PostConstruct
    public void init() {
//        //CREATE
//        userRepository.save(User user);
//        //READ
//        userRepository.findAll();
//        userRepository.findById(" gf");
//        //UPDATE
//        userRepository.save(User user);
//        //DELETE
//        userRepository.delete(user);
//        userRepository.deleteById("user");
        System.out.println("userRepository.getClass() = " + userRepository.getClass());
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
