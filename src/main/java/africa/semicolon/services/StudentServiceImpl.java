package africa.semicolon.services;

import africa.semicolon.data.models.Student;
import africa.semicolon.data.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void addStudent(String name, String email,int age, double schoolFees, double amountPaid) {
        Student student = new Student(name,email,age,schoolFees,amountPaid);
        studentRepository.save(student);
    }

    @Override
    public Student findStudentByName(String name) {
        return studentRepository.findByName(name);
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
