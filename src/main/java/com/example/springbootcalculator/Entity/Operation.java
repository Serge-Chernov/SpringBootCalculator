package com.example.springbootcalculator.Entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operation {
    @NotEmpty
    @NotBlank
    String num1;

    @NotEmpty
    @NotBlank
    String num2;

    @NotEmpty
    @NotBlank
    String operationType;
}
