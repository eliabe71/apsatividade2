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
        repo.listarClientes();
    }
    public void listarProdutos(){
        product.listarProdutos();
    }
    public void listarOperadores(){
        repo.listarOperadores();
    }
    public boolean procurarProduto(String id){

        if(product.get(id)== null ) return false;
        return true;
    }
    public boolean procurarOperador(int id){
        if(repo.getPerson(id)== null ) return false;
        return true;

    }
    public boolean procurarCliente(int id){
        if(repo.getPerson(id)== null ) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Manager [nome= "+this.nome+ ", matricula= "+this.matricula+ "repo= " 
                + this.repo + ", products= "+this.product+ "]";
    }
}
