//Check vowels and consonants
package programmingChallenges;

import java.util.Scanner;

public class Assignment9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nThis program is a vowel and consonant checker...\n");
        System.out.print("Enter a letter/string: ");
        String input = sc.nextLine();

        int vowelNum = 0, consonantNum = 0;
        String vowelList = "", consonantList = "";

        for(int i =0; i< input.length(); i++){
            char c = input.charAt(i);

            if(Character.isLetter(c)){
                if(isVowel(c)){
                    vowelNum ++;
                    vowelList += c + ", ";
                } else{
                    consonantNum++;
                    consonantList += c + ", ";
                }
            }
        }
        System.out.println("\nOUTPUT:");
        System.out.println(vowelNum + " Vowel(s): " + vowelList);
        System.out.println(consonantNum + " Consonant(s): " + consonantList + "\n");

    sc.close();
    }
    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}