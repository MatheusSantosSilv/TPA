import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
     Scanner in = new Scanner(System.in);
     
     int vetorA [] = new int[11];
    
     for(int i=1; i<=10; i++)
     {
       System.out.println("Informe o valor do "+i+"º valor");
       vetorA[i] = in.nextInt();
     }  
     
     System.out.println("Os valores pares são:");
     for(int j=1; j<=10; j++)
     {
       if(vetorA[j] % 2 == 0)
       {
         System.out.print(vetorA[j]+" ");
       }else{
         System.out.print("");
       }
     }
   }
 }
