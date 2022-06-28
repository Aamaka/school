package africa.semicolon.data.repositories;

import africa.semicolon.data.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    Student findByName(String name);
    Student findByEmail(String email);
    Optional<Student> findById(String id);

}
