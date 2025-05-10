import java.util.*;

 // Compiler version JDK 11.0.2

 public class Calculator
 {
   
   public static void main(String args[])
   { 
     
    Scanner sc = new Scanner(System.in);
    System.out.println("-CLASSIC_CALCULATOR-");
    System.out.print("enter first value ");
    float a = sc.nextInt();
    System.out.print("enter second value ");
    float b = sc.nextInt();
    
    System.out.print("input number toselect operation\n"+"1.Sumission(a+b)\n"+"2.Diffrence(a-b)\n"+"3.Multiplication(a×b)\n"+"4.division(a÷b)\n"+"5.remainder(a%b)\n");
    int n = sc.nextInt();
    
    switch(n){
      case 1 : System.out.print(sm(a,b));
      break;
      case 2 : System.out.print(dif(a,b));
      break;
      case 3 : System.out.print(pdt(a,b));
      break;
      case 4 : System.out.print(div(a,b));
      break;
      case 5 : System.out.print(rem(a,b));
    }
   }
   public static float sm(float a , float b)
   { 
    float sum = a + b;
    return sum;
   }
   public static float dif( float a , float b)
   { 
    float dif = a-b;
    return dif;
   }
   public static float pdt( float a , float b)
   { 
    float pdt = b*a;
    return pdt;
   }
   public static float rem( float a , float b)
   { 
    float rem = a%b;
    return rem;
   }
   public static float div( float a , float b)
   { 
    float div = a / b;
    return div;
   }
 }
