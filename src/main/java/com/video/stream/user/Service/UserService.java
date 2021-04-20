package com.video.stream.user.Service;

import com.video.stream.user.UserDTO;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    Set<UserDTO> userSet = new HashSet();
    public void addUser(UserDTO userDTO) {
        userSet.add(userDTO);
    }

    public boolean isUserExist (int creditCardNumber) {
        return userSet.stream().anyMatch(u -> u.getCreditCardNumber() == creditCardNumber);
    }
}
