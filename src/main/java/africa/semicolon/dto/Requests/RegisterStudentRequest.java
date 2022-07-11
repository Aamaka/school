package africa.semicolon.dto.Requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterStudentRequest {
    private String firstName;

    private String lastName;

    private String email;

    private int age;

    private String classGrade;

    private double schoolFees;

    private double amountPaid;
}
