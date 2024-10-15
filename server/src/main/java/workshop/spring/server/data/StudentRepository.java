package workshop.spring.server.data;

import org.springframework.data.jpa.repository.JpaRepository;
import workshop.spring.server.data.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
