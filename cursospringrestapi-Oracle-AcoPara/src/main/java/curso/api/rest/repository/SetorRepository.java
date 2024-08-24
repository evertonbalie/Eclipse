package curso.api.rest.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import curso.api.rest.model.Pcsetor;

@Repository
public interface SetorRepository extends CrudRepository<Pcsetor, Long>{

}
