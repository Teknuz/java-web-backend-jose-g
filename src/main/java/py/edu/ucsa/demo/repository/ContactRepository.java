package py.edu.ucsa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import py.edu.ucsa.demo.entity.Contact;

import java.util.Optional;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    Iterable<Long> id(Long id);
    Optional<Contact> findByEmail(String email);
}
