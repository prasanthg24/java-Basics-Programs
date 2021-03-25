import java.io.*; 
import java.util.*;
class Main{
    
    
    public static void main (String[] args) {
        
      int[] x = new int[4];
      Scanner sc = new Scanner(System.in);
        System.out.println("enter the value to insert  "+x.length);
      for(int i=0;i<x.length;i++)
      {
          x[i]= sc.nextInt();
            System.out.println();
          
      }
        System.out.println("\n values  are ");
      for(int j=0;j<x.length;j++)
      {
         System.out.println(x[j]+" ");
      }
    }
}
