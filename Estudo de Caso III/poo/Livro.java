package poo.gestaodeacervo;

import java.util.Calendar;
import java.util.GregorianCalendar;

import poo.gestaodeusuarios.Usuario;

import java.util.Date;

public class Livro extends Item {
	private String titulo;
	private Usuario retiradoPor;
	private Date dataEmprestimo;
	private Date dataDevolucao;
	private Usuario bloqueadoPor;
	private Date dataBloqueio;
	private Date dataDesbloqueio;

	public Livro(String titulo){
		super(titulo);
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
		return !(this.retiradoPor == null);
	}
	
	public boolean isEmAtraso() {
		Date hoje =  new Date();
		if(this.dataEmprestimo.after(hoje)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean bloqueia(Usuario u, int prazo){
		GregorianCalendar cal = new GregorianCalendar();
		
		if(isDisponivel() && u.isProfessor() == true){
			this.bloqueadoPor = u;
			this.dataBloqueio = cal.getTime();
			if(prazo <= 20){
			cal.add(Calendar.DATE, prazo);
			}
			this.dataDesbloqueio = cal.getTime();
			return true;
		}else{
			System.err.println("Livro indisponível para bloqueio");
			return false;
		}
	  }
	

	public boolean desbloqueia(Usuario u){
		if(u == bloqueadoPor){
			this.bloqueadoPor = null;
			return true;
		} else{
			System.err.println("Livro indisponível por estar bloqueado");
			return false;
		}
	}
	
	public boolean empresta(Usuario u, int prazo) {
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
	
	public boolean devolve(Usuario u) {
		if(u == this.retiradoPor){
			this.retiradoPor = null;
			return true;
		} else{
			return false;
		}
	}

	public String toString(){
		if (isDisponivel()) {
			return this.titulo + "está disponível";
		} else if(isEmprestado()){
			return this.titulo + "\nRetirado por: " + retiradoPor 
			+ "\nData de Empréstimo: " + dma(dataEmprestimo) 
			+ "\nData de Devolução: " + dma(dataDevolucao);
		}
		else if(this.isBloqueado()){
			return this.titulo + "\nBloqueado por: "+ this.bloqueadoPor
			+ "\nData de Bloqueio: " + dma(dataBloqueio)
			+ "\n Data de Desbloqueio: " + dma(dataDesbloqueio);
		} else if (this.isEmAtraso()){
			return this.titulo + "está em atraso, devolva-o para o acervo";
		}else {
			return super.toString();
		}
	}
	
	private String dma(Date dt){
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(dt);
		return cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH)) + "/" + cal.get(Calendar.YEAR);
	}
}

/*
if(isBloqueado()){
 * return this.titulo + "\nBloqueado por: "+ this.bloqueadoPor
			 + "\n Data de desbloqueio: " + this.dataDesbloqueio; }
 */