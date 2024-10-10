//Daniel Castillo CSIS 1400 4-6 Anagram
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram{
    public static String[]wordList = {"parabola", "mathematics", "siren", "diagnose", "coalescence"};
    public static void main(String[]args){
        boolean done = false;
        while(!done){

            Random gen = new Random();
            int random = gen.nextInt(wordList.length);
            String chosen = wordList[random];
            char[]letters = chosen.toCharArray();

            for(int i=0;i< letters.length;i++){
                char x = letters[i];
                letters[i] = letters[random];
                letters[random] = x;
            }
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to the Anagram game. Please enter a guess for what this word might be: "); System.out.println(letters);
            String response = scan.nextLine();
            if(response.equals(chosen)){
                System.out.println("Wow!You got it!");

            }else{
                System.out.println("Sorry, keep trying");
            }
            done = false;
            System.out.println("Would you like to play again? Y/N");
            String choice = scan.nextLine();
            if(choice.equals("Y")){
                done = false;
            }else{
                done = true;
                System.out.println("Okay!");
            }

        }
    }

}
