package project.crud.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.crud.models.Client;

@Repository
public interface ClientRepo extends CrudRepository<Client, Long> {

}
