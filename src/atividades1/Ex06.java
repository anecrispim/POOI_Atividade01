package atividades1;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o raio de um circulo: ");
		double raio = entrada.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A area do circulo é de: "+ area);
		entrada.close();
	}

}
