package project.sacolaApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.sacolaApi.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
