package doWhile;
import java.util.*;
public class pessoas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    
	    int idade, i=1, f=1, qtde=1;
	    int[] faixa = new int [6];
	    
	        do {
	          System.out.println("Informe a idade do "+i+" usuário:");
	          idade = in.nextInt();
	          
	          if (idade <= 15) {
	            faixa[1] = faixa[1] + 1;
	          }else if (idade >= 16) {
	            faixa[2] = faixa[2] + 1;            
	          }else if (idade > 30) {
	            faixa[3] = faixa[3] +1;           
	          }else if (idade >=45) {
	            faixa[4] = faixa[4] + 1;  
	          }else if (idade > 60) {
	            faixa[5] = faixa[5] + 1; 
	          }
	          
	          i++;        
	        }while(i<=15);
	        
	        System.out.println("Pessoas em cada faixa etária:");
	        do {
	          System.out.println(qtde+"ª Faixa etária: "+faixa[qtde]);
	          qtde++;
	        }while(qtde<=5);
	        
	        do {
	          System.out.println("Porcentagem de pessoas em cada faixa:");
	          faixa[f] = 100*faixa[f]/15;
	          System.out.println(f+"ª faixa: "+faixa[f]+"%");
	          f++;
	        }while (f<=5);

	}

}
