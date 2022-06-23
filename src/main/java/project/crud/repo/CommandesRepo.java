package project.crud.repo;

import org.springframework.data.repository.CrudRepository;
import project.crud.models.commandes;

public interface CommandesRepo extends CrudRepository<commandes, Long> {
}
