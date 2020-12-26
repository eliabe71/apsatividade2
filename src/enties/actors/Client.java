package enties.actors;

public class Client extends Person{
    private String endereco;
    private int idade;
    private char sexo;

    public Client(String nome, int matricula, String endereco, int idade, char sexo) {
        super(nome, matricula);
        this.endereco = endereco;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    
    
    public void setEndereco(String endereco){
            this.endereco = endereco;
    }
    public void setIdade(int idade ){
            if(idade <= 0 || idade > 200) return;
            this.idade =  idade;
    }
    public void setSexo(char sexo){
            this.sexo = sexo;
    }

    public int getIdade() {
            return idade;
    }

    public char getSexo() {
            return sexo;
    }

    public String getEndereco() {
            return endereco;
    }
        
    @Override
    public String toString() {
        return "Client [nome= "+this.nome+ ", matricula= "+this.matricula+ ", endereco= " 
                +this.endereco +", idade= "+this.idade+ ", sexo= "+ this.sexo + "]";
    } 
}
