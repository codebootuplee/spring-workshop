package workshop.spring.server;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import workshop.spring.api.StudentApi;
import workshop.spring.api.model.StudentDTORead;
import workshop.spring.api.model.StudentDTOWrite;
import workshop.spring.server.data.StudentRepository;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentApiRestImpl implements StudentApi {
    private final StudentRepository repository;
    private final StudentMapper mapper;

    public StudentApiRestImpl(StudentRepository repository, StudentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    @GetMapping
    public List<StudentDTORead> getAllStudents() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }

    @Override
    @GetMapping("/{id}")
    public StudentDTORead getStudentById(@PathVariable Long id) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public StudentDTORead createStudent(@Valid @RequestBody StudentDTOWrite student) {
        return mapper.toDto(repository.save(mapper.toDao(student)));
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
