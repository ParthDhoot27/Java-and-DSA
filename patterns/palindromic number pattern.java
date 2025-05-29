import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    //rows 
    for(int i=1; i<=n ;i++){
      
      //for columns in palindromic
      for(int j=-n; j<=n; j++){
        
        if(j<i && j>-i){
          if(j>=0){
          System.out.print(j+1);
          } else{
            System.out.print(-j+1);
          }
        } else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
   }
 }
