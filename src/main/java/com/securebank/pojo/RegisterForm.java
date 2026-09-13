package com.securebank.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class RegisterForm {
    private String fullName;
    private String email;
    private long mobile ;
    private String password;
}
