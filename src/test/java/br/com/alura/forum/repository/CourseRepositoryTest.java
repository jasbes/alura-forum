package br.com.alura.forum.repository;

import br.com.alura.forum.model.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void findByNome() {
        String name = "HTML 5";

        Course course = courseRepository.findByName(name);

        assertNotNull(name);

        assertEquals(name, course.getName());
    }

    @Test
    public void findByNomeNotFound() {
        String nome = "JPA";

        Course course = courseRepository.findByName(nome);

        assertNull(course);
    }
}