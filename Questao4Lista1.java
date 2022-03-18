package avaliacao;
import java.util.Scanner;
public class Questao4Lista1 {
	public static void main (String[]args) {
		Scanner entrada= new Scanner(System.in);
		int num_um,num_dois=0;
		System.out.println("Por favor, insira o primeiro número: ");
		num_um=entrada.nextInt();
		System.out.println("Por favor, insira o segundo número: ");
		num_dois=entrada.nextInt();
		if(num_um>num_dois) {
			System.out.println("O maior número é o primeiro");
		}else {
			System.out.println("O maior número é o segundo");
		}
	}
}
