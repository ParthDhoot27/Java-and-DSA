package Strings;

public class reversevovels {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("welocome to java and DSA learning group");
        reversevovel(s);
    }

    public static void swapping(StringBuilder s, int i, int j) {
        char temp = s.charAt(j);
        s.setCharAt(j, s.charAt(i));
        s.setCharAt(i, temp);
        return;
    }

    //iteration method
    public static void reversevovel(StringBuilder s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                for (int j = s.length()-1; j >= 0; j--) {
                    if (i >= j) {
                        System.out.println(s);
                        return;
                    } else if (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o'
                            || s.charAt(j) == 'u') {
                        swapping(s, i, j);
                        break;
                    }
                }
            }

        }
        System.out.println(s);

        //arraylist method 

        // ArrayList<Character> lst = new ArrayList<>();
        // String finalstr = "";
        // for (int i = 0; i < s.length(); i++) {
        // char currentchar = s.charAt(i);
        // if (currentchar == 'a' || currentchar == 'e' || currentchar == 'i' ||
        // currentchar == 'o'
        // || currentchar == 'u') {
        // lst.add(currentchar);
        // s.setCharAt(i, '#');
        // }
        // }
        // for (int i = lst.size()-1; i>=0; i--) {
        // char current = lst.get(i);
        // for (int j = 0; j < s.length(); j++) {
        // if (s.charAt(j) == '#'){
        // s.setCharAt(j, current);
        // break;
        // }
        // }
        // }
        // System.out.println(s);
        // return;
    }
}
