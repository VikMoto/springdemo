package com.goit10.springdemo.feature.user;

import com.goit10.springdemo.feature.user.dto.UserDto;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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

    public void save(User user) {
        userRepository.save(user);
    }

    public boolean exist(String email) {
        if (email == null) return false;

        return userRepository.existsById(email);
    }

    public void deleteByEmail(String email) {
        userRepository.deleteById(email);
    }

    public List<String> searchQueryEmails(String query) {
        return userRepository.searchEmails("%" + query + "%");
    }

//    public List<User> searchQuery(String query) {
//        return userRepository.findAllById(userRepository.searchEmails("%" + query + "%"));
//    }

    public List<User> searchQuery(String query) {
        return userRepository.searchByNativeSqlQuery("%" + query + "%");
    }

    public int countPeopleOlderThan(int age) {
        LocalDate maxBirthday = LocalDate.now().minusYears(age);
        return userRepository.countOlderThan(maxBirthday);
//        return (int) findAll()
//                .stream()
//                .filter(u -> {
//                   int userAge =(int) ChronoUnit.YEARS.between(
//                           u.getBirthday(), LocalDate.now()
//                   );
//                   return userAge > age;
//                })
//                .count();
    }
}
