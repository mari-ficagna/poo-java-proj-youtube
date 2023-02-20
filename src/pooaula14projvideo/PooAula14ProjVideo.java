package pooaula14projvideo;
// @author Mari 
 
public class PooAula14ProjVideo {

    public static void main(String[] args) {
        // Programa principal
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 - POO");
        v[1] = new Video ("Aula 2 - POO");
        v[2] = new Video ("Aula 3 - POO");
        //Aluno(String nome, int idade, String sexo, String login)
        Aluno a[] = new Aluno [2];
        a[0] = new Aluno("Marcos", 30, "M", "marcos30");
        a[1] = new Aluno ("Mari", 30, "F", "marif");
        //Visualizacao(Aluno espectador, Video filme)
        Visualizacao vis [] = new Visualizacao[5];
        vis[0] = new Visualizacao(a[0], v[0]);
        vis[1] = new Visualizacao(a[0], v[1]);
        vis[2] = new Visualizacao(a[0], v[2]);
        vis[3] = new Visualizacao(a[1], v[0]);
        
        v[0].play();
        v[0].like();
        vis[0].avaliar(10);
        vis[1].avaliar(9);
        vis[2].avaliar(8);
        vis[3].avaliar(9);
        
        System.out.println(vis[3].toString());
    }
}
