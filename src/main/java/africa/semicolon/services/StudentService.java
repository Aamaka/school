package africa.semicolon.services;

import africa.semicolon.data.models.Student;
import africa.semicolon.dto.Requests.AddStudentRequestDto;
import africa.semicolon.dto.Responses.AddStudentResponse;
import org.springframework.stereotype.Service;


import java.util.Optional;


public interface StudentService {
    AddStudentResponse addStudent (AddStudentRequestDto dto);

    Student findStudentByEmail(String email);
    Optional<Student> findStudentById(String id);
    void delete(Student student);
    Student update(Student student);
}
