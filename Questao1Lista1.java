package avaliacao;
import java.util.Scanner;
public class Questao1Lista1 {
	public static void main(String[] args) {
		int num_inteiro=0;
		long num_long=0;
		float num_float=0f;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite o número inteiro: ");
		num_inteiro=entrada.nextInt();
		System.out.println("Digite o número long: ");
		num_long=entrada.nextLong();
		System.out.println("Digite o número float: ");
		num_float=entrada.nextFloat();
		System.out.printf("Os número inteiro foi %d, o número do tipo long foi %d, e o número do tipo float foi %f ",num_inteiro,num_long,num_float);
	}
}
