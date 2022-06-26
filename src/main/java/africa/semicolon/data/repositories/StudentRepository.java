package africa.semicolon.data.repositories;

import africa.semicolon.data.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.List;
import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student, String> {
    List<Student> findByName(String name);
    Student findByEmail(String email);
    Optional<Student> findById(long id);

}
