package cz.kallasch.backend.service;

import cz.kallasch.backend.entity.UserEntity;
import cz.kallasch.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<UserEntity> findById(Long userId) {
        return userRepository.findById(userId);
    }

    public UserEntity findByName(String userName) {
        return userRepository.findByName(userName);
    }
}
