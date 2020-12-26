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
    
    public boolean adcionarCliente(Person p){
        return repo.addPeople(p);
    }
    public boolean adicionarProduto(Product p){
        return product.add(p);
    }
    public boolean adicionarOperador(Person person){
        return repo.addPeople(person);
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
        if(product.get(id) == null )
            return false;
        
        System.out.println(product.get(id));
        return true;
    }
    public boolean procurarOperador(int id){
        if(repo.getPerson(id)== null ) 
            return false;
        
        System.out.println(repo.getPerson(id));
        return true;
    }
    public boolean procurarCliente(int id){
        if(repo.getPerson(id)== null )
            return false;
        
        System.out.println(repo.getPerson(id));
        return true;
    }

    public People getRepo() {
        return repo;
    }

    public void setRepo(People repo) {
        this.repo = repo;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getSenha() {
        return senha;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    

    @Override
    public String toString() {
        return "Manager [nome= "+this.nome+ ", matricula= "+this.matricula+ "repo= " 
                + this.repo + ", products= "+this.product+ "]";
    }
}
