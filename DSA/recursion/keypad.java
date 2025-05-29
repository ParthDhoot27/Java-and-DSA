public class keypad {
    public static String[] keypad = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void main(String[] args) {

        //given string
        String key = "234";
        printcomb(key, 0, "");
    }
    //function will print all possible combinations of given key's
    public static void printcomb(String keyset, int idx, String finalstr) {
        //base case 
        if (idx==keyset.length()) {
            System.out.println(finalstr);
            return;
        }

        char curentchar = keyset.charAt(idx);  //2(given number)
        String mapping = keypad[curentchar - '1'];  //abc(string saved in given number)

        for (int i = 0; i < mapping.length(); i++) {

            // access all characters in selected string one by one 
            char tobeadded = mapping.charAt(i);
            // recursion
            printcomb(keyset, idx+1,finalstr+tobeadded);
        }

    }

}
