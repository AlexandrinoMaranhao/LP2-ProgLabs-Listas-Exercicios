import java.util.ArrayList;
import java.util.Iterator;

public class Usuario {
    private String nome;
    private ArrayList<Livro> livrosRetirados;
    /*
     *  Tipo usuario       qtd de livros
     *  Usuarios comuns = 2
     *  Alunos = 3
     *  Professores 5
     * 
     */
     
    public Usuario(String nome, ArrayList<Livro> livros){
        this.nome = nome;
        this.livrosRetirados = new ArrayList<>(livros);
    }
    public String getNome(){
        return this.nome;
    }

    public ArrayList<Livro> getLivros(){
        return this.livrosRetirados;
    }

    public void setNumeroDeLivros(Livro livro){
         livrosRetirados.remove(livro);
    }


    public void emprestaLivro(){
        /*
             * if(Livro livro.status() == disponivel){
             *      (Usuario livrosRetirados.add())
             * }
        */
    }

    public void devolveLivro(){
        /*
             * 
             * if(Livro livro.status() == disponivel){
             *      (Usuario livrosRetirados.remove())
             * }
        */
    }

    public int getCotaMaximaLivros(){
        return 2;
    }

    public int getPrazoMaximoEmprestimos(){
        return 4;
    }
}
