package workshop.spring.server.data;

import org.springframework.data.jpa.repository.JpaRepository;
import workshop.spring.server.data.model.CourseModule;

public interface CourseModuleRepository extends JpaRepository<CourseModule, Long> {
}
