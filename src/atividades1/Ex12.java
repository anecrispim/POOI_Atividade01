package atividades1;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
        System.out.print("Informe seu sexo (F ou M): ");
		char sexo = entrada.next().charAt(0);
		
		System.out.print("Informe sua altura: ");
		float altura = entrada.nextFloat();
		
		double pesoIdeal = 0.0;
		if (sexo == 'F' || sexo == 'f') {
			pesoIdeal = (62.1 * altura) - 44.7;
		} else if (sexo == 'M' || sexo == 'm') {
			pesoIdeal = (72.7 * altura) - 58;
		} else {
			System.out.println("O programa n�o pode indentificar o sexo enviado.");
		}
		
		System.out.println("Seu peso ideal � "+ pesoIdeal + " kg");
		entrada.close();
	}

}
