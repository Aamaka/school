package africa.semicolon.data.repositories;

import africa.semicolon.data.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student, String> {
    Student findByName(String name);
    Student findByEmail(String email);
    Optional<Student> findById(long id);

}
