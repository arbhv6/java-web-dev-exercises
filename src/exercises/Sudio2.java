package exercises;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sudio2 {
//    public static HashMap<String, Integer> countChars(String toCount) {
//        HashMap<String, Integer> results = new HashMap<>();
//        return results;
//    }

    public static void main(String[] args) {
        String str1 = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String str2 = str1.toLowerCase();

        char[] charactersInStr1 = str2.toCharArray();


        //System.out.println(str1);
        //System.out.println(charactersInStr1[117]);


        //WORK IN PROGRESS FOR INPUT FROM USER
//        Scanner input = new Scanner(System.in);
//        String newString;
//        System.out.print("Add new string if desired (Otherwise, hit ENTER): ");
//        newString = input.nextLine();
//
//       if (!newString.equals("")) {
//           //change new string to lowercase
//           //change new lowercase string to char array
//           str2 = newString.toLowerCase();
//           char[] charactersInStr1 = str2.toCharArray();
//
//           System.out.print(str2);
//        } else {
//           char[] charactersInStr1 = str2.toCharArray();
//       }




        HashMap<Character, Integer> charactersList = new HashMap<>();

        for (char i : charactersInStr1) {
            //System.out.println(i);
            String str3 = Character.toString(i);
            if (!str3.matches(".*[^a-z].*")) {
                if (!charactersList.containsKey(i)) {
                    //System.out.println("no");
                    charactersList.put(i, 1);
                } else {
                    charactersList.replace(i, charactersList.get(i), charactersList.get(i) + 1);
                }
            }
        }

        System.out.println(charactersList);
    }
}
