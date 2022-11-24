import java.util.*;
 class Dcoder
 {
   public static void main(String args[])
   { 
     Scanner in = new Scanner(System.in);
     
     int[] vetor = new int[11];
    
     for(int i=1; i<=10; i++)
     {
       System.out.println("Digite o "+i+"º número");
       vetor[i] = in.nextInt();
     }
     
     Arrays.sort(vetor);
     System.out.println("O menor número é "+vetor[1]);
     System.out.println("O maior número é "+vetor[10]);
   }
 }
