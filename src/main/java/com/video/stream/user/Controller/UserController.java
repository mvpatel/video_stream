package com.video.stream.user.Controller;

import com.video.stream.user.Service.UserService;
import com.video.stream.user.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    UserService userService;

    @Autowired
    public UserController (UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity addUser (@RequestBody @Valid UserDTO userDTO) {
        userService.addUser(userDTO);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/exist/{creditCardNumber}")
    public boolean isUserExist(@PathVariable int creditCardNumber) {
        return userService.isUserExist(creditCardNumber);
    }

}
