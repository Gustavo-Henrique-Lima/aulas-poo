package avaliacao;
import java.util.Scanner;
public class Questao2Lista1 {
	public static void main (String[]args) {
		 float peso,altura=0f;
		 Scanner entrada= new Scanner(System.in);
		 System.out.println("Por favor, insira o seu peso: ");
		 peso=entrada.nextFloat();
		 System.out.println("Por favor, insira a sua altura: ");
		 altura=entrada.nextFloat();
		 System.out.println("O valor do imc é: "+peso/(altura*altura));
	 }
}
