import java.util.*;
// import java.util.Scanner;
 public class stringsreverser
 {
   public static void main(String args[])
   { 
    //import scanner 
    Scanner sc = new Scanner(System.in);
    StringBuilder userinput = new StringBuilder(sc.nextLine());
    char reverser[] = new char[userinput.length()];
    for(int i=0; i<userinput.length();i++){
      reverser[i] = userinput.charAt(i);
    }
    for(int i=userinput.length()-1; i>=0; i--){
      System.out.print(reverser[i]);
    }
    sc.close();
   }
 }
