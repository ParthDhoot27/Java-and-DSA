import java.util.Scanner;

public class remove_character {

    //function to seperate all x and other characters
    public static void sorter(StringBuilder ab , int idx , char torem) {
        // base case
        if (idx == ab.length()) {

            //print new recreated stringBuilder 
            System.out.println(ab);
            return;
        }
        //to access character x
        if (ab.charAt(idx) == torem) {

            //searching for cheracter other than x in index's after x 
            for (int i = idx+1; i <ab.length() ; i++) {

                // replace x with the character on the index found 
                if (ab.charAt(i) != torem) {
                    ab.setCharAt(idx, ab.charAt(i));
                    ab.deleteCharAt(i);
                    break;
                }
            }
            sorter(ab, idx+1 , torem);
        }else{
            //run sorter in any case 
            sorter(ab, idx+1, torem);
        }
     
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter text ");
        StringBuilder tosort = new StringBuilder(sc.nextLine());
        System.out.println("Enter the letter you want to remove from the text ");
        String remostr = sc.next();
        sc.close();
        if(remostr.length()>1){
            System.out.println(" you need to enter a character !! ");
            return;
        }
        char chm = remostr.charAt(0);
        sorter(tosort, 0 , chm ) ;
        
    }
}
// this can also be done by creating a new stringbuilder by inserting each letter which is not equal to x to the new string 