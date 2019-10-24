import java.util.Scanner;
import java.lang.Math;
public class Exercicio3{
	public static void main(String[]args){
	Scanner in = new Scanner (System.in);
	int M [][] = new int[3][4];
	int Soma=0;
	
	
	
	    for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			
			
			M [i][j] = in.nextInt();;
			M [i][j] = (int) (Math.random()*10);
			
	Soma = Soma + M[i][j];	if(j == (M.length-1)) {
			M[i][3] = Soma;
			
			System.out.println(M[i][3]);
			Soma = 0;
			}
		}
	}

   }
}