import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Livro> livrosRetirados;


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

    public void registraNovoUsuario(){

    }

    public void emprestaLivro(){

    }

    public void devolveLivro(){

    }
}
