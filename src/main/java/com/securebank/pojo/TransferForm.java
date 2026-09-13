package com.securebank.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class TransferForm {
    private String accountNumber;
    private String ifscCode;
    private int amount ;
    private String remarks;
}
