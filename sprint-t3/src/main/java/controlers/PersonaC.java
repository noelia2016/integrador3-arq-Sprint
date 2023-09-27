package controlers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import modelos.Persona;
import repos.PersonaRepo;

@RestController
// @RequestMapping("/p")
public class PersonaC {
    @Qualifier("PerRep")
    @Autowired
    private final PersonaRepo personaRepo;

    public PersonaC(@Qualifier("PerRep") PersonaRepo personaRepo){
        this.personaRepo=personaRepo;
    }

    @GetMapping("/persona")
    public Iterable<Persona> persona() {return personaRepo.findAll();}

    @PostMapping("/cargar")
    public void cargar(){
        Persona p=new Persona((long)3,"tres");
        personaRepo.save(p);
    }
    
}
