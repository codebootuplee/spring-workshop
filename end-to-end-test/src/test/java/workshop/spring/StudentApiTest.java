package workshop.spring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import workshop.spring.api.StudentApi;
import workshop.spring.api.model.StudentDTORead;
import workshop.spring.api.model.StudentDTOWrite;
import workshop.spring.client.StudentApiRestClientImpl;
import workshop.spring.server.data.StudentRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StudentApiTest {

    @Autowired
    private StudentRepository studentRepository;

    @BeforeEach
    public void tearDown(){
        studentRepository.deleteAll();
    }

    @LocalServerPort
    private int port;

    @Test
    void canGetEmptyListOfStudents() {
        StudentApi api = createClient();
        assertThat(api.getAllStudents()).isEmpty();
    }

    @Test
    void canCreateStudent() {
        StudentApi api = createClient();
        StudentDTOWrite lee = new StudentDTOWrite(
                "Lee"
        );
        StudentDTORead actual = api.createStudent(lee);
        StudentDTORead expected = new StudentDTORead(
                actual.id(), "Lee"
        );
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void throws400WhenCreatingStudentAndNameIsNull() {
        StudentApi api = createClient();
        StudentDTOWrite lee = new StudentDTOWrite(null);
        assertThatThrownBy(() -> api.createStudent(lee))
                .isInstanceOf(HttpClientErrorException.class)
                .extracting("statusCode")
                .isEqualTo(HttpStatus.BAD_REQUEST);
    }

    @Test
    void throws404WhenStudentDoesNotExist() {
        StudentApi api = createClient();
        assertThatThrownBy(() -> api.getStudentById(1L))
                .isInstanceOf(HttpClientErrorException.class)
                .extracting("statusCode")
                .isEqualTo(HttpStatus.NOT_FOUND);
    }

    @Test
    void canGetStudentById() {
        StudentApi api = createClient();
        assertThrows(RestClientException.class, () -> api.getStudentById(1L));
    }

    @Test
    void canUpdateStudent() {
        StudentApi api = createClient();
        assertThrows(RestClientException.class, () -> api.updateStudent(1L, null));
    }

    @Test
    void canDeleteStudent() {
        StudentApi api = createClient();
        assertThrows(RestClientException.class, () -> api.deleteStudent(1L));
    }

    @Test
    void canAddModuleToStudent() {
        StudentApi api = createClient();
        assertThrows(RestClientException.class, () -> api.addModuleToStudent(1L, 1L));
    }

    @Test
    void canRemoveModuleFromStudent() {
        StudentApi api = createClient();
        assertThrows(RestClientException.class, () -> api.removeModuleFromStudent(1L, 1L));
    }

    private StudentApi createClient() {
        String baseUrl = "http://localhost:" + port;
        RestTemplate template = new RestTemplateBuilder().build();
        return new StudentApiRestClientImpl(template, baseUrl);
    }
}
