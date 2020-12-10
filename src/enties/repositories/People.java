package enties.repositories;

import java.util.Map;
import java.util.HashMap;
import enties.actors.Person;

public class People {
    Map<Integer,Person> pessoas;

    public People(){
        pessoas = new HashMap<Integer, Person>();
    }

    public void addPeople(Person person){
       // pessoas.put(person.getMatricula(), person);
    }

    public boolean removePeople(int id){
        for(int key : pessoas.keySet()){
            if(key == id){
                pessoas.remove(id);
                return true;
            }
        }
        return false;
    }

    public Person getPerson(int id){
        for(int key : pessoas.keySet()){
            if(key == id)
                return pessoas.get(id);
        }
        return null;
    }

}
