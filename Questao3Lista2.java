package avaliacao;
import java.util.Scanner;
public class Questao3Lista2 {
	public static void main(String[]args) {
		Scanner entrada= new Scanner(System.in);
		int numeros[]=new int[100];
		for(int i=0;i<numeros.length;i++) {
			numeros[i]=((int)(100*Math.random()));
			System.out.println("O valor da posição "+(i+1)+" é:"+numeros[i]);
		}
		for(int i = numeros.length-1; i>=0; i--)
		{
			System.out.println("Apresentação inversa "+(i+1)+(" :")+numeros[i]);
		}
	}
}
