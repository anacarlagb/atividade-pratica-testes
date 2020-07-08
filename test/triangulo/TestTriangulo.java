package triangulo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestTriangulo {

    @Test
	public void shouldGetTipoEscaleno() {
		
		Triangulo triangulo = new Triangulo();
		
		String tipo = triangulo.getTipo(3, 4, 6);
		
		assertEquals("Escaleno", tipo); 
    	 
	}
    
    @Test
   	public void shouldGetTipoEquilatero() {
   		
   		Triangulo triangulo = new Triangulo();
   		
   		String tipo = triangulo.getTipo(3, 3, 3);
   		
   		assertEquals("Equilatero", tipo);  
   	}
    
    @Test
   	public void shouldGetTipoIsosceles() {
   		
   		Triangulo triangulo = new Triangulo();
   		
   		String tipo = triangulo.getTipo(3, 3, 5);
   		
   		assertEquals("Isósceles", tipo);  
   	}
    
    @Test
   	public void shouldGetTipoValido() {
   		
   		Triangulo triangulo = new Triangulo();
   		
   		String tipo = triangulo.getTipo(1, 3, 200);
   		
   		assertEquals("Escaleno", tipo);  
   	}
    
    @Test
   	public void shouldGetTipoInValido() {
   		
   		Triangulo triangulo = new Triangulo();
   		
   		String tipo = triangulo.getTipo(1, 3, 201);
   		
   		assertEquals("Tamanho de lado inválido", tipo);
   		
   		tipo = triangulo.getTipo(0, 3, 20);
   		assertEquals("Tamanho de lado inválido", tipo);
   	}
    
    
    
    
    
}
