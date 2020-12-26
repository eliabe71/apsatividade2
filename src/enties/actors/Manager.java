package enties.actors;
import enties.actors.*;
import enties.products.*;
import enties.repositories.*;
public class Manager extends Employee{
    People repo;
    Products product;
    public Manager(People repo,Products product){

        this.repo = repo;
        this.product = product;

    }
    public void adcionarCliente(Person p){
        repo.addPeople(p);
    }
    public void adicionarProduto(Product p){
        product.add(p);
    }
    public void adicionarOperador(Person person){
        repo.addPeople(person);
    }
    public void listarClientes(){

    }
    public void listarProdutos(){

    }
    public void listarOperadores(){

    }
    public void procurarProduto(int id){
        repo.getPerson(id);
    }
    public void procurarOperador(int id){
        repo.getPerson(id);
    }
    public void procurarCliente(int id){
        repo.getPerson(id);
    }
}
