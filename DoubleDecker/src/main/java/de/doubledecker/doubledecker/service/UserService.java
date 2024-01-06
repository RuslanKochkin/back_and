package de.doubledecker.doubledecker.service;

import de.doubledecker.doubledecker.controller.dto.UserDTO;
import de.doubledecker.doubledecker.domain.User;
import de.doubledecker.doubledecker.repository.UserRepository;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;


@Setter
@Getter
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User getUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new EntityNotFoundException("User not found with id: " + userId));
    }

    public UserDTO add(UserDTO userDTO) {
        User user = new User();
        user.setLogin(userDTO.getLogin());

        return UserDTO.getInstance(userRepository.save(user));
    }

}
