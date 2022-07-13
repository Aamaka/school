package africa.semicolon.services;
import africa.semicolon.data.models.Student;
import africa.semicolon.data.repositories.StudentRepository;
import africa.semicolon.dto.Requests.RegisterStudentRequest;
import africa.semicolon.dto.Responses.RegisterStudentResponse;
import africa.semicolon.exception.StudentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public RegisterStudentResponse register(RegisterStudentRequest request) {
        if(studentRepository.existsByEmail(request.getEmail())) throw new StudentException("Student is already registered");
        Student student = new Student();
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setEmail(request.getEmail());
        student.setAge(request.getAge());
        student.setClassGrade(request.getClassGrade());
        student.setSchoolFees(request.getSchoolFees());
        student.setAmountPaid(request.getAmountPaid());
        Student saved = studentRepository.save(student);
        RegisterStudentResponse response = new RegisterStudentResponse();
        response.setMessage("Welcome " + saved.getFirstName() + " " + saved.getLastName() + " to our school");

        return response;
    }

    @Override
    public List<Student> find(String grade){
        List<Student> student = studentRepository.findByClassGrade(grade);
        if(student != null){
            return student;
        }else {
            throw new StudentException("that cohort does not exist");
        }
    }


}

