package avaliacao;

public class Questao7Lista2 {
	public static void main(String[]args) {
		int numeros[]=new int[100];
		int maior=1;
		int menor=100;
		for(int i=0; i<numeros.length; i++)
		{
			numeros[i]=((int)(100*Math.random()));
			System.out.println("O valor da posi��o "+(i+1)+" �:"+numeros[i]);
			maior=numeros[i];
			menor=numeros[i];
		}
		for(int i=0; i<numeros.length; i++) {
			if(numeros[i]>maior) {
				maior=numeros[i];
			}else if(numeros[i]<menor) {
				menor=numeros[i];
			}
		}
		System.out.println("O maior n�mero do array �:"+maior);
		System.out.println("O menor n�mero do array �:"+menor);
	}
}
