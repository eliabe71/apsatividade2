package enties.products;

public class Lps extends Music {
    private boolean raro ;
    
    public Lps(){}

    public Lps(boolean raro, String autor) {
        super(autor);
        this.raro = raro;
    }

    public Lps(boolean raro, String autor, String id, String titulo, String genero, boolean locado) {
        super(autor, id, titulo, genero, locado);
        this.raro = raro;
    }
    
    @Override
    public double calculaDiaria() {
        return 2.1;
    }

    public void setRaro(boolean raro) {
        this.raro = raro;
    }
    public boolean isRaro(){
        return this.raro;
    }
    
    @Override
    public String toString() {
        return "Cd [id= "+ this.id +", titulo= "+this.titulo+ ", genero= "+ this.genero+ ", "
                + "autor= "+this.autor+ ", numFaixas= "+this.numFaixas+
                ", locado= "+this.locado+ ", raro="+ this.raro +"]";
    }
}
