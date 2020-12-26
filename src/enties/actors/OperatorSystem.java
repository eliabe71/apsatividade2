package enties.actors;
import enties.repositories.*;
import enties.products.*;
import java.util.Calendar;

public class OperatorSystem extends Employee{
    private Leases repoleases;
    private Products repoProduct;
    private People repoPeople;

    
    
    public OperatorSystem(Leases repoleases, Products repoProduct, People repoPeople, String login, String senha) {
        super(login, senha);
        this.repoleases = repoleases;
        this.repoProduct = repoProduct;
        this.repoPeople = repoPeople;
    }
    
    
    public boolean criarLocacao(String codigoProduto, int matriculaCliente,
        Calendar dataSaida, Calendar dataPrevistaEntrega){
        Location location = new Location(codigoProduto, matriculaCliente, dataSaida, dataPrevistaEntrega);
        return repoleases.add(location);
    }
    public void removeLocacao(int id){
       repoleases.remove(id);
    }
    public double fazerbaixa(int id){
        Location newLocation = repoleases.get(id);
        Product p = repoProduct.get(newLocation.getCodigoProduto());
        repoleases.remove(id);
        double v = (double) (p.calculaDiaria() + newLocation.calcularMulta());
        return v;
    }
    public Product procuraProduto(String codigoProduto){
        return repoProduct.get(codigoProduto);

    }
    public Person procuraClente(int id){
        return repoPeople.getPerson(id);

    }
    
    @Override
    public boolean efetuarLogin(String login, String senha) {
        return login.equals(this.login) && senha.equals(this.senha);
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
    public String toString() {
        return "OperatorSystem [nome= "+this.nome+ ", matricula= "+this.matricula+ "repoleases=" 
                + repoleases + ", repoProduct=" + repoProduct + ", repoPeople=" + repoPeople + "]";
    }
    
}
