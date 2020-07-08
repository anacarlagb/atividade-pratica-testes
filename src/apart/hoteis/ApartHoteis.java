package apart.hoteis;

public class ApartHoteis {

	private double precoPorInquilino;
	private String frequenciaPagamento;
	private Quarto quarto;
	
	public ApartHoteis(Quarto quarto) {
		this.quarto = quarto;
		
	}
	
	
	public double getPrecoPorInquilino() {
		
		if(quarto.getNumeroQuarto() >= 1 && quarto.getNumeroQuarto() <= 100) {
			this.precoPorInquilino = 100.00;
		}
		
		//---------------------------------------------//--------------------------------------------------------//
		if(quarto.getNumeroQuarto() >= 101 && quarto.getNumeroQuarto() <= 300 && quarto.getNumeroInquilino() <=3) {
			this.precoPorInquilino = 150.00;
		}
		
		if(quarto.getNumeroQuarto() >= 101 && quarto.getNumeroQuarto() <= 300 && quarto.getNumeroInquilino() > 3 && quarto.getNumeroInquilino() <= 6) {
			this.precoPorInquilino = 100.00;
		}
		//---------------------------------------------//--------------------------------------------------------//
		if(quarto.getNumeroQuarto() >= 301 && quarto.getNumeroQuarto() <= 500 &&  quarto.getNumeroInquilino()<=3) {
			this.precoPorInquilino = 200.00;
		}
		if(quarto.getNumeroQuarto() >= 301 && quarto.getNumeroQuarto() <= 500 && quarto.getNumeroInquilino() >= 4 && quarto.getNumeroInquilino() <= 6) {
			this.precoPorInquilino = 150.00;
		}
		if(quarto.getNumeroQuarto() >= 301 && quarto.getNumeroQuarto() <= 500 && quarto.getNumeroInquilino() > 6 && quarto.getNumeroInquilino() <= 9) {
			this.precoPorInquilino = 100.00;
		}
		
		return precoPorInquilino;
	}
	
	public String getFrequenciaPagamento() {
		
		if(quarto.getLimiteCartao() <  5000) {
			return "MENSAL";
		}
		if(quarto.getLimiteCartao() >= 5000 && quarto.getLimiteCartao() <= 10000) {
			return "BIMENSAL";
		}
		if(quarto.getLimiteCartao() > 10000) {
			return "SEMESTRAL";
		}
		
		return "Valor de limite inválido";
	}

}
