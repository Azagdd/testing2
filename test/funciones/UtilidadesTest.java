package funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilidadesTest {

	@Test
	void testEsPar() {
		assertAll(
				()->assertTrue(Utilidades.esPar(80), "El 80 es un número par"),
				()->assertFalse(Utilidades.esPar(37), "El 37 es impar"),
				()->assertTrue(Utilidades.esPar(0), "El 0 es par")
				);
	}

	@Test
	void testEsPrimo() {
		assertAll(
				()->assertFalse(Utilidades.esPrimo(1)),
				()->assertFalse(Utilidades.esPrimo(0)),
				()->assertFalse(Utilidades.esPrimo(8)),
				()->assertTrue(Utilidades.esPrimo(7)),
				()->assertFalse(Utilidades.esPrimo(-4))
				);
	}
	
	@Test
	void testFactorial() {
		assertAll(
				()->assertEquals(1, Utilidades.factorial(0),"El factorial de 0 es 1"),
				()->assertEquals(6, Utilidades.factorial(3), " el factorial de 3 es 6"),
				()->assertThrows(ArithmeticException.class, ()->Utilidades.factorial(-4),
						"EL factorial no está definido para numeros negativos"),
				()->assertEquals(2432902008176640000L, Utilidades.factorial(20), 
						"el mayor factorial que se puede calcular es el de 20")
				);
	}
	
	@Test
	void testRotarDerecha() {
		
		/*int v[] = new int[5];
		v[0]=1;
		v[1]=2;
		...
		*/
		int v[] = {1,2,3,4,5};
		int rotado[] = {5,1,2,3,4};
		Utilidades.rotarDerecha(v);
		
		
//		for (int i =0 ; i< 5; i++ )
//			assertEquals(v[i],rotado[i]);
		assertArrayEquals(rotado, v);
		
		int v2[] = {1};
		int rotado2[] = {1};
		Utilidades.rotarDerecha(v2);
		assertArrayEquals(rotado2, v2);

	}
	
	@Test
	void testInversa() {
		int v[] = {1,2,3,4,5};
		int inv[] = {5,4,3,2,1};
		
//		int res [] = Utilidades.inversa(v);
//		assertArrayEquals(inv, res);
		
		assertArrayEquals(inv, Utilidades.inversa(v));
		
	}
	
	
}
