package enties.actors;

public class Client extends Person{
        private String endereco;
        private  int idade;
        private  char  sexo;
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
}
