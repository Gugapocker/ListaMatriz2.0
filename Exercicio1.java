import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[]args) {
		
		
		Scanner ler = new Scanner (System.in);
		int M[][] = new int [4][4];
		int soma=2;
		
		
		
		
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				M[i][j] = soma;
				soma*=2; 
				System.out.println(M[i][j]);
			}
		}
	}
}