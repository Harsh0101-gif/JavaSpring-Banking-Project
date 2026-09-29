package com.securebank.pojo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class DepositForm {
     @NotNull(message = "not empty Number")
     @Min(value = 500 ,message = "only deposit 500")
    private int amount;
    @NotEmpty(message = "not empty Deposit")
    private String DepositMethod;
}
