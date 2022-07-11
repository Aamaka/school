package africa.semicolon.data.models;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Document("Students")
public class Student {

    @Id
    private String id;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String email;

    @NonNull
    private String classGrade;
    @NonNull
    int age;
    @NonNull
    private double schoolFees;
    @NonNull
    private double amountPaid;

}
