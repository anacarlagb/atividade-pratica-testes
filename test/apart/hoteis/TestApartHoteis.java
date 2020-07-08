package apart.hoteis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class TestApartHoteis {

		@Test
	   	public void shouldValidoAte100Com2Inquilinos() {
	   		
			//int numeroQuarto, int numeroInquilino, int numeroDormitorio, int limiteCartao
	   		Quarto quarto = new Quarto(100, 2, 1, 2000);
	   		String checkDados = quarto.checkDados();
	   		
	   		assertEquals("Número de Quarto, Dormitórios e Inquilinos Válidos", checkDados);  
	   		
	   		ApartHoteis hoteis = new ApartHoteis(quarto);
	   		
	   		double precoPorInquilino= hoteis.getPrecoPorInquilino();
	   		assertEquals(100.00, precoPorInquilino);  
	   		
	   		
	   		String frequenciaPagamento = hoteis.getFrequenciaPagamento();
	   		assertEquals("MENSAL", frequenciaPagamento);  
	   	}
		
		@Test
	   	public void shouldInvalidoAte100() {
	   		
			//int numeroQuarto, int numeroInquilino, int numeroDormitorio, int limiteCartao
	   		Quarto quarto = new Quarto(100, 3, 1, 2000);
	   		String checkDados = quarto.checkDados();
	   		
	   		assertEquals("Número de Quarto ou Dormitórios ou Inquilinos ou limite do Cartao Inválidos", checkDados);  
	   		
	   	    quarto = new Quarto(-1, 3, 1, 2000);
	   		checkDados = quarto.checkDados();
	   		
	   		assertEquals("Número de Quarto ou Dormitórios ou Inquilinos ou limite do Cartao Inválidos", checkDados);  
	   		
	   		
	   		quarto = new Quarto(1, 1, 3, 2000);
	   		checkDados = quarto.checkDados();
	   		
	   		assertEquals("Número de Quarto ou Dormitórios ou Inquilinos ou limite do Cartao Inválidos", checkDados); 
	   	}
		
		//--------------------------------------------------//----------------------------------------------
		
		@Test
	   	public void shouldValidoAte300Com6Inquilinos() {
	   		
			//int numeroQuarto, int numeroInquilino, int numeroDormitorio, int limiteCartao
	   		Quarto quarto = new Quarto(299, 6, 2, 2000);
	   		String checkDados = quarto.checkDados();
	   		
	   		assertEquals("Número de Quarto, Dormitórios e Inquilinos Válidos", checkDados);  
	   		
	   		ApartHoteis hoteis = new ApartHoteis(quarto);
	   		
	   		double precoPorInquilino= hoteis.getPrecoPorInquilino();
	   		assertEquals(100.00, precoPorInquilino);  
	   		
	   		String frequenciaPagamento = hoteis.getFrequenciaPagamento();
	   		assertEquals("MENSAL", frequenciaPagamento);  
	   	}
		
		
		
		
		@Test
	   	public void shouldValidoAte300Com2Inquilinos() {
	   		
			//int numeroQuarto, int numeroInquilino, int numeroDormitorio, int limiteCartao
	   		Quarto quarto = new Quarto(300, 2, 2, 20000);
	   		String checkDados = quarto.checkDados();
	   		
	   		assertEquals("Número de Quarto, Dormitórios e Inquilinos Válidos", checkDados);  
	   		
	   		ApartHoteis hoteis = new ApartHoteis(quarto);
	   		
	   		double precoPorInquilino= hoteis.getPrecoPorInquilino();
	   		assertEquals(150.00, precoPorInquilino); 
	   		
	   		String frequenciaPagamento = hoteis.getFrequenciaPagamento();
	   		assertEquals("SEMESTRAL", frequenciaPagamento);  
	   	}
		
		
		@Test
	   	public void shouldInvalidoAte300() {
	   		
			//int numeroQuarto, int numeroInquilino, int numeroDormitorio, int limiteCartao
	   		Quarto quarto = new Quarto(300, 9, 1, 2000);
	   		String checkDados = quarto.checkDados();
	   		
	   		assertEquals("Número de Quarto ou Dormitórios ou Inquilinos ou limite do Cartao Inválidos", checkDados);  
	   		
	   	    quarto = new Quarto(-1, 3 , 4, 2000);
	   		checkDados = quarto.checkDados();
	   		
	   		assertEquals("Número de Quarto ou Dormitórios ou Inquilinos ou limite do Cartao Inválidos", checkDados);  
	   		
	   		
	   		quarto = new Quarto(1, 1, 2, 0);
	   		checkDados = quarto.checkDados();
	   		
	   		assertEquals("Número de Quarto ou Dormitórios ou Inquilinos ou limite do Cartao Inválidos", checkDados); 
	   	}
		
	
		//--------------------------------------------------//----------------------------------------------
		
		@Test
	   	public void shouldValidoAte500ComAte3Inquilinos() {
	   		
			//int numeroQuarto, int numeroInquilino, int numeroDormitorio, int limiteCartao
	   		Quarto quarto = new Quarto(500, 3, 3, 10000);
	   		String checkDados = quarto.checkDados();
	   		
	   		assertEquals("Número de Quarto, Dormitórios e Inquilinos Válidos", checkDados);  
	   		
	   		ApartHoteis hoteis = new ApartHoteis(quarto);
	   		
	   		double precoPorInquilino= hoteis.getPrecoPorInquilino();
	   		assertEquals(200.00, precoPorInquilino); 
	   		
	   		String frequenciaPagamento = hoteis.getFrequenciaPagamento();
	   		assertEquals("BIMENSAL", frequenciaPagamento);  
	   	}
		
		
		@Test
	   	public void shouldValidoAte500ComAte6Inquilinos() {
	   		
			//int numeroQuarto, int numeroInquilino, int numeroDormitorio, int limiteCartao
	   		Quarto quarto = new Quarto(500, 5, 3, 5000);
	   		String checkDados = quarto.checkDados();
	   		
	   		assertEquals("Número de Quarto, Dormitórios e Inquilinos Válidos", checkDados);  
	   		
	   		ApartHoteis hoteis = new ApartHoteis(quarto);
	   		
	   		double precoPorInquilino= hoteis.getPrecoPorInquilino();
	   		assertEquals(150.00, precoPorInquilino); 
	   		
	   		String frequenciaPagamento = hoteis.getFrequenciaPagamento();
	   		assertEquals("BIMENSAL", frequenciaPagamento);  
	   	}
		
		@Test
	   	public void shouldValidoAte500ComAte9Inquilinos() {
	   		
			//int numeroQuarto, int numeroInquilino, int numeroDormitorio, int limiteCartao
	   		Quarto quarto = new Quarto(500, 7, 3, 7000);
	   		String checkDados = quarto.checkDados();
	   		
	   		assertEquals("Número de Quarto, Dormitórios e Inquilinos Válidos", checkDados);  
	   		
	   		ApartHoteis hoteis = new ApartHoteis(quarto);
	   		
	   		double precoPorInquilino= hoteis.getPrecoPorInquilino();
	   		assertEquals(100.00, precoPorInquilino); 
	   		
	   		String frequenciaPagamento = hoteis.getFrequenciaPagamento();
	   		assertEquals("BIMENSAL", frequenciaPagamento);  
	   	}
		
		
		@Test
	   	public void shouldInvalidoAte500() {
	   		
			//int numeroQuarto, int numeroInquilino, int numeroDormitorio, int limiteCartao
	   		Quarto quarto = new Quarto(500, 9, 1, 2000);
	   		String checkDados = quarto.checkDados();
	   		
	   		assertEquals("Número de Quarto ou Dormitórios ou Inquilinos ou limite do Cartao Inválidos", checkDados);  
	   		
	   	    quarto = new Quarto(-1, 3 , 4, 2000);
	   		checkDados = quarto.checkDados();
	   		
	   		assertEquals("Número de Quarto ou Dormitórios ou Inquilinos ou limite do Cartao Inválidos", checkDados);  
	   		
	   		
	   		quarto = new Quarto(301, 10, 2, 1000);
	   		checkDados = quarto.checkDados();
	   		
	   		assertEquals("Número de Quarto ou Dormitórios ou Inquilinos ou limite do Cartao Inválidos", checkDados); 
	   	}
		
		
}
