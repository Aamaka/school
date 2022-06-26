package africa.semicolon.services;

import africa.semicolon.data.models.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    void addStudent (String name, String email, int age, double schoolFees, double amountPaid);

    List<Student> findStudentByName(String name);
    Student findStudentByEmail(String email);
    Optional<Student> findStudentById(String id);
    void delete(Student student);
    Student update(Student student);
}
