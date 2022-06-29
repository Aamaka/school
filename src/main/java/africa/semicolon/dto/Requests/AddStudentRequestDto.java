package africa.semicolon.dto.Requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddStudentRequestDto {
    private String firstName;

    private String lastName;

    private String email;

    private int age;

    private int grade;

    private double schoolFees;

    private double amountPaid;
}
