import java.util.Scanner;
import java.lang.Math;
public class Exercicio2 {
	public static void main(String[]args) {
		Scanner ler = new Scanner (System.in);
		
		
		
		
		int[][] M= new int [3][3];
		int m=0,n=0,a=0,b=0;
		
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				M[i][j] = (int) (Math.random()*15);
				if(M[i][j] >M[m][n]) {
					m=i;
					n=j;
				}
				else if(M[i][j] <M[a][b]) {
					a=i;
					b=j;
				}
				
				
			}
			
		
		
		
		}
		
		System.out.println( +M[0][0]+ "    " +M[0][1]+ "     " +M[0][2] );
	    System.out.println( +M[1][0]+ "    " +M[1][1]+ "     " +M[1][2] );
	    System.out.println( +M[2][0]+ "    " +M[2][1]+ "     " +M[2][2] );
	    System.out.println("                                          " );
	    System.out.println("maior é  "+M[m][n]+" e o menor é "+M[a][b]);
	
	}
	}
	
