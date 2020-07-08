package pesquisa.binaria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class TestPesquisaBinaria {

	 	@Test
		public void shouldBuscaMeio() {
		 	int vet[] = new int[5];
		 	
		 	vet[0] = 1;
		 	vet[1] = 7;
		 	vet[2] = 4; 
		 	vet[3] = 8;
		 	vet[4] = 3;
		 	
			PesquisaBinaria busca = new PesquisaBinaria();
			
			int result = busca.buscaBinaria(vet, 4, 5);
			assertEquals(result, 2); 	 
		}
	 	
	 	
	 	@Test
		public void shouldBuscaNaoEncontrada() {
		 	int vet[] = new int[5];
		 	
		 	vet[0] = 1;
		 	vet[1] = 7;
		 	vet[2] = 4; 
		 	vet[3] = 8;
		 	vet[4] = 3;
		 	
			PesquisaBinaria busca = new PesquisaBinaria();
			
			int result = busca.buscaBinaria(vet, 20, 5);
			assertEquals(result, -1); 	 
		}
	 
}
