package africa.semicolon.data.repositories;

import africa.semicolon.data.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    Optional<Student> findById(String id);

    boolean existsByEmail(String email);

    List<Student> findByClassGrade(String grade);
}
