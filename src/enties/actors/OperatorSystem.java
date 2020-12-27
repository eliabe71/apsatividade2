package enties.actors;
import enties.repositories.*;
import enties.products.*;
import java.util.Calendar;

public class OperatorSystem extends Employee{
    private Leases repoleases;
    private Products repoProduct;
    private People repoPeople;
    
    public OperatorSystem(){}

    public OperatorSystem(String nome, int matricula, String login, String senha) {
        super(nome, matricula, login, senha);
    }

    public OperatorSystem(Leases repoleases, Products repoProduct, People repoPeople, String nome, int matricula, String login, String senha) {
        super(nome, matricula, login, senha);
        this.repoleases = repoleases;
        this.repoProduct = repoProduct;
        this.repoPeople = repoPeople;
    }

    
    
    
    public boolean criarLocacao(String codigoProduto, int matriculaCliente,
        Calendar dataSaida, Calendar dataPrevistaEntrega){
        Location location = new Location(codigoProduto, matriculaCliente, dataSaida, dataPrevistaEntrega);
        return repoleases.add(location);
    }
    public void removeLocacao(String codigoProduto){
       repoleases.remove(codigoProduto);
    }
    public double fazerbaixa(String codigoProduto){
        Location newLocation = this.repoleases.get(codigoProduto);
        Product p = this.repoProduct.get(newLocation.getCodigoProduto());
        double v = (double) (newLocation.calcularPrecoDiaria(p) + newLocation.calcularMulta());
        this.repoleases.remove(codigoProduto);
        return v;
    }
    public boolean procuraProduto(String codigoProduto){
        if( repoProduct.get(codigoProduto) == null) return false;
        return true;

    }
    public boolean procuraCliente(int id){
        if (repoPeople.getPerson(id) == null && !(repoPeople.getPerson(id) instanceof Client)) 
            return false;
        return true ;
    }

    public Leases getRepoleases() {
        return repoleases;
    }

    public void setRepoleases(Leases repoleases) {
        this.repoleases = repoleases;
    }

    public Products getRepoProduct() {
        return repoProduct;
    }

    public void setRepoProduct(Products repoProduct) {
        this.repoProduct = repoProduct;
    }

    public People getRepoPeople() {
        return repoPeople;
    }

    public void setRepoPeople(People repoPeople) {
        this.repoPeople = repoPeople;
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
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "OperatorSystem [nome= "+this.nome+ ", matricula= "+this.matricula + "]";
    }
    
}
