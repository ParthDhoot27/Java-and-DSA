import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    //this code is only valid for n 1 to 9 
    //include scanner
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    //rows
    for(int i=1; i<=n ; i++){
      
      //columns
      for(int j=1; j<=2*n+1 ; j++){
        
        if(j<n+i && j>n-i){
        //if n is even
        if(n%2==0){
          
          //even i are choosen
          if(i%2==0){
            
            //print i at odd places
            if(j%2==0){
              System.out.print(" ");
            } else{
              System.out.print(i);
            }
          } else{
            
            //even j --> print i
            if(j%2==0){
              System.out.print(i);
            } else{
              System.out.print(" ");
            }
          }
        } 
        //n is odd
        else{
          //even i are choosen
          if(i%2==0){
            
            //print i at even places
            if(j%2==0){
              System.out.print(i);
            } else{
              System.out.print(" ");
            }
          } else{
            
            //even j --> print gap
            if(j%2==0){
              System.out.print(" ");
            } else{
              System.out.print(i);
            }
          }
        }
        }else{
          System.out.print(" ");
        }
        }
        System.out.println();
      }
    }
   }
