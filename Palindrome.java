
/**
 * Write a description of class Palindrome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a word");
        String drome = input.nextLine().toUpperCase();
        int Count = drome.length()-1;
        int nmatch = 0;

        for(int i=0;i< drome.length(); i ++){

            String posright = Character.toString(drome.charAt(i));
            String posleft = Character.toString(drome.charAt(Count));
            if (posright.equals(posleft)){
                nmatch=0;

            } else if(!posright.equals(posleft)){

                nmatch++;
            }

            Count--;

        }
        if (nmatch == 0){
            System.out.println(drome + " " + "is a palindrome");
        } else if (nmatch>0){
            System.out.println(drome + " " + "is not a palindrome");
        }
    }
}