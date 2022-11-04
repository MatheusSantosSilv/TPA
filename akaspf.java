package teste;
import java.util.Scanner;
public class akaspf {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int anoAtual,idade,anoNasc,i = 1,idadeV,idadeN;
		
			System.out.println("digite o ano atual");
			anoAtual = ler.nextInt();
			
			System.out.println("digite o ano de nascimento do "+ i + " usuario");
			anoNasc =	ler.nextInt();
			
			idade = (anoAtual-anoNasc);
			idadeV = idade;
			idadeN = idade;
	
			for(i = 2;i<= 10;i++) {
				System.out.println("digite o ano de nascimento do "+ i + " usuario");
				anoNasc =	ler.nextInt();
				idade = (anoAtual-anoNasc);
				if(idade < idadeN) {
					idadeN = idade;
				}else if(idade > idadeV) {
					idadeV = idade;
				}
	}
			System.out.println(" o mais novo tem : "+ idadeN + "anos" );
			System.out.println("o mais velho tem : "+idadeV +"anos");
			ler.close();
		}


	

}
