package avaliacao;
import java.util.Scanner;
public class Questao1Lista1 {
	public static void main(String[] args) {
		int num_inteiro=0;
		long num_long=0;
		float num_float=0f;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite o n�mero inteiro: ");
		num_inteiro=entrada.nextInt();
		System.out.println("Digite o n�mero long: ");
		num_long=entrada.nextLong();
		System.out.println("Digite o n�mero float: ");
		num_float=entrada.nextFloat();
		System.out.printf("Os n�mero inteiro foi %d, o n�mero do tipo long foi %d, e o n�mero do tipo float foi %f ",num_inteiro,num_long,num_float);
	}
}
