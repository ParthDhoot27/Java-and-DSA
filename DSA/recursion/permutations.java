public class permutations {
    public static void main(String[] args) {
        String topermute = "abcd";
        permutation(topermute, "");
    }

    public static void permutation(String topermute, String permutations) {

        if (topermute.length() == 0) {
            System.out.println(permutations);
            return;
        }

        for (int i = 0; i < topermute.length(); i++) {

            // "abc" --> "ab"
            String newString = topermute.substring(0, i) + topermute.substring(i + 1);

            permutation(newString, permutations + topermute.charAt(i));

        }
    }

}
