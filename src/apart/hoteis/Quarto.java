package apart.hoteis;

public class Quarto {

	private int numeroQuarto;
	private int numeroInquilino;
	private int numeroDormitorios;
	private double limiteCartao;
	
	
	
	public Quarto(int numeroQuarto, int numeroInquilino, int numeroDormitorio, int limiteCartao) {
		
		this.numeroQuarto = numeroQuarto;
		this.numeroInquilino = numeroInquilino;
		this.numeroDormitorios = numeroDormitorio;
		this.limiteCartao = limiteCartao;
		
		
	}
	
	public String checkDados() {
		
		if(numeroQuarto>= 1 && numeroQuarto<=100 && numeroQuarto>=1 && numeroDormitorios == 1 && numeroInquilino >=1 && numeroInquilino <=2) {
			
			if(limiteCartao >=1 && limiteCartao<=100000) {
				return "N�mero de Quarto, Dormit�rios e Inquilinos V�lidos"; 
			}
			
		}
		
		if(numeroQuarto>= 1 && numeroQuarto<=300 && numeroQuarto>=101 && numeroDormitorios == 2 && numeroInquilino >=1 && numeroInquilino <=6) {
			if(limiteCartao >=1 && limiteCartao<=100000) {
				return "N�mero de Quarto, Dormit�rios e Inquilinos V�lidos"; 
			}
		}
		
		if(numeroQuarto>= 1 && numeroQuarto<=500 && numeroQuarto>=301 && numeroDormitorios == 3 && numeroInquilino >=1 &&  numeroInquilino <=9) {
			if(limiteCartao >=1 && limiteCartao<=100000) {
				return "N�mero de Quarto, Dormit�rios e Inquilinos V�lidos"; 
			}
		}
		
		
		return "N�mero de Quarto ou Dormit�rios ou Inquilinos ou limite do Cartao Inv�lidos"; 
	}



	public int getNumeroQuarto() {
		return numeroQuarto;
	}



	public int getNumeroInquilino() {
		return numeroInquilino;
	}



	public int getNumeroDormitorios() {
		return numeroDormitorios;
	}



	public double getLimiteCartao() {
		return limiteCartao;
	}
	
	
	
	
}
