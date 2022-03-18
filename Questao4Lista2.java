package avaliacao;

public class Questao4Lista2 {
	public static void main(String[] args) {
		int numeros[]=new int[100];
		int temp=0;
		int cont=0;
		for(int i=0;i<100;i++) 
		{
			numeros[i]=((int)(50*Math.random()));
			System.out.println("O valor da posição "+(i+1)+" é:"+numeros[i]);
			temp=numeros[i];
			for(int a=temp;a>=1;a--)
			{
				if(temp%a==0)
				{
					cont++;
				}
			}
			if(cont==2)
			{
				System.out.println("Primo");
				cont=0;
			}
		}
	}
}
