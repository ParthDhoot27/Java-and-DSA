package sorting;
import java.util.*;

 class bubble_sorting
 {
   //function for ascending 
   public static int sortascending(int a)
   {
     StringBuilder b = new StringBuilder(Integer.toString(a));
     char list[] = new char[b.length()];
    for(int i= 0; i<b.length();i++){
      list[i] = b.charAt(i);
    }
     for(int i=0 ; i<b.length()-1; i++){
       for(int j=0;j<b.length()-1; j++){
       if(list[j]>list[j+1]){
         char r = list[j];
         list[j] = list[j+1];
         list[j+1] = r ;
         }
       }
     }
     for(int i=0;i<b.length();i++){
       System.out.print(list[i]);
     }
     return 1;
   }
   //function for decending
   public static int sortdescending(int a)
   {
     StringBuilder b = new StringBuilder(Integer.toString(a));
     char list[] = new char[b.length()];
    for(int i= 0; i<b.length();i++){
      list[i] = b.charAt(i);
    }
     for(int i=0 ; i<b.length()-1; i++){
       for(int j=0;j<b.length()-1; j++){
       if(list[j]<list[j+1]){
         char r = list[j];
         list[j] = list[j+1];
         list[j+1] = r ;
         }
       }
     }
     for(int i=0;i<b.length();i++){
       System.out.println(list[i]);
     }
     return 1;
   }
   
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    System.out.println("input a value:");
    int a = sc.nextInt();
    System.out.println("input a for ascending and d for descending");
    String sorttype = sc.next();
    if(sorttype.equals("a")){
      sortascending(a);
    }else if(sorttype.equals("d")){
      sortdescending(a);
    }else{
      System.out.println("invalid input");
    }
   }
 }
