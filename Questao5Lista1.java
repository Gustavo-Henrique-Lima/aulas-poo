package avaliacao;
import java.util.Scanner;
public class Questao5Lista1 {
	public static void main(String[]args) {
		int numero=0;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Por favor, insira um n�mero: ");
		numero=entrada.nextInt();
		if(numero%2==0) {
			System.out.println("O n�mero digitado foi "+numero+" e ele � par");
		}else {
			System.out.println("O n�mero digitado foi "+numero+" e ele � �mpar");
		}
	}
}
