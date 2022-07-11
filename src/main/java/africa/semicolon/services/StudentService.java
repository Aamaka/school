package africa.semicolon.services;

import africa.semicolon.data.models.Student;
import africa.semicolon.dto.Requests.RegisterStudentRequest;
import africa.semicolon.dto.Responses.RegisterStudentResponse;


import java.util.Optional;


public interface StudentService {
    RegisterStudentResponse register(RegisterStudentRequest dto);

    Optional<Student> findStudentById(String id);
    void delete(Student student);
    Student update(Student student);
}
