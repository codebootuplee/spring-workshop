package workshop.spring.server;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import workshop.spring.api.model.StudentDTORead;
import workshop.spring.server.data.model.Student;

public class StudentMapperTest {
    @Test
    public void canMapStudentDaoToDto(){
        StudentMapper mapper = new StudentMapper();
        Student studentDao = new Student();
        studentDao.setId(1L);
        studentDao.setName("Lee");
        StudentDTORead studentDto = mapper.toDto(studentDao);
        Assertions.assertThat(studentDto).isEqualTo(new StudentDTORead(1L, "Lee"));
    }
}
