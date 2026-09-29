package com.securebank.pojo;

import jakarta.validation.constraints.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class WithdrawForm {

    @NotNull(message = "Please enter amount!!")
    @Min(value = 1,message = "Amount is not O and less than 0")
    @Max(value = 20000,message = "Amount is not greater than 20,000")
    private int amount;

    @NotEmpty(message = "please enter withdrawal Information")
    @Size(max = 20,message = "please under 20 word")
    private String withdrawalMethod;
}
