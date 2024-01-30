package divisores;

import java.util.Scanner;

public class Ejercicio1 {

	public static final String MENSAJE = "Número de divisores: ";
	public static Scanner lectura;

	public static void main(String[] args) {
		int numeroJuanLuis;
		long numDivisores;
		lectura = new Scanner(System.in);
		
		numeroJuanLuis = lectura.nextInt();
		numDivisores = primeDivisors(numeroJuanLuis);
		
		System.out.println(MENSAJE + numDivisores);
		lectura.close();
	}

	private static long primeDivisors(long number) {
		int cont = 0;
		
		for(long i=2; i<=number; i++) {
			if(number%i==0 && isPrime(i)) {
				cont++;
			}
		}
		
		return cont;
	}
	
	public static boolean isPrime(long number) {
		boolean esPrimo = true;
		for(int i=2; i<number; i++) {
			long modulo = number%i;
			if(modulo == 0) {
				esPrimo = false;
				break;
			}
		}
		return esPrimo;
	}
}
