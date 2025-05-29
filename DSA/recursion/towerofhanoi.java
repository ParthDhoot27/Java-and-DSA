import java.util.Scanner;

public class towerofhanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of blocks on first tower : ");
        int n = sc.nextInt();
        System.out.println("NOTE: tower are numbered from top to down and 1st and 3rd pillar are source  and destination respectively!");
        twrofhanoi(n,"1", "2", "3");
        sc.close();
    }

    public static void twrofhanoi(int n, String src, String hel, String dest) {

        if (n==1) {
            System.out.println("transfer disk "+ n +" from tower "+ src + " to tower " + dest);
            return; 
        }
        twrofhanoi(n-1, src , dest, hel);
        System.out.println("transfer disk "+ n +" from tower "+ src + " to tower " + dest);
        twrofhanoi(n-1, hel, src, dest);
    } 
}