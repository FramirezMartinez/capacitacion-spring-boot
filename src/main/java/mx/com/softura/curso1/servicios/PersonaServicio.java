package mx.com.softura.curso1.servicios;

import mx.com.softura.curso1.entidades.Personas;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import mx.com.softura.curso1.repositorios.PersonasRepositorio;
import mx.com.softura.curso1.to.PersonaTO;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class PersonaServicio {

    @Autowired 
    PersonasRepositorio repositorio;
        
@RequestMapping(method = RequestMethod.GET, path = "/personas")
    public List<Personas> obtenerPersonasBD(){

        List<Personas> lista = new ArrayList<>();
        repositorio.findAll().forEach(lista::add);


        return lista;
    }
  
    //misma ruta peor el metodo de adquisición es PUT, ellos me manden datos para yo gurdarlos
    @RequestMapping(method = RequestMethod.PUT,path="/personas")
    //que me mande losdatos con equivalentes a personas 
    public boolean guardarPersonasDB(@RequestBody Personas per){
        boolean resultado=true;
        
        try
        {
         repositorio.save(per);
        
        }
         catch(Exception e)
         {
          resultado=false;            
         }
        
        return resultado;
        
    }
    
   //misma ruta peor el metodo de adquisición es PUT, ellos me manden datos para yo gurdarlos
    @RequestMapping(method = RequestMethod.PUT,path="/editarpersonas")
    //que me mande losdatos con equivalentes a personas 
    public boolean EditarPersonasDB(@RequestBody Personas per){
        boolean resultado=true;
        
        try
        {
         repositorio.save(per);
        
        }
         catch(Exception e)
         {
          resultado=false;            
         }
        
        return resultado;
        
    }
    
 @RequestMapping(method = RequestMethod.GET, path = "/personas/{id}")
    public ResponseEntity<Personas> obtenerPersonaPorId(@PathVariable Integer id) {
        Optional<Personas> personaOptional = repositorio.findById(id);
        if (personaOptional.isPresent()) {
            return ResponseEntity.ok(personaOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    
    @RequestMapping(method = RequestMethod.DELETE,path="/personas")
    public boolean eliminarPeronasBD(@RequestBody Personas per){
     boolean resultado =true;
     try
     {
       repositorio.deleteById(per.getIdPersona());
     }catch(Exception e)
      {
      return false;       
      }
     return resultado;
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
