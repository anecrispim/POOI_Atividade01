package atividades1;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		float numero = entrada.nextFloat();
		
		System.out.println("O número informado foi: " + numero);
		
		entrada.close();
	}

}
