package com.securebank.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class DepositForm {
    private int amount;
    private String DepositMethod;
}
