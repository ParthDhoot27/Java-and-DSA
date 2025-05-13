import java.util.Scanner;
public class occurance {
    
    public static void occurance(String smp, int i, int first, int last , char target) {
        //base case 
        if (i==smp.length()) {
            first += 1;
            last += 1;
            System.out.println("the first occourance of "+ target + " is at "+ first);    
            System.out.println("the last occourance of "+ target + " is at "+ last);    
            return;
        }
        char b = smp.charAt(i);
        //assigning index to of first occurance to first 
        if (b == target && i<=first) {
            first = i;
            last  = first ;
        }
        //assigning index to of all other occurances to last 
        else if (i>= first && b == target ) {
            last= i;
        }
        //recursion for analysing all values
        occurance(smp, i+1 , first, last, target);
    }    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type any word or sentence ");
        String random = sc.nextLine();
        System.out.println("enter the character whose first and last occourance you want to find ?");
        String targetinp = sc.next();
        if (targetinp.length()> 1) {
            
        }
        char target = targetinp.charAt(0);
        int lnth = random.length();
        occurance(random, 0, lnth , 0, target ); 
    }
}
