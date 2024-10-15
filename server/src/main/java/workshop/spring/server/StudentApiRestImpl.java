package workshop.spring.server;

import org.springframework.web.bind.annotation.*;
import workshop.spring.api.StudentApi;
import workshop.spring.api.model.StudentDTORead;
import workshop.spring.api.model.StudentDTOWrite;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentApiRestImpl implements StudentApi {

    @Override
    @GetMapping
    public List<StudentDTORead> getAllStudents() {
        throw new UnsupportedOperationException("Operation not implemented yet.");
    }

    @Override
    @GetMapping("/{id}")
    public StudentDTORead getStudentById(@PathVariable Long id) {
        throw new UnsupportedOperationException("Operation not implemented yet.");
    }

    @Override
    @PostMapping
    public StudentDTORead createStudent(@RequestBody StudentDTOWrite student) {
        throw new UnsupportedOperationException("Operation not implemented yet.");
    }

    @Override
    @PutMapping("/{id}")
    public StudentDTORead updateStudent(@PathVariable Long id, @RequestBody StudentDTOWrite student) {
        throw new UnsupportedOperationException("Operation not implemented yet.");
    }

    @Override
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        throw new UnsupportedOperationException("Operation not implemented yet.");
    }

    @Override
    @PatchMapping("/{studentId}/modules/{moduleId}")
    public StudentDTORead addModuleToStudent(@PathVariable Long studentId, @PathVariable Long moduleId) {
        throw new UnsupportedOperationException("Operation not implemented yet.");
    }

    @Override
    @DeleteMapping("/{studentId}/modules/{moduleId}")
    public StudentDTORead removeModuleFromStudent(@PathVariable Long studentId, @PathVariable Long moduleId) {
        throw new UnsupportedOperationException("Operation not implemented yet.");
    }
}
