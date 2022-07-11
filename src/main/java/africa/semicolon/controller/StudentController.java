package africa.semicolon.controller;

import africa.semicolon.data.models.Student;
import africa.semicolon.dto.Requests.AddStudentRequest;
import africa.semicolon.dto.Responses.AddStudentResponse;
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
    public AddStudentResponse addStudent(@RequestBody AddStudentRequest requestDto){
       return service.addStudent(requestDto);
    }

    @PostMapping("/find")
    public Student findStudentByEmail(String email){
        return service.findStudentByEmail(email);
    }

}
