package atividades1;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe sua altura: ");
		float altura = entrada.nextFloat();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal é "+ pesoIdeal + " kg");
		entrada.close();
	}

}
