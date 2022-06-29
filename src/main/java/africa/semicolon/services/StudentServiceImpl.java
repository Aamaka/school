package africa.semicolon.services;

import africa.semicolon.data.models.Student;
import africa.semicolon.data.repositories.StudentRepository;
import africa.semicolon.dto.Requests.AddStudentRequestDto;
import africa.semicolon.dto.Responses.AddStudentResponse;
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
            student.setFirstName(dto.getFirstName());
            student.setLastName(dto.getLastName());
            student.setEmail(dto.getEmail());
            student.setAge(dto.getAge());
            student.setGrade(dto.getGrade());
            student.setSchoolFees(dto.getSchoolFees());
            student.setAmountPaid(dto.getAmountPaid());
//
//            if (student.getEmail().equals(dto.getEmail())) {
//                AddStudentResponse response = new AddStudentResponse();
//                response.setMessage("email already exist");
//                return response;
//            }
            Student saved = studentRepository.save(student);
            AddStudentResponse response = new AddStudentResponse();
            response.setMessage("Welcome " + saved.getFirstName() + " " + saved.getLastName() + " to our school");

            return response;
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
