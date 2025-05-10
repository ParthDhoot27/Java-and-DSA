import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
     //include scanner
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    //outer loop
    for(int i=1;i<=n; i++){
      
      //inner loop 
      for(int j=1;j<=n+4;j++){
        
        //middle stars
        if(i>1 && i<n){
        //spaces
        if(j==n-i+1 || j== n-i+5){
          System.out.print("😆");
        } else{
          System.out.print("  ");
        }
        } 
        //extremes
        else{
          
          if(j>=n-i+1 && j<= n-i+5){
            System.out.print("😆");
          } else{
            System.out.print("  ");
          }
        }
      }
      System.out.println();
    }
   }
 }
