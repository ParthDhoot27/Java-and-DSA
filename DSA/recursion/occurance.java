import java.util.Scanner;
public class occurance {
    
    public static void occurancefd(String smp, int i, int first, int last , char target) {
        if (i==smp.length()) 
        {
            first += 1;
            last += 1;
            System.out.println("the first occourance of "+ target + " is at "+ first);    
            System.out.println("the last occourance of "+ target + " is at "+ last);    
            return;
        }
        char b = smp.charAt(i);
        if (b == target && i<=first) 
        {
            first = i;
            last  = first ;
        } else if (i>= first && b == target) 
        {
            last= i;
        }
        occurancefd(smp, i+1 , first, last, target);
    }   
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("type any word or sentence ");
        String random = sc.nextLine();
        System.out.println("enter the character whose first and last occourance you want to find ?");
        String targetinp = sc.next();
        // if (targetinp.length()> 1) {
            
        // }
        char target = targetinp.charAt(0);
        int lnth = random.length();
        occurancefd(random, 0, lnth , 0, target ); 
        sc.close();
    }
}