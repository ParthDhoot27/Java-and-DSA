import java.util.*;

public class rhombuspattern {
  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    System.out.println("enter a number");
    int n = scn.nextInt();

    // rows
    for (int i = 0; i <= n; i++) {

      // column
      for (int j = 1; j <= n + 5; j++) {

        // print stars
        if (j >= n - i + 1 && j <= n + 5 - i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
