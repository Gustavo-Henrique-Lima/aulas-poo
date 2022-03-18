package avaliacao;
import java.util.Scanner;
public class Questao1Lista2 {
	public static void main(String[]args) {
		Scanner entrada= new Scanner(System.in);
		float notas[]=new float[5];
		float media=0f;
		for(int i=0;i<notas.length;i++) {
			System.out.println("Digite a "+(i+1)+" nota");
			notas[i]=entrada.nextFloat();
			media+=notas[i];
		}
		System.out.println("A média do aluno é: "+media/5);
	}
}
