package br.com.alura.forum.repository;

import br.com.alura.forum.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Author, Long> {
    Optional<Author> findByEmail(String email);
}
