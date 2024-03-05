

package mx.com.softura.curso1.repositorios;

import mx.com.softura.curso1.entidades.Personas;
import org.springframework.data.repository.CrudRepository;

public interface PersonasRepositorio extends CrudRepository<Personas, Integer>
{
   
    
}
