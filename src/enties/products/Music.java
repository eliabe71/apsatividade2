package enties.products;
public abstract class Music extends Product{
    protected String autor;
    protected int numFaixas;

    public Music(String autor) {
        this.autor = autor;
    }

    public Music(String autor, String id, String titulo, String genero, boolean locado) {
        super(id, titulo, genero, locado);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }
    
}
