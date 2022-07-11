package africa.semicolon.controller;

import africa.semicolon.data.models.Student;
import africa.semicolon.dto.Requests.RegisterStudentRequest;
import africa.semicolon.dto.Responses.RegisterStudentResponse;
import africa.semicolon.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/student")
    public RegisterStudentResponse addStudent(@RequestBody RegisterStudentRequest requestDto){
       return service.register(requestDto);
    }

    @PostMapping("/find")
    public Student findStudentByEmail(String email){
        return service.findStudentByEmail(email);
    }

}
