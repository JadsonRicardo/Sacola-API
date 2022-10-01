package project.sacolaApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.sacolaApi.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
