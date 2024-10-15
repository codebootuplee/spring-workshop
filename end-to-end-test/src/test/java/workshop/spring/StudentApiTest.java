package workshop.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import workshop.spring.api.StudentApi;
import workshop.spring.client.StudentApiRestClientImpl;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StudentApiTest {

    @LocalServerPort
    private int port;

    @Autowired
    private ClientConfig clientConfig;

    @Test
    void testGetAllStudentsThrowsUnsupportedOperationException() {
        StudentApi api = createClient();
        assertThrows(RestClientException.class, api::getAllStudents);
    }

    @Test
    void testGetStudentByIdThrowsUnsupportedOperationException() {
        StudentApi api = createClient();
        assertThrows(RestClientException.class, () -> api.getStudentById(1L));
    }

    @Test
    void testCreateStudentThrowsUnsupportedOperationException() {
        StudentApi api = createClient();
        assertThrows(RestClientException.class, () -> api.createStudent(null));
    }

    @Test
    void testUpdateStudentThrowsUnsupportedOperationException() {
        StudentApi api = createClient();
        assertThrows(RestClientException.class, () -> api.updateStudent(1L, null));
    }

    @Test
    void testDeleteStudentThrowsUnsupportedOperationException() {
        StudentApi api = createClient();
        assertThrows(RestClientException.class, () -> api.deleteStudent(1L));
    }

    @Test
    void testAddModuleToStudentThrowsUnsupportedOperationException() {
        StudentApi api = createClient();
        assertThrows(RestClientException.class, () -> api.addModuleToStudent(1L, 1L));
    }

    @Test
    void testRemoveModuleFromStudentThrowsUnsupportedOperationException() {
        StudentApi api = createClient();
        assertThrows(RestClientException.class, () -> api.removeModuleFromStudent(1L, 1L));
    }

    private StudentApi createClient() {
        String baseUrl = "http://localhost:" + port;
        RestTemplate template = new RestTemplateBuilder().build();
        return new StudentApiRestClientImpl(template, baseUrl);
    }
}
