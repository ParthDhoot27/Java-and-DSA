
import java.util.Scanner;
public class subsequences {
    public static void combs(String  demo, String finalstr, int idx) {
        if (idx == demo.length()) {
            System.out.println(finalstr);
            return;
        }
        // to get into string
        combs(demo,finalstr+demo.charAt(idx), idx+1);

        // to not get into string 
        combs(demo,finalstr,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String demo = sc.next();
        combs(demo,"", 0);
    }
}
// in the output a blank space is also printed which is the case in which all the letters 
// or elements dont come in the word i.e the black combination
