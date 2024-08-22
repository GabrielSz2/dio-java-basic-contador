package app;

import java.util.Locale;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro parâmetro: ");
		int parameterOne = sc.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parameterTwo = sc.nextInt();
		
		try {
			count(parameterOne, parameterTwo);
		
		}catch (ContadorException e) {
			System.out.println(e.getMessage());
		}
		
	}
	static void count(int parameterOne, int parameterTwo ) throws ContadorException {
		if(parameterOne > parameterTwo) {
			throw new ContadorException("O segundo parâmetro deve ser maior que o primeiro");
		}
		else {
			int TheCount = parameterTwo - parameterOne;
			
			for(int i=1; i <= TheCount; i++) {
				System.out.println("imprimindo o numero " + i);
			}
		}
	}
}