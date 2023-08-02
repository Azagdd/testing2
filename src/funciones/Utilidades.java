package funciones;


/**
 * Clase genérica que implementa una serie de métodos de utilidades
 * @author David
 *
 */
public class Utilidades {

	
	/**
	 * Método estático de la clase que dice si un numero entero pasado como 
	 * parámetro es par o impar. El 0 es considerado par
	 * @param num int el número a comprobar
	 * @return true si es par o false en caso contrario
	 */
	static boolean esPar(int num) {
		if (num%2 ==0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Método estático de la clase que comprueba si un número pasado como parámetro es
	 * primo o no. Un número es primo si es divisible por 1 y por el mismo. El 1 no es primo
	 * 
	 * @param num es el numero a comprobar
	 * @return true si es primo false en caso contrario
	 */
	static boolean esPrimo(int num) {
		if (num<2) return false;
		for (int i=2; i<num;i++) {
			if (num%i==0) return false;
		}
		return true;
	}
	
	/**
	 * Método estático de la clase que clacula el factorial de un número.
	 * El máximo factorial que se puede calcular es el de 20,  en otro caso 
	 * habrá un overflow
	 * @param n int con el numero a calcular
	 * @return long con el factorial del número 
	 * @throws ArithmeticException se lanza cuando el numero pasado es negativo
	 */
	static public long factorial(int n) {
        long producto=1;
        int i;
        if (n<0) 
        	throw new ArithmeticException(
        			"Debe ser positivo");
        for (i = 2; i <= n; i++) {
        	producto =producto* i;
        }
        return producto;
    }
	
	/**
	 * Método estático de la clase que rota todas las datos del vector una casilla
	 * hacia la derecha, de tal manera que si tenemos el vector [1,2,3,4,5] quedaría 
	 * de la siguiente manera [5,1,2,3,4]
	 * Importante: El vector pasado como parámetro queda modificado
	 * 
	 * @param v int [] el vactor a rotar
	 */
	static public void rotarDerecha(int v[]) {
		int aux = v[v.length-1];
		for (int i = v.length-1; i >=1; i--) {
			v[i]=v[i-1];
		}
		v[0]=aux;
	}
	
	
	/**
	 * Método estático de la clase que devuelve el vector inverso al pasado como parámetro
	 * Así, si introducen el vector [1,2,3,4,5] el vector resultante será [5,4,3,2,1]
	 * 
	 * @param v el vector a invertir
	 * @return int [] el vector invertido
	 */
	static public int [] inversa( int v[]) {
		
		int inv[] = new int[v.length];
		for (int i = 0,j =v.length-1; i < inv.length; i++,j--) {
			inv[i] = v[j];
		}
		return inv;
	}
	
	
	
	
}
