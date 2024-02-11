

package repositorios;

import entidades.Personas;
import org.springframework.data.repository.CrudRepository;

public interface PersonasRepositorio extends CrudRepository<Personas, Integer>
{
    
    
}
