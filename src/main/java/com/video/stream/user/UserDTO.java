package com.video.stream.user;

import lombok.Getter;

import javax.persistence.Entity;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Entity
@Getter
public class UserDTO {

    @Pattern(regexp = "[a-zA-Z0-9]+", message = "userName must be alphanumeric, without space, cannot be null")
    private String userName;

//    @NotBlank(message = "password cannot be blank")
    @Size(min = 8, message = "password cannot be less than 8 characters")
    private String password;

    //    @Email(message = "emil must be followed by Email Format")
//    @NotBlank(message = "emil cannot be blank")
    private String email;

//    @NotBlank(message = "birthDate cannot be blank")
//@PastOrPresent
private String birthDate;
//    private LocalDate dateOfBirth

//    @Size(min = 16, max = 16)
    private int creditCardNumber;
}
