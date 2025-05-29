
import java.util.Scanner;

import java.util.HashSet;

public class subsequences {

    public static void combs(String  demo, String finalstr, int idx, HashSet<String> set) {

        //hashset 
        if (idx == demo.length()) {
            
            // for printing unique sequences (using hashset)
            if (set.contains(finalstr)) {
                return;            
            }else{
                System.out.println(finalstr);
                set.add(finalstr);
                return;
            }
        }
        // to get into string
        combs(demo,finalstr+demo.charAt(idx), idx+1, set);

        // to not get into string 
        combs(demo,finalstr,idx+1,set);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String demo = sc.next();
        HashSet<String> set = new HashSet<>();
        combs(demo,"", 0, set);
        sc.close();
    }
}
// in the output a blank space is also printed which is the case in which all the letters 
// or elements dont come in the word i.e the black combination
