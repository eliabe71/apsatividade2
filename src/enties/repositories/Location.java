package enties.repositories;

import java.util.Calendar;
import java.util.Date;


public class Location {
    private int codigoProduto;
    private int matriculaCliente;
    private Calendar dataSaida;
    private Calendar dataPrevistaEntrega;


    public Location(){}

    public Location(int codigoProduto, int matriculaCliente, Calendar dataSaida, Calendar dataPrevistaEntrega){
        this.codigoProduto = codigoProduto;
        this.matriculaCliente = matriculaCliente;
        this.dataSaida = dataSaida;
        this.dataPrevistaEntrega = dataPrevistaEntrega;
    }

    public double calcularMulta(){
        Date dataAtual = new Date(System.currentTimeMillis());
        int diferenca = diffInDays(dataPrevistaEntrega.getTime(), dataAtual);

        if(diferenca > 0)
            return diferenca*1.2;

        return 0;
    }

    public int getCodigoProduto(){
        return this.codigoProduto;
    }
    public void setCodigoProduto(int codigoProduto){
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
}