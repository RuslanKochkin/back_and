package de.doubledecker.doubledecker.controller.dto;

import de.doubledecker.doubledecker.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private long userId;
    private String login;




    public static UserDTO convertToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getUserId());
        userDTO.setLogin(user.getLogin());
        return userDTO;
    }
    public static UserDTO getInstance(User user) {
        return new UserDTO(user.getUserId(), user.getLogin());
    }

}
