package avaliacao;

public class Questao5Lista2 {
	public static void main  (String[]args) {
		int numeros[]=new int[100];
		for(int i=0; i<numeros.length; i++)
		{
			numeros[i]=((int)(100*Math.random()));
			System.out.println("O valor da posição "+(i+1)+" é:"+numeros[i]);
			if(numeros[i]%2!=0)
			{
				System.out.println(numeros[i]+" é ímpar!");
			}
		}	
	}
}
