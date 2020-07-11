package custo.ligacao.telefonica;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ligacao {

	private long minutos;
	private int codigoDDDOrigem;
	private int codigoDDDDestino;
	private boolean chamadaLocal;
	private int distancia;
	private Date data;
	
	
	
	public Ligacao(double minutos, 
				int codigoDDDOrigem, 
				int codigoDDDDestino, 
				boolean chamadaLocal,
				int distancia,
				Date data) {
		
		this.minutos = (long) Math.round(minutos);
		this.codigoDDDOrigem = codigoDDDOrigem;
		this.codigoDDDDestino = codigoDDDDestino;
		this.chamadaLocal = chamadaLocal;
		this.distancia = distancia;
		this.data = data;
	}
	
	public double getMinutos() {
		return minutos;
	}
	public int getCodigoDDDOrigem() {
		return codigoDDDOrigem;
	}
	public int getCodigoDDDDestino() {
		return codigoDDDDestino;
	}
	public boolean isChamadaLocal() {
		return chamadaLocal;
	}
	public int getDistancia() {
		return distancia;
	}
	public Date getData() {
		return data;
	}
	
	public String getDia() {
	
		DateFormat formatter = new SimpleDateFormat("EEEE", Locale.ENGLISH);
	    return formatter.format(data);
	}
	
	
	
	
}
