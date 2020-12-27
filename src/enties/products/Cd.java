package enties.products;
public class Cd extends Music{
    private boolean arranhado;
    private boolean duplo;
    
    public Cd(){}

    public Cd(boolean arranhado, boolean duplo, String autor) {
        super(autor);
        this.arranhado = arranhado;
        this.duplo = duplo;
    }

    public Cd(boolean arranhado, boolean duplo, String autor, String id, String titulo, String genero, boolean locado) {
        super(autor, id, titulo, genero, locado);
        this.arranhado = arranhado;
        this.duplo = duplo;
    }
    
    public void setArranhado(boolean arranhado ){
        this.arranhado = arranhado;
    }
    public  void setDuplo (boolean duplo){
        this.duplo = duplo;
    }
    public boolean getDuplo(){
        return this.duplo;
    }
    public boolean isArranhado(){
        return this.arranhado;
    }

    @Override
    public double calculaDiaria() {
        return 2.4;
    }

    @Override
    public String toString() {
        return "Cd [id= "+ this.id +", titulo= "+this.titulo+ ", genero= "+ this.genero+ ", "
                + "autor= "+this.autor+ ", numFaixas= "+this.numFaixas+
                ", locado= "+this.locado+ "arranhado=" + this.arranhado + ", duplo=" + this.duplo + "]";
    }
}
