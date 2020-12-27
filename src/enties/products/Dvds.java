package enties.products;

public class Dvds extends Film {
    private boolean arranhado;

    public Dvds() {
    }

    public Dvds(int anoLancamaneto, int duracao, boolean arranhado) {
        super(anoLancamaneto, duracao);
        this.arranhado = arranhado;
    }

    public Dvds(String id, String titulo, String genero, boolean locado, int anoLancamaneto, int duracao, 
                boolean arranhado) {
        super(id, titulo, genero, locado, anoLancamaneto, duracao);
        this.arranhado = arranhado;
    }

    @Override
    public double calculaDiaria() {
        return 2.65;
    }

    public boolean isArranhado() {
        return arranhado;
    }

    public void setArranhado(boolean arranhado) {
        this.arranhado = arranhado;
    }
    
    @Override
    public String toString() {
        return "Dvds [id= "+ this.id + ", titulo= " + this.titulo + " genero=" + this.genero + 
        ", locado= " + this.locado + ", anoLancamento= "+this.anoLancamaneto +", duracao= "+this.duracao+
        ", arranhado= " + this.arranhado + "]";
    }

}
