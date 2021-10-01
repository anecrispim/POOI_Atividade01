package atividades1;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		float numero1 = entrada.nextFloat();
		
		System.out.print("Informe outro número: ");
		float numero2 = entrada.nextFloat();
		
		float soma = numero1 + numero2;
		
		System.out.println("Soma: " + soma);
		
		entrada.close();
	}

}
