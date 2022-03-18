package avaliacao;
import java.util.Scanner;
public class Questao2Lista2 {
	public static void main(String[]args) {
		Scanner entrada=new Scanner(System.in);
		int numeros[]=new int[10];
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Por favor, insira o "+(i+1)+" número: ");
			numeros[i]=entrada.nextInt();
		}
		System.out.println("Números na ordem inversa: ");
		for(int i=numeros.length-1;i>=0;i--) {
			System.out.println(numeros[i]);
		}
	}
}
