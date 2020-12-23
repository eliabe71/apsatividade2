package enties.products;

public class Vhss extends Film{
    private boolean cores;

    public Vhss(boolean cores) {
        this.cores = cores;
    }

    public Vhss(int anoLancamaneto, int duracao, boolean cores) {
        super(anoLancamaneto, duracao);
        this.cores = cores;
    }

    public Vhss(String id, String titulo, String genero, boolean locado, int anoLancamaneto, int duracao,
            boolean cores) {
        super(id, titulo, genero, locado, anoLancamaneto, duracao);
        this.cores = cores;
    }

    @Override
    public double calculaDiaria(){
        return 2.3;
    }

    public boolean isCores() {
        return cores;
    }

    public void setCores(boolean cores) {
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "Blurays [id= "+ this.id + ", titulo= " + this.titulo + " genero=" + this.genero + 
        ", locado= " + this.locado + ", anoLancamento= "+this.anoLancamaneto +", duracao= "+this.duracao+
        ", cores= " + this.cores + "]";
    }
}
