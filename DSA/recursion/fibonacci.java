import java.util.*;

 class fibonacci
 {
   //fibonacci 
   public static void printfibonacci(int a , int b,int i,int n){
     //i will count rhe number of times function is called 
     if(i+1==n){
       return;
     }
     int c = a+b;
     System.out.print(c+" ");
     //recursion
     printfibonacci(b,c,i+1,n);
   }
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(0+" "+1+" ");
    printfibonacci(0,1,1,n);
    sc.close();
   }
 }
