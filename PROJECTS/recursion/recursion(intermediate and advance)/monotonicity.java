import java.util.Scanner;

public class monotonicity {
    // check manotonicity 
    public static void monotonic(int[] a, int idx) {
        // first two are checked first 
        if (a[0] < a[1]) {
            // check for ascending
            if (a[idx + 1] > a[idx]) {
                if (idx == a.length - 2) {
                    System.out.println("given integer is ascending.");
                    return;
                }
                // checking each element to be monotonic 
                monotonic(a, idx + 1);
            }else {
                System.out.println(" given integer is not monotonic !! ");
                return;
            }
        } else {
            // check for descending
            if (a[idx] > a[idx + 1]) {
                if (idx == a.length - 2) {
                    System.out.println("given integer is descending.");
                    return;
                }
                // checking each element to be monotonic 
                monotonic(a, idx + 1);
            } else {
                System.out.println(" given integer is not monotonic !! ");
                return;
            }
        }
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter 4 diffrent numbers by adding a space or pressing the enter key .. ");
        int[] arr = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };
        monotonic(arr, 0);
    }

}