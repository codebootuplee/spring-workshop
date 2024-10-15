package workshop.spring.api;

import workshop.spring.api.model.StudentDTORead;
import workshop.spring.api.model.StudentDTOWrite;

import java.util.List;

public interface StudentApi {
    List<StudentDTORead> getAllStudents();

    StudentDTORead getStudentById(Long id);

    StudentDTORead createStudent(StudentDTOWrite student);

    StudentDTORead updateStudent(Long id, StudentDTOWrite student);

    String deleteStudent(Long id);

    StudentDTORead addModuleToStudent(Long studentId, Long moduleId);

    StudentDTORead removeModuleFromStudent(Long studentId, Long moduleId);
}
