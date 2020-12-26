package enties.actors;

public abstract class Employee extends Person{
    protected String login;
    protected String senha;

    public Employee(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public abstract boolean efetuarLogin(String login,String senha);
    
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
