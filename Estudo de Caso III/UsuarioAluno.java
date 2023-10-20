import java.util.ArrayList;
import java.util.Date;

public class UsuarioAluno extends Usuario{
    private Date dataExpiracaoCadastro;

    public UsuarioAluno(String nome, ArrayList<Livro> livros, Date dataExpCad){
        super(nome, livros);
        this.dataExpiracaoCadastro = dataExpCad;

    }

    public Date getDataExpiracaoCadastro(){
        return this.dataExpiracaoCadastro;
    }

    public void renovaCadastro(){
            /*
             * renove seu cartão da biblioteca :)
             */
    }

    @Override
    public int getCotaMaximaLivros(){
        return  3;
    }

    public int getPrazoMaximoEmprestimos(){
        return 7;
    }

}
