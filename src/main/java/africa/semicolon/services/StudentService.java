package africa.semicolon.services;

import africa.semicolon.data.models.Student;
import africa.semicolon.dto.Requests.RegisterStudentRequest;
import africa.semicolon.dto.Responses.RegisterStudentResponse;

import java.util.List;

public interface StudentService {
    RegisterStudentResponse register(RegisterStudentRequest dto);

    List<Student> find(String grade);
}
