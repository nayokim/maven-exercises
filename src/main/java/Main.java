import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String userEnter = scanner.nextLine();

        isANumber(userEnter);
        flippedCase(userEnter);
        reversePhrase(userEnter);
    }


    public static void isANumber(String aPhrase){
        System.out.println("you entered: " + aPhrase);
        if (StringUtils.isNumeric(aPhrase)){
            System.out.println(aPhrase + " is a number");
        } else {
            System.out.println(aPhrase + " is not a number");
        }
    }

    public static void flippedCase(String aPhrase){
        System.out.println("Flipped case: " + StringUtils.swapCase(aPhrase));
    }

    public static void reversePhrase(String aPhrase){
        System.out.println("Reversed case: " + StringUtils.reverse(aPhrase));

    }
}
