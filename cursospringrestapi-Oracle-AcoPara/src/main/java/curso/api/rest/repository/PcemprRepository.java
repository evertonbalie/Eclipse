package curso.api.rest.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import curso.api.rest.model.Pcempr;


@Repository
public interface PcemprRepository extends CrudRepository<Pcempr, String>{

}
