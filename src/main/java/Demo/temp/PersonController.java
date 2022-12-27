package Demo.temp;

import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping(value = "/persons/add")
    public String addPerson(@RequestBody Person person){
        return service.add(person);
    }

//    @RequestMapping("/ok")
//    public String okay(){
//        return service.okay();
//    }

    @GetMapping(value = "/persons/id/{id}")
    public Person getPerson(@PathVariable("id") int id){
        return service.getPersonById(id);
    }

    @GetMapping(value = "/persons/name/{name}")
    public Person searchPersons(@PathVariable("name") String name){
        return service.searchByName(name);
    }


}
