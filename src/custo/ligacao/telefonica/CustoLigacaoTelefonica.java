package custo.ligacao.telefonica;

public class CustoLigacaoTelefonica {

	Ligacao ligacao;
	double custoChamada;
	
	public CustoLigacaoTelefonica(Ligacao ligacao) {
		this.ligacao = ligacao;
	} 
	
	public double calculaCusto() {
		
		if(ligacao.isChamadaLocal()) {
		   custoChamada = custoChamada + ligacao.getMinutos() * 4;
		}
		
		if((!ligacao.isChamadaLocal()) && ligacao.getCodigoDDDOrigem() == ligacao.getCodigoDDDDestino()) {
			custoChamada = custoChamada +  ligacao.getMinutos() *1;
		}
		
		if(ligacao.getCodigoDDDDestino() != ligacao.getCodigoDDDOrigem() && ligacao.getDistancia() <= 100) {
			custoChamada =  custoChamada +  ligacao.getMinutos() *2;
		}
		if(ligacao.getCodigoDDDDestino() != ligacao.getCodigoDDDOrigem() && ligacao.getDistancia() >  100) {
			custoChamada = custoChamada + ligacao.getMinutos() *3;
		}
		if((ligacao.getData().getHours() >= 8 && ligacao.getData().getHours() <= 12)
				|| (ligacao.getData().getHours() > 14 && ligacao.getData().getHours() <= 18)) {
			
			custoChamada = custoChamada +  ligacao.getMinutos() *2;
		}
		if(ligacao.getData().getHours() >= 12 && ligacao.getData().getHours() <= 14) {
			custoChamada = custoChamada +  ligacao.getMinutos() *1;
		}
		if((ligacao.getData().getHours() >= 0 && ligacao.getData().getHours() <= 8) ) {
			custoChamada = custoChamada -  ligacao.getMinutos() *1;
		}
		
		if(ligacao.getDia().equals("Saturday") || ligacao.getDia().equals("Sunday") ) {
			custoChamada = custoChamada -  ligacao.getMinutos() *1;
		}
		
		
		
		
		
		return custoChamada;
		
		
		
	}
}
