package avaliacao;
import java.util.Scanner;
public class Questao3Lista1 {
	public  static void main(String[]args) {
		float base_maior,base_menor,altura=0f;
		float area=0f;
		Scanner entrada= new Scanner (System.in);
		System.out.println("Por favor, insira o valor da base maior em cm: ");
		base_maior=entrada.nextFloat();
		System.out.println("Por favor, insira o valor da base menor em cm: ");
		base_menor=entrada.nextFloat();
		System.out.println("Por favor, insira a altura em cm: ");
		altura=entrada.nextFloat();
		area=(base_maior+base_menor)*altura/2;
		System.out.println("A área do trapézio em cm² é: "+area);
	}
}
