import java.util.*;

 // Compiler version JDK 11.0.2

 class arrays
 {
   public static void main(String args[])
   { 
     
    Scanner sc = new Scanner(System.in);
    System.out.print("enter number of rows ");
    int rows = sc.nextInt();
    System.out.print("enter number of columns ");
    int colm = sc.nextInt();
    
    //2D array
    int[][] ary = new int[rows][colm];
    
    //taking inputs
    //for rows
    for(int i=0; i<rows ; i++){
      
      //for columns 
      for(int j=0 ; j<colm; j++){
        System.out.print("enter numbers for row " + (i+1));
        //inputs
        ary[i][j] = sc.nextInt();
      }
    }
    
    //print matrix
    for(int i=0; i<rows ; i++){
      
      //for columns 
      for(int j=0 ; j<colm; j++){
        
        //print
        System.out.print(ary[i][j]+" | ");
      }
      System.out.println();
      
      for(int j=0 ; j<colm-1; j++){
        
        //print line
        System.out.print("----");
      } 
      System.out.println();
    }
    
    //to find x 
    //input x 
    System.out.print("enter the number you want to search in the grid ");
    int x = sc.nextInt();
    for(int i= 0; i<rows; i++){
      for(int j=0; j<colm; j++){
        if(ary[i][j] == x){
          System.out.println("element is found at location (i,j) = ("+ i + "),(" + j +")");
        }
      }
    }
   }
   }
