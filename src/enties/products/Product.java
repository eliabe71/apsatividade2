package enties.products;

import org.graalvm.compiler.lir.amd64.vector.AMD64VectorBinary.AVXBinaryConstFloatOp;

public abstract class Product {
    protected String id;
    protected String titulo;
    protected String genero;
    protected boolean locado;

    public Product(){}

    public Product(String id, String titulo, String genero, boolean locado){
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.locado = locado;
    }

    public abstract double calculaDiaria();

    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public boolean isLocado(){
        return this.locado;
    }
    public void setLocado(boolean locado){
        this.locado = locado;
    }

    public abstract String toString();
    
}
