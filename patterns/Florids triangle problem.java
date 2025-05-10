import java.util.*;

 // Compiler version JDK 11.0.2

 class rectangular_stars
 {
   public static void main(String args[])
   { 
     
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int a = 1;
     for(int i=1; i<=n; i++){
      for(int j=1;j<=i;j++){
        // +" " gives a extra gap which makes the vertical rectangle a square hence gives 
       // perfect gap
        System.out.print(a+" ");
        a = a +1;
       } 
    //  for(int j=n;j>=i && j<=n;j--){
    //    System.out.print(" ");
    // }
       System.out.println();
     }
   }
}