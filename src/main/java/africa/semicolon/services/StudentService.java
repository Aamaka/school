package africa.semicolon.services;

import africa.semicolon.dto.Requests.RegisterStudentRequest;
import africa.semicolon.dto.Responses.RegisterStudentResponse;




public interface StudentService {
    RegisterStudentResponse register(RegisterStudentRequest dto);

}
