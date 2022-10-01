package project.sacolaApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.sacolaApi.model.Sacola;

@Repository
public interface SacolaRepository extends JpaRepository <Sacola, Long> {
}
