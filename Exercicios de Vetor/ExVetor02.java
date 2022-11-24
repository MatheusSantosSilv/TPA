import java.util.*;

 class Dcoder
 {
   public static void main(String args[])
   { 
     Scanner in = new Scanner(System.in);
     
     int[] vetorA = new int[11], vetorB = new int[11];
    
     for(int i=1; i<=10; i++)
     {
       System.out.println("Digite o "+i+"º valor");
       vetorA[i] = in.nextInt();
       vetorB[i] = vetorA[i];
     }
     
     System.out.println("O vetor original é:");
     for(int k=1; k<=10; k++)
     {
       System.out.print(vetorA[k]+" ");
     }
     
     System.out.println("\nO vetor invertido é:");
     for(int j=10; j>=1; j--)
     {
       System.out.print(vetorB[j]+" ");
     }
     
     
     
     
    
   }
 }
