package poo.gestaodeacervo;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import poo.gestaodeusuarios.Usuario;
public abstract class Item {
	private String titulo;
	protected Usuario retiradoPor;
	protected Date dataEmprestimo;
	protected Date dataDevolucao;
	protected Usuario bloqueadoPor;
	protected Date dataBloqueio;
	protected Date dataDesbloqueio;

	public Item(String titulo){
		this.titulo = titulo;
	}
	public String getTitulo(){
		return this.titulo;
	}
	public boolean isDisponivel(){
		Date hoje = new Date();
		return this.retiradoPor == null && (this.bloqueadoPor ==  null || this.dataDesbloqueio.before(hoje));
	}
	public boolean isBloqueado(){
		Date hoje  = new Date();
		return this.retiradoPor == null && !(this.bloqueadoPor == null) && !(this.dataDesbloqueio.before(hoje));
	}
	public boolean isEmprestado(){
		return !(isDisponivel());
	}
	
	public boolean isEmAtraso() {
		Date hoje = new Date();
		return dataEmprestimo.after(hoje);
	}
	
	public boolean bloqueia(Usuario u, int prazo) {
		GregorianCalendar cal = new GregorianCalendar();
		
		if(isDisponivel() && u.isProfessor()){
			this.bloqueadoPor = u;
			this.dataBloqueio = cal.getTime();
			if(prazo <= 20){
			cal.add(Calendar.DATE, prazo);
			}
			this.dataDesbloqueio = cal.getTime();
			return true;
		}else{
			System.err.println("Item indisponível para bloqueio");
			return false;
		}
	}
	
	public boolean desbloqueia(Usuario u) {
		if(u == bloqueadoPor){
			this.bloqueadoPor = null;
			return true;
		} else{
			System.err.println("Item indisponível por estar bloqueado");
			return false;
		}
	}
	
	public boolean empresta(Usuario u, int prazo){
		GregorianCalendar cal = new GregorianCalendar();

		if(this.isDisponivel()){
			this.retiradoPor = u;
			this.dataEmprestimo = cal.getTime();
			cal.add(Calendar.DATE, prazo);
			this.dataDevolucao = cal.getTime();
			return true;
		} else
		return false;

	}

	public boolean devolve(Usuario u){
		if(u == this.retiradoPor){
			this.retiradoPor = null;
			return true;
		} else{
			return false;
		}
	}
	
	
  public String toString(){   
	 return this.titulo;
  }
}