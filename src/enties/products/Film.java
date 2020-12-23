package enties.products;

public abstract class Film extends Product{
    protected int anoLancamaneto;
    protected int duracao;

    public Film(){}

    public Film(int anoLancamaneto, int duracao){
        this.anoLancamaneto = anoLancamaneto;
        this.duracao = duracao;
    }

    public Film(String id, String titulo, String genero, boolean locado,int anoLancamaneto, int duracao){
        super(id, titulo, genero, locado);
        this.anoLancamaneto = anoLancamaneto;
        this.duracao = duracao;
    }

    public int getAnoLancamento(){
        return this.anoLancamaneto;
    }
    public void setAnoLancamento(int anoLancamaneto){
        this.anoLancamaneto = anoLancamaneto;
    }

    public int getDuracao(){
        return this.duracao;
    }
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    
}
