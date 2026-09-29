package com.securebank.pojo;

import jakarta.validation.constraints.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class RegisterForm {
    @NotEmpty(message = "Please enter your name")
    @Size(min=3,max = 30,message = "size of name b/w 3 and 30")
    private String fullName;

    @NotEmpty(message = "Please enter your email")
    @Size(min=7,max =60,message = "size of email b/w 7 and 60")
    private String email;

    @NotNull(message = "Please enter your mobile")
    @Min(value = 1000000000,message = "Please Enter only 10 digit phone no.")
    @Max(value = 9999999999l,message = "Please Enter only 10 digit phone no.")
    private long mobile ;

    @NotEmpty(message = "Please enter your password")
    @Size(min=3,max = 30,message = "size of password b/w 3 and 30")
    private String password;
}
