import java.util.ArrayList;

public class UsuarioProfessor extends Usuario{
    
    public UsuarioProfessor(String nome, ArrayList<Livro> livros){
        super(nome, livros);
    }

    public void bloqueiaLivro(){
        /*
         * if(livroExiste == true){
         *      statusBloqueio = true;
         *      livro.status() = indisponivel;
         * }
         */
    }

    public void desbloqueiaLivro(){
        /*
         * if(pessoa == pessoa que bloqueou){
         *      statusBloqueio = false;
         *      livro.status() = disponivel;
         * }
         */
    }

    @Override
    public int getCotaMaximaLivros(){
        return  5;
    }

    public int getPrazoMaximoEmprestimos(){
        return 14;
    }

}
