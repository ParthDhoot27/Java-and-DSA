import java.util.Scanner;
public class delete_duplicate {
    
    // deldupli will delete multiple occourances of a letter in the whole sentence 
    public static void deldupli(StringBuilder sb , int idx, int ins) {
        // the function will return from either of the below
        // two if statements below if else statement will exit the loop 
        // after returning there.....
        if (idx == sb.length()-1) {
            System.out.println(sb);
            return;
        }
        if (ins == sb.length()) {
            idx+=1;
            deldupli(sb, idx , idx+1);
            // ***here adding a return function is important **** else while ..
            //.. returning the function will return from here and will show a outofbounds problem!!
            return;
        }
        //del char at instantenious(ins) location if it matches the char at index(idx) main 
        if(sb.charAt(ins)== sb.charAt(idx)){
            sb.deleteCharAt(ins);
            deldupli(sb, idx, ins);
        }else{
            //else increase the value of (ins) 
            deldupli(sb, idx, ins+1);
        }
    }
    //main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter text ");
        StringBuilder todo = new StringBuilder(sc.nextLine());
        deldupli(todo, 0, 1);
        sc.close();
    }
}
