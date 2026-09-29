package com.securebank.pojo;

import jakarta.validation.constraints.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class TransferForm {

    @NotEmpty(message = "please enter the Account Number")
    @Size(min = 12,max = 12,message = "Enter Only 12 digit Account Number")
    private String accountNumber;

    @NotEmpty(message = "Please enter IFSC Code Number")
    @Size(min=11,max = 11,message="Enter Only 11 digit IFSC Code")
    private String ifscCode;

    @NotNull(message = "Please enter amount!!")
    @Min(value = 1,message = "Amount is not O and less than 0")
    @Max(value = 20000,message = "Amount is not greater than 20,000")
    private int amount ;

    @NotEmpty(message = "Please give remark")
    @Size(max = 30,message = "Message under 20 word")
    private String remarks;
}
