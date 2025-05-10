import java.util.*;
 class recursion
 {
   //factorial 
   public static void factorial(int n, int i ,int product){
     if(i==0){
       System.out.println("factorial of "+n+" is "+product);
       return;
     }
     product *= i;
     factorial(n,i-1,product);
   }
   
   //theee variables int i which increases , n base case , and sum for result 
   public static void sumcalc(int n, int i, int sum){
     if(i>n){
       System.out.println("the sum of first "+ n+ " natural numbers is "+sum);
       return ;
     }
     sum += i;
     sumcalc(n,i+1, sum);
   }
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sumcalc(n , 1 , 0);
    factorial(n,n,1);
   }
 }
