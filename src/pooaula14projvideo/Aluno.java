package pooaula14projvideo;
//@author Mari 
 
public class Aluno extends Pessoa {
    //Atributos
    private String login;
    private int totAssistido;
    //Metodo construtor
    public Aluno(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    //Metodos publicos
    public void viuMaisUm(){
        
    }
    //Metodos sobreposicao
    @Override
    public void ganharExp() {
        
    }
    //Metodos especiais
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "\n*****Aluno*****\n" + super.toString()+ "\nlogin: " + login + "\nVideos Assistidos: " + totAssistido+ "\n";
    }
    
}
