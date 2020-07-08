package custo.ligacao.telefonica;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ligacao {

	private double minutos;
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
		
		this.minutos = minutos;
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
	
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        String dia = simpleDateformat.format(data);
        
        return dia;
      
	}
	
	
	
	
}
