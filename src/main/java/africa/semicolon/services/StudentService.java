package africa.semicolon.services;

import africa.semicolon.data.models.Student;
import africa.semicolon.dto.Requests.AddStudentRequest;
import africa.semicolon.dto.Responses.AddStudentResponse;


import java.util.Optional;


public interface StudentService {
    AddStudentResponse addStudent (AddStudentRequest dto);

    Student findStudentByEmail(String email);
    Optional<Student> findStudentById(String id);
    void delete(Student student);
    Student update(Student student);
}
