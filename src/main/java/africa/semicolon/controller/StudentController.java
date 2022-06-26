package africa.semicolon.controller;

import africa.semicolon.data.models.Student;
import africa.semicolon.dto.Requests.AddStudentRequestDto;
import africa.semicolon.dto.Requests.FindStudentByNameRequest;
import africa.semicolon.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/student")
    public String addStudent(@RequestBody AddStudentRequestDto requestDto){
        service.addStudent(requestDto.getName(), requestDto.getEmail(),  requestDto.getAge(), requestDto.getSchoolFees(), requestDto.getAmountPaid());
        return "Added successfully";
    }

    @PostMapping("/find/student")
    public Student findStudent(@RequestBody FindStudentByNameRequest dto){
      return service.findStudentByName(dto.getName());

    }

}
