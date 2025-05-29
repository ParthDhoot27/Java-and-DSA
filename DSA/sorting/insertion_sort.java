
package sorting;

 public class insertion_sort
 {
   public static void main(String args[])
   { 
    //insertion sorting 
    int a = 8219736;
    String b = Integer.toString(a);
    char arr[] = new char[b.length()];
    for(int i= 0; i<b.length();i++){
      arr[i] = b.charAt(i);
    }
    for(int i=1; i<b.length();i++){
      for(int j=i-1; j>=0;j--){
        if(arr[j]<arr[j+1]){
          char temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;
        }
      }
    }
    for(int i=0;i<b.length(); i++){
      System.out.print(arr[i]);
    }
   }
 }
