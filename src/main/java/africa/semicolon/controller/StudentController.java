package africa.semicolon.controller;

import africa.semicolon.data.models.Student;
import africa.semicolon.dto.Requests.RegisterStudentRequest;
import africa.semicolon.dto.Responses.RegisterStudentResponse;
import africa.semicolon.services.StudentService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/student")
    public RegisterStudentResponse addStudent(@RequestBody RegisterStudentRequest requestDto) {
        return service.register(requestDto);
    }

    @GetMapping("/find")
    public List<Student> find(@RequestBody String grade){
        return service.find(grade);
    }

}
