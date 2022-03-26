package avaliacao;

public class Questao3Lista3 {
	public static void main(String[] args) {
		int [][] matriz1={{3,4,5},
				  {5,6,1}};
		int [][] matriz2={{10,1},
		  		  {3,5},
		          {0,21}};
		 if(matriz1.length==matriz2[0].length)
		 {
			 int [][] resultado= new int [matriz1.length][matriz2[0].length];
			 for(int i=0;i<matriz1.length;i++)
			 {
				 for(int j=0;j<matriz2[0].length;j++) 
				 {
					 for(int k=0;k<matriz2.length;k++)
					 {
						 resultado[i][j]+=matriz1[i][j]*matriz2[k][j];
					 }
				 }
			 }
			 for(int linhas=0;linhas<matriz1.length;linhas++)
			 {
				 for(int colunas=0;colunas<matriz2[0].length;colunas++)
				 {
					 System.out.print(resultado[linhas][colunas]+" ");
				 }
				 System.out.println("");
			 }
		 }else {
			 System.out.println("As matrizes não atendem os requisitos para multiplicação");
		 }
  }
}

