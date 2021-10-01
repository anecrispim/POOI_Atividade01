package atividades1;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Farenheit: ");
		float tempF = entrada.nextFloat();
		
		double tempC = (tempF - 32) / 1.8;
		
		System.out.println(tempF + " Farenheit é igual a "+ tempC + " graus Celsius");
		entrada.close();

	}

}
