import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		int M[][]=new int[4][4];
		int i=0, j, a, contador=0, h=0,  vitorias=0,y , help=0;
		int N[]=new int[16];
		for(a=0;a<M.length;a++){
			int rand=(int)((Math.random()*74)+1);
			boolean existe=false;
			for(int grr=0;grr<a;grr++){
				if(N[grr]==rand){
					existe=true;
					break;
				}
				else{
					existe=false;
				}
				} 
				if(!existe){
				N[a]=rand; 
				}
				else{
				a--;
			}
        }
		          for(i=0, help=0; i<=3; i++) {
			      for(j=0; j<=3; j++) {
				  M[i][j]=N[help];
				  help++;
			}
		}
		          for(i=0; i<=3; i++) {
			      for(j=0; j<=3; j++) {
				  System.out.print("[ "+M[i][j]+" ]");
			 	  if(j==3) {
					System.out.print("\n");
				}
			}
		}
		          System.out.println(" ");
		          while(h==0) {
		        	   System.out.println("digite um numero sorteado ( dentre 0 a 75):");
		        	   y=in.nextInt();
			    for(i=0; i<=3; i++) {
				for(j=0; j<=3; j++) {
					if(y==M[i][j]) {
						vitorias++;
					}
				}
			}
			if(vitorias==16) {
				h+=1;
			}
			else {
				h+=0;
			}
			contador++;
		}
		System.out.println("     ");
		System.out.println("bingo !!!");
		System.out.println("    ");
		System.out.println("o usuario ganhou na "+contador+" escolha de numero");
	}
}