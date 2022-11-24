import java.util.*;
import java.lang.Math;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
     Scanner in = new Scanner(System.in);
    
     double[] vetorA = new double[11], vetorB = new double[11];
    
     for(int i=1; i<=10; i++)
     {
       System.out.println("Digite o valor do "+i+"º elemento");
       vetorA[i] = in.nextInt();
       vetorB[i] = Math.sqrt(vetorA[i]);
     }
    
     for(int j=1; j<=10; j++)
     {
       System.out.println(j+"º valor do vetor A: "+vetorA[j]);
     }
    
     for(int k=1; k<=10; k++)
     {
       System.out.println("Raiz do "+k+"º valor do vetor A: "+vetorB[k]);
     }  
   }
 }
