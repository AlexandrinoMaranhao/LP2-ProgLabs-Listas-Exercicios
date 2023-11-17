package poo.eventos;

import java.util.Date;

public abstract class Evento {
	public Evento(Date dt, double val);
	public Date getDataEvento();
	public double getValorEvento();
	public String getTipoEvento();
	public boolean isTipo(String st);
	public boolean equals(Evento e);
	public String toString();
}
