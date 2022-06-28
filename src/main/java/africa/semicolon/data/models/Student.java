package africa.semicolon.data.models;

import africa.semicolon.dto.Requests.AddStudentRequestDto;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Document("Students")
public class Student {

    @Id
    private String id;
    @NonNull
    private String name;
    @NonNull
    private String email;

    private LocalDate dob;
    @NonNull
    int age;
    @NonNull
    private double schoolFees;
    @NonNull
    private double amountPaid;

}
