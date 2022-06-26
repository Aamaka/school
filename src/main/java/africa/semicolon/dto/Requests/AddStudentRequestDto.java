package africa.semicolon.dto.Requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddStudentRequestDto {
    private String name;

    private String email;

    int age;

    private double schoolFees;

    private double amountPaid;
}
