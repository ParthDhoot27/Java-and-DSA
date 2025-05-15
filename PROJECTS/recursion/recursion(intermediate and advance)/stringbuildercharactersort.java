import java.util.Scanner;

public class stringbuildercgaractersort {

    //function to seperate all x and other characters
    public static void sorter(StringBuilder ab , int idx) {
        // base case
        if (idx == ab.length()) {

            //print new recreated stringBuilder 
            System.out.println(ab);
            return;
        }
        //to access character x
        if (ab.charAt(idx) == 'x') {

            //searching for cheracter other than x in index's after x 
            for (int i = idx+1; i <ab.length() ; i++) {

                // replace x with the character on the index found 
                if (ab.charAt(i) != 'x') {
                    ab.setCharAt(idx, ab.charAt(i));
                    ab.setCharAt(i, 'x');
                    break;
                }
            }
            sorter(ab, idx+1);
        }else{
            //run sorter in any case 
            sorter(ab, idx+1);
        }
     
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder tosort = new StringBuilder(sc.nextLine());
        sorter(tosort, 0);
    }
}
