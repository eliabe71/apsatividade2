package enties.repositories;

import enties.products.Product;
import java.util.Calendar;
import java.util.Date;


public class Location {
    private String codigoProduto;
    private int matriculaCliente;
    private Calendar dataSaida;
    private Calendar dataPrevistaEntrega;


    public Location(){}

    public Location(String codigoProduto, int matriculaCliente, Calendar dataSaida, Calendar dataPrevistaEntrega){
        this.codigoProduto = codigoProduto;
        this.matriculaCliente = matriculaCliente;
        this.dataSaida = dataSaida;
        this.dataPrevistaEntrega = dataPrevistaEntrega;
    }

    public double calcularMulta(){
        Date dataAtual = new Date(System.currentTimeMillis());
        int diferenca = diffInDays(dataAtual, dataPrevistaEntrega.getTime());

        if(diferenca > 0)
            return diferenca*1.2;

        return 0;
    }
    
    public double calcularPrecoDiaria(Product p){
        double taxaBasica = 1;
        Date dataAtual = new Date(System.currentTimeMillis());
        int diferenca = diffInDays(dataAtual, dataSaida.getTime());

        if(diferenca > 0)
            return taxaBasica + diferenca*p.calculaDiaria();

        return taxaBasica;
    }

    public String getCodigoProduto(){
        return this.codigoProduto;
    }
    public void setCodigoProduto(String codigoProduto){
        this.codigoProduto = codigoProduto;
    }

    public int getMatriculaCliente(){
        return this.matriculaCliente;
    }
    public void setMatriculaCliente(int matriculaCliente){
        this.matriculaCliente = matriculaCliente;
    }

    public Calendar getDataSaida(){
        return this.dataSaida;
    }
    public void setDataSaida(Calendar dataSaida){
        this.dataSaida = dataSaida;
    }

    public Calendar getDataPrevistaEntrega(){
        return this.dataPrevistaEntrega;
    }
    public void setDataPrevistaEntrega(Calendar dataPrevistaEntrega){
        this.dataPrevistaEntrega = dataPrevistaEntrega;
    }

    public static int diffInDays(Date date1, Date date2) {
		int MILLIS_IN_DAY = 86400000;

		Calendar c1 = Calendar.getInstance();
		c1.setTime(date1);
		c1.set(Calendar.MILLISECOND, 0);
		c1.set(Calendar.SECOND, 0);
		c1.set(Calendar.MINUTE, 0);
		c1.set(Calendar.HOUR_OF_DAY, 0);

		Calendar c2 = Calendar.getInstance();
		c2.setTime(date2);
		c2.set(Calendar.MILLISECOND, 0);
		c2.set(Calendar.SECOND, 0);
		c2.set(Calendar.MINUTE, 0);
		c2.set(Calendar.HOUR_OF_DAY, 0);
		return (int) ((c1.getTimeInMillis() - c2.getTimeInMillis()) / MILLIS_IN_DAY);
    }

    @Override
    public String toString() {
        return "Location [codigoProduto=" + codigoProduto + ", dataPrevistaEntrega=" + dataPrevistaEntrega
                + ", dataSaida=" + dataSaida + ", matriculaCliente=" + matriculaCliente + "]";
    }
    
}