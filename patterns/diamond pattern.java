import java.util.*;

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    //rows upper half 
    for(int i=0; i<=2*n-1; i++){
      
      if(i<=n){
      //columns
      for(int j=-n;j<=n; j++){
        if(j<i && j>-i){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      }else if(i>n && i<=2*n-1){
        for(int j=0;j<=i-n; j++){
        System.out.print(" ");
      }
       for(int j=i-n+1;j<=3*n-1-i; j++ ){
         System.out.print("*");
       }
    }
    System.out.println();
   }
  }
 }
