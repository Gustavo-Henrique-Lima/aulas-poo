package avaliacao;

public class Questao3Lista3 {
	public static void main(String[] args) {
		int [][] matriz1={{3,4,5},
				  {5,6,1}};
		int [][] matriz2={{10,1},
		  		  {3,5},
		          {0,21}};
		int qt_linhas_matriz1=0;
		int qt_colunas_matriz1=0;
		int qt_linhas_matriz2=0;
		int qt_colunas_matriz2=0;
		for(int linhas=0;linhas<matriz1.length;linhas++) 
		{
			qt_linhas_matriz1++;
		}
		for(int colunas=0;colunas<matriz1[0].length;colunas++)
		{
			qt_colunas_matriz1++;
		}
		for(int linhas=0;linhas<matriz2.length;linhas++) 
		{
			qt_linhas_matriz2++;
		}
		for(int colunas=0;colunas<matriz2[0].length;colunas++)
		{
			qt_colunas_matriz2++;
		}
		 if(qt_colunas_matriz1==qt_linhas_matriz2)
		 {
			 int [][] resultado= new int [qt_linhas_matriz1][qt_colunas_matriz2];
			 for(int i=0;i<qt_linhas_matriz1;i++)
			 {
				 for(int j=0;j<qt_colunas_matriz2;j++) 
				 {
					 for(int k=0;k<qt_linhas_matriz2;k++)
					 {
						 resultado[i][j]+=matriz1[i][j]*matriz2[k][j];
					 }
				 }
			 }
			 for(int linhas=0;linhas<qt_linhas_matriz1;linhas++)
			 {
				 for(int colunas=0;colunas<qt_colunas_matriz2;colunas++)
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

