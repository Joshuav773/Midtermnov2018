package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation("ABC");
    }
    public static String permutation(String string){
        printPermutation(string, "");
        return string;
    }
    private static void printPermutation(String st, String permutation){
        if (st.length()==0){
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i< st.length(); i++){
            char toAppendToPermutation = st.charAt(i);
            String remaining = st.substring(0, i) + st.substring(i +1);

            printPermutation(remaining,permutation+ toAppendToPermutation);
        }
    }

}
