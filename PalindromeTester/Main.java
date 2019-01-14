import java.lang.String;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        String palindrome[];
        palindrome = new String[9];

        palindrome[0] = "Palindrome";
        palindrome[1] = "Civic";
        palindrome[2] = "Radar";
        palindrome[3] = "Level";
        palindrome[4] = "Eva, can I stab bats in a cave?";
        palindrome[5] = "A man, a plan, a canal, Panama";
        palindrome[6] = "Mr. Owl ate my metal worm";
        palindrome[7] = "Never odd or even";
        palindrome[8] = "Doc, Note: I Dissent. A fast never prevents a fatness. I diet on a cod.";

        String deletion[];
        deletion = new String[9];

        for (int i = 0; i < 9; i++) {
            deletion[i] = palindrome[i].replaceAll("\\s", "").replaceAll("\\.", "").replaceAll(",", "").replaceAll(":", "").replaceAll("\\?", "");
        }

        String degradation[];
        degradation = new String[9];

        for (int i = 0; i < 9; i++) {
            degradation[i] = deletion[i].toLowerCase();
        }

        String reversion[];
        reversion = new String[9];


        boolean palTester;
        for (int i = 0; i < 9; i++) {
            if (degradation[i].charAt(0) == degradation[i].charAt(degradation[i].length() - 1)) {
                palTester = true;
                System.out.println(palindrome[i] + " is a palindrome");
            }
            if (degradation[i].charAt(0) != degradation[i].charAt(degradation[i].length() - 1)){
                palTester = false;
                System.out.println(palindrome[i] + " is not a palindrome");
            }
        }





        }
    }
