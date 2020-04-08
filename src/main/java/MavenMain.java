import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String userInput = input.nextLine();

        try{
            int userNum = Integer.parseInt(userInput);
            System.out.printf("\t%d is a number.\n",userNum);
        } catch (NumberFormatException nfe){
            System.out.printf("\t%s is not a number.\n",userInput);
        }

        System.out.printf("\tFlipped case : %s\n",reversedCap(userInput));

        System.out.printf("\tReversed : %s", StringUtils.reverse(userInput));
    }

    public static String reversedCap(String str){
        StringBuilder reversed = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if (Character.isLowerCase(str.charAt(i))){
                reversed.append(Character.toUpperCase(str.charAt(i)));
            } else {
                reversed.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        return reversed.toString();
    }

}
