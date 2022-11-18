package teste;
import java.util.Scanner;
public class tabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i=1, a,b=1;
		System.out.println("Insira o número desejado");
		a = ler.nextInt();
	
		while(i<=10) {
			b =(a*i);
			System.out.println(a+"x"+i+"="+b);
			i++;
		}
	

}
}