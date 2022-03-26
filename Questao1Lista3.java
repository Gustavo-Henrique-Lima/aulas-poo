package avaliacao;

public class Questao1Lista3 {

	public static void main(String[] args) {
		int [][] matriz1={{3,4},
				  {5,6},
				  {7,8}};
		int [][] matriz2={{10,1},
		  		  {3,5},
		          {0,21}};
		 if(matriz1.length==matriz2.length && matriz1[0].length==matriz2[0].length)
		 {
			 int [][] resultado= new int [matriz1.length][matriz1[0].length];
			 for(int linhas=0;linhas<resultado.length;linhas++)
			 {
			
				 for(int colunas=0;colunas<matriz1[0].length;colunas++)
				 {
					resultado[linhas][colunas]=matriz1[linhas][colunas]+matriz2[linhas][colunas];
					System.out.print(resultado[linhas][colunas]+ " ");
				 }
				 System.out.println();
			 }
		
	    }else {
	    	System.out.println("As matrizes não atendem os requisitos para soma");
	    }
 }
}