import java.util.*;

 class Dcoder
 {
   public static void main(String args[])
   { 
     //incude input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for(int i=1;i<=n/2;i++){
      
      for(int j=1;j<=n;j++){
        
        if(j>i && j<n-i+1){
          System.out.print("  ");
        }
        else{
          System.out.print("🦋");
        }
      }
      
      System.out.println();
    }
    
    for(int i=n/2;i>=n/2 && i<=n;i++){
      
      for(int j=1;j<=n;j++){
        
        if(j>n-i && j<i+1){
          System.out.print("  ");
        }
        else{
          System.out.print("🦋");
        }
      }
      
      System.out.println();
    }
   }
 }
  