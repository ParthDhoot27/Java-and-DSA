import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static int powercalcrec(int b, int p){
     int result;
     if(p==0){
       return 1;
     }
     if(b==0){
       return 0;
     }
     if(p%2==0){
        return powercalcrec(b,p/2)*powercalcrec(b,p/2);
     }else{
        return powercalcrec(b,p/2)*powercalcrec(b,p/2)*b;
     }
   }
   public static void powercalc(int b, int p, int pdt){
     if(p-1==0){
       System.out.println(pdt);
       return;
     }
     pdt *= b;
     powercalc(b,p-1,pdt);
   }
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    int b = sc.nextInt();
    int p = sc.nextInt();
    powercalc(b,p,b);
    System.out.print(powercalcrec(b,p));
   }
 }
