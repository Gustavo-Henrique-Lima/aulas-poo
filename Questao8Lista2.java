package avaliacao;

public class Questao8Lista2 {
	public static void main(String[] args) {
		int num[]=new int[100];
		float media=0;
		for(int i =0; i<num.length; i++)
		{
			num[i]=((int)(100*Math.random()));
			media+=num[i];
		}
		System.out.printf("A média aritimética dos números é: %.2f", media/100);
	}
}
