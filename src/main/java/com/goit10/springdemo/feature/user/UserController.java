package com.goit10.springdemo.feature.user;

import com.goit10.springdemo.feature.user.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
@RestController
public class UserController {
    private final UserService userService;

    @GetMapping("/list")
    public List<UserDto> list() {
       return userService.findAll().stream()
               .map(UserDto::fromUser)
               .collect(Collectors.toList());
    }
}
