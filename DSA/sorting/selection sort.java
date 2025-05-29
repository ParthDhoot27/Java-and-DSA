
package sorting;
import java.util.*;

 class Dcoder
 {
   public static void main(String args[])
   { 
    //int
    int a = 261836;
    String b = Integer.toString(a);
    
    //array allocation of values 
    char arr[] = new char[b.length()];
    
    //converting to array 
    for(int i=0; i<b.length(); i++){
      arr[i] = b.charAt(i);
    }
    //selection sorting 
    //comparison block 
    for(int i=0; i<b.length(); i++){
      //char selected = arr[i];
      for(int j=i+1; j<b.length(); j++){
        //selecting smallest value
        if(arr[j]<arr[i]){
          //swapping selected to smallest value 
           char temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
        }
      }
    }
    for(int i= 0; i<b.length();i++){
      System.out.print(arr[i]);
    }
   }
 }
