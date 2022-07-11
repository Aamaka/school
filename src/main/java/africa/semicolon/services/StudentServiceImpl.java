package africa.semicolon.services;
import africa.semicolon.data.models.Student;
import africa.semicolon.data.repositories.StudentRepository;
import africa.semicolon.dto.Requests.AddStudentRequest;
import africa.semicolon.dto.Responses.AddStudentResponse;
import africa.semicolon.exception.StudentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public AddStudentResponse addStudent(AddStudentRequest dto) {
        if(studentRepository.existsByEmail(dto.getEmail())) throw new StudentException("Student is already registered");
        Student student = new Student();
        student.setFirstName(dto.getFirstName());
        student.setLastName(dto.getLastName());
        student.setEmail(dto.getEmail());
        student.setAge(dto.getAge());
        student.setGrade(dto.getGrade());
        student.setSchoolFees(dto.getSchoolFees());
        student.setAmountPaid(dto.getAmountPaid());
        Student saved = studentRepository.save(student);
        AddStudentResponse response = new AddStudentResponse();
        response.setMessage("Welcome " + saved.getFirstName() + " " + saved.getLastName() + " to our school");

        return response;
    }


    @Override
    public Student findStudentByEmail(String email) {
        Student student = studentRepository.findByEmail(email);
        if (student.getEmail().equals(email)) {
            return student;
        }
        throw new StudentException("student does not exist");
    }

    @Override
    public Optional<Student> findStudentById(String id) {
        return studentRepository.findById(id);
    }

    @Override
    public void delete(Student student) {
        studentRepository.delete(student);
    }

    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }
}

