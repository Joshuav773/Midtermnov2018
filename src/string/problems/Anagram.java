package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        checkAnagram("ARMY", "MARY");
        checkAnagram("CATS", "ACT");

    }
    public static boolean isAnagram(String word, String alfa){
        if (word.length() != alfa.length()){
            return false;
        }
        char [] joshua = word.toCharArray();
        for (char c : joshua){int pointe = alfa.indexOf(c);
            if (pointe != -1){
                alfa = alfa.substring(0, pointe) + alfa.substring(pointe +1, alfa.length());
            }else{
                return false;
            }
        }return alfa.isEmpty();
    }


    public static void checkAnagram(String word, String Anagram){
        if(isAnagram(word, Anagram) == true){
            System.out.println(Anagram + " Is an Anagram of " + word);
        }else{
            System.out.println(Anagram + " Is not an Anagram of " + word);
        }
    }

}
