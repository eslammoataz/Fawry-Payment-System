package Demo.temp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonService {

    List<Person> personList = new ArrayList<>();

    public String add(Person person) {
        for (Person person1 : personList) {
            if(person1.id == person.id){
                return "Id already exists";
            }
        }
        personList.add(person);
        return "Added Successfully";
    }

    public Person getPersonById(int id) {
        return personList.get(id);
    }
//    public String okay(){
//        return "Handshake";
//    }

    public Person searchByName(String name) {
        for (Person person1 : personList) {
            if(person1.name.equals(name)){
                return person1;
            }
        }
        return null;
    }
}
