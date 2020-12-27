package enties.actors;

public abstract class Employee extends Person{
    protected String login;
    protected String senha;

    public Employee(){}
    
    public Employee(String nome, int matricula, String login, String senha) {
        super(nome, matricula);
        this.login = login;
        this.senha = senha;
    }

    
    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
