package enties.actors;
import enties.repositories.*;
import enties.products.*;
import java.util.Calendar;

public class OperatorSystem extends Employee{
    private Leases repoleases;
    private Products repoProduct;
    private People repoPeople;
    public OperatorSystem(String login , String senha,Leases repoleases,Products repoProduct,People repoPeople) {
        this.login = login;
        this.senha = senha;
        this.repoleases = repoleases;
        this.repoProduct = repoProduct;
        this.repoPeople = repoPeople;
    }
    public boolean criarLocacao(int codigoProduto, int matriculaCliente,
                        Calendar dataSaida, Calendar dataPrevistaEntrega){
        Location location = new Location(codigoProduto, matriculaCliente, dataSaida, dataPrevistaEntrega);
           if(repoleases.add(location) ) return true;
           return false;
    }
    public void removeLocacao(int id){
       repoleases.remove(id);
    }
    public float fazerbaixa(int id){
        Location newLocation = repoleases.get(id);
        Product p = repoProduct.get(newLocation.getCodigoProduto());
        repoleases.remove(id);
        float v = (float) (p.calculaDiaria() + newLocation.calcularMulta());
        return v;
    }
    public Product procuraProduto(int codigoProduto){
        return repoProduct.get(codigoProduto);

    }
    public Person procuraClente(int id){
        return repoPeople.getPerson(id);

    }
}
