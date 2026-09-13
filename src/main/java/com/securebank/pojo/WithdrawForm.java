package com.securebank.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class WithdrawForm {
    private int amount;
    private String withdrawalMethod;
}
