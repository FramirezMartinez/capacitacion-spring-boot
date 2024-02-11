package mx.com.softura.curso1.servicios;

import entidades.Personas;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import repositorios.PersonasRepositorio;
import to.PersonaTO;

@RestController
public class PersonaServicio {

    @Autowired // haciendo una inyención  componente  que ya esta en una memoria en un servidor 
    PersonasRepositorio repositorio;

    //metodo nuevo 
    public List<Personas> obtenerPersonasDB()
    {
        List<Personas> lista=new ArrayList<>();
        //instancia hace un select *  ,   regresame todo,  recorre cada , entre ()por cada registro esta lista  
        repositorio.findAll().forEach(lista::add);
        
        
        return lista;
    }
    
    public PersonaServicio() {
    }
    
    @RequestMapping("/saludo")
    public String saludar() {
        return "Hola mundo SpringBoot";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/obtenerTodasPersonas")
    public List<PersonaTO> obtenerPersona() {
       //NATIVA DBC
       //API JPA Mapea la tabla con map, ayuda  a gurdar, editar, eliminar
       
       //agregar dos dependencias para el API MySQL
        
        
        List<PersonaTO> personas = new ArrayList<>();

        PersonaTO persona1 = new PersonaTO("Juan", "Sachez", "Martinze", "CURPJUAN", (byte) 20);
        persona1.setCiudadNacimineto("Tlaxcala");
        PersonaTO persona2 = new PersonaTO("Jose", "Perez", "Hernandez", "CURPJOSE", (byte) 30);
        persona2.setCiudadNacimineto("Puebla");
        personas.add(persona1);
        personas.add(persona2);

        return personas;
    }
    
    
}
