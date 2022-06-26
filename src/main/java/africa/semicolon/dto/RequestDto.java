package africa.semicolon.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


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
