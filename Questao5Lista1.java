package avaliacao;
import java.util.Scanner;
public class Questao5Lista1 {
	public static void main(String[]args) {
		int numero=0;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Por favor, insira um número: ");
		numero=entrada.nextInt();
		if(numero%2==0) {
			System.out.println("O número digitado foi "+numero+" e ele é par");
		}else {
			System.out.println("O número digitado foi "+numero+" e ele é ímpar");
		}
	}
}
