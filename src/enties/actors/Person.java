package enties.actors;

public abstract class Person {
    protected String nome;
    protected int matricula;

    public Person(){}
    
    public Person(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }  
    
    public int getMatricula(){
        return this.matricula;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
}
