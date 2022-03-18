package avaliacao;

public class Questao7Lista2 {
	public static void main(String[]args) {
		int numeros[]=new int[100];
		int maior=1;
		int menor=100;
		for(int i=0; i<numeros.length; i++)
		{
			numeros[i]=((int)(100*Math.random()));
			System.out.println("O valor da posição "+(i+1)+" é:"+numeros[i]);
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
		System.out.println("O maior número do array é:"+maior);
		System.out.println("O menor número do array é:"+menor);
	}
}
