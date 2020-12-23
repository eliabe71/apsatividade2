package enties.products;

import java.util.Arrays;

public class Blurays extends Film {
    private String[] idiomas = new String[2];

    public Blurays() {
    }

    public Blurays(String[] idiomas) {
        this.idiomas = idiomas;
    }

    public Blurays(int anoLancamaneto, int duracao, String[] idiomas) {
        super(anoLancamaneto, duracao);
        this.idiomas = idiomas;
    }

    public Blurays(String id, String titulo, String genero, boolean locado, int anoLancamaneto, int duracao,
                  String[] idiomas) {
        super(id, titulo, genero, locado, anoLancamaneto, duracao);
        this.idiomas = idiomas;
    }

    @Override
    public double calculaDiaria() {
        return 3.0;
    }

    public String[] getIdiomas() {
        return this.idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    @Override
    public String toString() {
        return "Blurays [id= "+ this.id + ", titulo= " + this.titulo + " genero=" + this.genero + 
        ", locado= " + this.locado + ", anoLancamento= "+this.anoLancamaneto +", duracao= "+this.duracao+
        ", idiomas= " + Arrays.toString(idiomas) + "]";
    }
 
}
