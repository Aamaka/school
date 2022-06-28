package africa.semicolon.services;

import africa.semicolon.data.models.Student;
import africa.semicolon.data.repositories.StudentRepository;
import africa.semicolon.dto.Requests.AddStudentRequestDto;
import africa.semicolon.dto.Responses.AddStudentResponse;
import africa.semicolon.exception.StudentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public AddStudentResponse addStudent(AddStudentRequestDto dto) {
        Student student = new Student();
        student.setName(dto.getName());
        student.setEmail(dto.getEmail());
        student.setAge(dto.getAge());
        student.setSchoolFees(dto.getSchoolFees());
        student.setAmountPaid(dto.getAmountPaid());
        Student saved = studentRepository.save(student);
        AddStudentResponse response = new AddStudentResponse();
        response.setMessage("Welcome "+saved.getName()+" to our school");
        return response;
    }

    @Override
    public Student findStudentByName(String name) {
        Student student = studentRepository.findByName(name);
        if(student != null){
            return student;
        }
        throw new StudentException("Student does not exist");
    }

    @Override
    public Student findStudentByEmail(String email) {
        return studentRepository.findByEmail(email);
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
