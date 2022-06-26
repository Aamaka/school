package africa.semicolon.controller;

import africa.semicolon.data.models.Student;
import africa.semicolon.dto.RequestDto;
import africa.semicolon.services.StudentService;
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
    public String addStudent(@RequestBody RequestDto requestDto){
        service.addStudent(requestDto.getName(), requestDto.getEmail(),  requestDto.getAge(), requestDto.getSchoolFees(), requestDto.getAmountPaid());
        return "Added successfully";
    }

    @PostMapping("/find/student")
    public List<Student> findStudent(@RequestBody RequestDto dto){
      return service.findStudentByName(dto.getName());

    }

}
