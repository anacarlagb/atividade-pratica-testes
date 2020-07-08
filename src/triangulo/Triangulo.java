package triangulo;

public class Triangulo {

	private int tamanhoLados;
	private int ladoA;
	private int ladoB;
	private int ladoC;
	private String tipo;
	
	public String getTipo(int ladoA, int ladoB, int ladoC) {
			
		
		if(ladoA < 1 || ladoA > 200 
				|| ladoB < 1 || ladoB > 200 
				|| ladoC < 1 || ladoC > 200) {
			
			return "Tamanho de lado inválido";
		}
		
		if (ladoA==ladoB && ladoB==ladoC) {
			return "Equilatero";
		}
		if(ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
			return "Isósceles";
		}
		if(ladoA != ladoB || ladoB != ladoC || ladoA != ladoC) {
			return "Escaleno";
		}
		
		return "";
	}
	
	
}
