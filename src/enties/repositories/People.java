package enties.repositories;

import enties.actors.Client;
import enties.actors.Employee;
import enties.actors.Manager;
import enties.actors.OperatorSystem;
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
    
    public void listarClientes(){
        for(Person p : pessoas.values()){
            if(p instanceof Client)
                System.out.println(p);
        }
    }
    
     public void listarOperadores(){
        for(Person p : pessoas.values()){
            if(p instanceof OperatorSystem)
                System.out.println(p);
        }
    }
     
     public boolean loginManager(String login, String senha){
         for(Person p : pessoas.values()){
            if(p instanceof Manager)
                return login.equals(((Manager) p).getLogin()) && senha.equals(((Manager) p).getSenha());
         }
         return false;
     }
     
     public boolean loginOperatorSystem(String login, String senha){
         for(Person p : pessoas.values()){
            if(p instanceof OperatorSystem)
                return login.equals(((OperatorSystem) p).getLogin()) && senha.equals(((OperatorSystem) p).getSenha());
         }
         return false;
     }

    public Person getPerson(int id){
        return this.pessoas.get(id);
    }

    @Override
    public String toString() {
        return "People[" + "pessoas=" + pessoas + "]";
    }

}
