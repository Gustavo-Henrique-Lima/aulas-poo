package avaliacao;

public class Questao6Lista2 {
	public static void main  (String[]args) {
		int numeros[]=new int[100];
		for(int i=0; i<numeros.length; i++)
		{
			numeros[i]=((int)(100*Math.random()));
			System.out.println("O valor da posi��o "+(i+1)+" �:"+numeros[i]);
			if(numeros[i]%2==0)
			{
				System.out.println(numeros[i]+" � par!");
			}
		}
		}
}

