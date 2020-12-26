package enties.products;
public class Cd extends Music{
    private  boolean arranhado;
    private boolean duplo;
    public void setArranhado(boolean arranhado ){
        this.arranhado = arranhado;
    }
    public  void setDuplo (boolean duplo){
        this.duplo = duplo;
    }
    public boolean getDuplo(){
        return this.duplo;
    }
    public boolean getArranhado(){
        return this.arranhado;
    }
}
