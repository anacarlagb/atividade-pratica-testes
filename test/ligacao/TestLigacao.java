package ligacao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import custo.ligacao.telefonica.CustoLigacaoTelefonica;
import custo.ligacao.telefonica.Ligacao;


public class TestLigacao {

	  
	    @Test
		public void shouldGetLigacaoLocal() throws ParseException {
	    	
	    	SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy HH:MM:ss");
	    	Date data = sdf1.parse("1/07/2020 16:00:04");
			
			Ligacao ligacao = new Ligacao(23.5, 23, 23, true, 10, data);
			
			CustoLigacaoTelefonica custoLigacao = new CustoLigacaoTelefonica(ligacao);
			
			double custo = custoLigacao.calculaCusto();
			
			assertEquals(144.0, custo); 	 
		}
	    
	    
	   
	    @Test
		public void shouldGetLigacaoInterubana() throws ParseException {
	    	
	    	SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy HH:MM:ss");
	    	Date data = sdf1.parse("1/07/2020 16:00:04");
			
			Ligacao ligacao = new Ligacao(23.5, 23, 23, false, 10, data);
			
			CustoLigacaoTelefonica custoLigacao = new CustoLigacaoTelefonica(ligacao);
			
			double custo = custoLigacao.calculaCusto();
			
			assertEquals(72, custo); 	 
		}
	    
	  
	    @Test
		public void shouldGetDDDDiferenteDistanciaMenorQue100() throws ParseException {
	    	
	    	SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy HH:MM:ss"); 
	    	Date data = sdf1.parse("1/07/2020 19:00:04");
			
			Ligacao ligacao = new Ligacao(20.6, 24, 23, false, 99, data);
			
			CustoLigacaoTelefonica custoLigacao = new CustoLigacaoTelefonica(ligacao);
			
			double custo = custoLigacao.calculaCusto();
			
			assertEquals(42, custo); 	 
		}
	    
	    @Test
		public void shouldGetDDDDiferenteDistanciaMaiorQue100() throws ParseException {
	    	
	    	SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy HH:MM:ss"); 
	    	Date data = sdf1.parse("1/07/2020 19:00:04");
			
			Ligacao ligacao = new Ligacao(20.6, 24, 23, false, 299, data);
			
			CustoLigacaoTelefonica custoLigacao = new CustoLigacaoTelefonica(ligacao);
			
			double custo = custoLigacao.calculaCusto();
			
			assertEquals(63, custo); 	  
		}
	    
	    
	   
	    @Test
		public void shouldGetDescontoHorarioEntre0e8Horas() throws ParseException {
	    	
	    	SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy HH:MM:ss"); 
	    	Date data = sdf1.parse("1/07/2020 06:00:04");
			
			Ligacao ligacao = new Ligacao(20.6, 24, 23, false, 299, data);
			
			CustoLigacaoTelefonica custoLigacao = new CustoLigacaoTelefonica(ligacao);
			
			double custo = custoLigacao.calculaCusto();
			
			assertEquals(42, custo); 	  
		}
	    
	    
	   
	    
	    
	    
}
