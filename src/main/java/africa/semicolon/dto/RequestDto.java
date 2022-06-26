package africa.semicolon.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestDto {
    private String name;

    private String email;

    int age;

    private double schoolFees;

    private double amountPaid;
}
