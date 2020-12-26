package enties.actors;
import enties.actors.*;
import enties.products.*;
import enties.repositories.*;
public class Manager extends Employee{
    private People repo;
    private Products product;

    public Manager(People repo, String login, String senha) {
        super(login, senha);
        this.repo = repo;
    }

    public Manager(People repo, Products product, String login, String senha) {
        super(login, senha);
        this.repo = repo;
        this.product = product;
    }
    
    
    @Override
    public boolean efetuarLogin(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
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

    @Override
    public String toString() {
        return "Manager [nome= "+this.nome+ ", matricula= "+this.matricula+ "repo= " 
                + this.repo + ", products= "+this.product+ "]";
    }
}
