package enties.repositories;

import java.util.Map;
import java.util.HashMap;
import enties.actors.Person;

public class People {
    private Map<Integer,Person> pessoas;

    public People(){
        this.pessoas = new HashMap<>();
    }

    public boolean addPeople(Person person){
       this.pessoas.put(person.getMatricula(), person);
       return true;
    }

    public boolean removePeople(int id){
        return this.pessoas.remove(id) != null;
    }

    public Person getPerson(int id){
        return this.pessoas.get(id);
    }

}
