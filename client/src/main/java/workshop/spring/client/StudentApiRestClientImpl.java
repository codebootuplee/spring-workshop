package workshop.spring.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import workshop.spring.api.StudentApi;
import workshop.spring.api.model.StudentDTORead;
import workshop.spring.api.model.StudentDTOWrite;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class StudentApiRestClientImpl implements StudentApi {

    private final RestTemplate restTemplate;
    private final String baseUrl;

    public StudentApiRestClientImpl(RestTemplate restTemplate, String baseUrl) {
        this.restTemplate = restTemplate;
        this.baseUrl = baseUrl;
    }

    private String buildUrl(String path) {
        return baseUrl + "/students" + path;
    }

    @Override
    public List<StudentDTORead> getAllStudents() {
        String url = buildUrl("");
        ResponseEntity<StudentDTORead[]> response = restTemplate.getForEntity(url, StudentDTORead[].class);
        return Arrays.asList(Objects.requireNonNull(response.getBody()));
    }

    @Override
    public StudentDTORead getStudentById(Long id) {
        String url = buildUrl("/" + id);
        return restTemplate.getForObject(url, StudentDTORead.class);
    }

    @Override
    public StudentDTORead createStudent(StudentDTOWrite student) {
        String url = buildUrl("");
        HttpEntity<StudentDTOWrite> request = new HttpEntity<>(student);
        return restTemplate.postForObject(url, request, StudentDTORead.class);
    }

    @Override
    public StudentDTORead updateStudent(Long id, StudentDTOWrite student) {
        String url = buildUrl("/" + id);
        HttpEntity<StudentDTOWrite> request = new HttpEntity<>(student);
        ResponseEntity<StudentDTORead> response = restTemplate.exchange(url, HttpMethod.PUT, request, StudentDTORead.class);
        return response.getBody();
    }

    @Override
    public String deleteStudent(Long id) {
        String url = buildUrl("/" + id);
        restTemplate.delete(url);
        return "Student with ID " + id + " deleted.";
    }

    @Override
    public StudentDTORead addModuleToStudent(Long studentId, Long moduleId) {
        String url = buildUrl("/" + studentId + "/modules/" + moduleId);
        HttpEntity<Void> request = new HttpEntity<>(null);
        ResponseEntity<StudentDTORead> response = restTemplate.exchange(url, HttpMethod.PATCH, request, StudentDTORead.class);
        return response.getBody();
    }

    @Override
    public StudentDTORead removeModuleFromStudent(Long studentId, Long moduleId) {
        String url = buildUrl("/" + studentId + "/modules/" + moduleId);
        ResponseEntity<StudentDTORead> response = restTemplate.exchange(url, HttpMethod.DELETE, null, StudentDTORead.class);
        return response.getBody();
    }
}
