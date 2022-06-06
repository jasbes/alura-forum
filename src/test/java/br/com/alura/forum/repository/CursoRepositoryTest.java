package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Curso;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CursoRepositoryTest {

    @Autowired
    private CursoRepository cursoRepository;

    @Test
    public void findByNome() {
        String nome = "HTML 5";

        Curso curso = cursoRepository.findByNome(nome);

        assertNotNull(nome);

        assertEquals(nome, curso.getNome());
    }

    @Test
    public void findByNomeNotFound() {
        String nome = "JPA";

        Curso curso = cursoRepository.findByNome(nome);

        assertNull(curso);
    }
}