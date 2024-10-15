package workshop.spring.server;

import org.springframework.stereotype.Component;
import workshop.spring.api.model.StudentDTORead;
import workshop.spring.api.model.StudentDTOWrite;
import workshop.spring.server.data.model.Student;

@Component
public class StudentMapper {

    public Student toDao(StudentDTOWrite studentDto){
        Student student = new Student();
        student.setName(studentDto.name());
        return student;
    }

    public StudentDTORead toDto(Student studentDto){
        return new StudentDTORead(
                studentDto.getId(), studentDto.getName());
    }
}
