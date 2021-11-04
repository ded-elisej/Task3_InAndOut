import java.util.Scanner;

public class InputAndOutput {
    //in this task it is required input some string and then output the result of the considered methods
    public static void main(String[] args) {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String scannerString = scanner.nextLine();
        System.out.println("The length of the string = " + scannerString.length());
        System.out.println("Is this string is empty? -" + scannerString.isEmpty());
        System.out.println("Does this string only contain spaces? -" + scannerString.isEmpty());
        System.out.println("Input number of character:");
        Scanner number = new Scanner(System.in);
        int numberOfCharacter = number.nextInt();
        System.out.println("There is a symbol " + scannerString.charAt(numberOfCharacter - 1) + " under the " + numberOfCharacter + " number");
        System.out.println("Input another string:");
        Scanner scanner2 = new Scanner(System.in);
        String anotherString = scanner2.nextLine();
        System.out.println("Are two string equals? -" + scannerString.equals(anotherString));
        System.out.println("Are two string equals ignore case? -" + scannerString.equalsIgnoreCase(anotherString));
        System.out.println("Input another character:");
        Scanner charr = new Scanner(System.in);
        String character = charr.nextLine();
        System.out.println("Does this string contain entered character? -" + scannerString.contains(character));
        System.out.println("Let's connect our string with another string:");
        System.out.println(scannerString.concat(anotherString));
        System.out.println("Let's replace two symbols numbered 1 and 5 in the our string:");
        System.out.println(scannerString.replace(scannerString.charAt(0), scannerString.charAt(4)));
        System.out.println("Let's return our string in lower case:" + scannerString.toLowerCase());
        System.out.println("Let's return our string in upper case:" + scannerString.toUpperCase());
        System.out.println("Is this string start with 'A'? -" + scannerString.startsWith("A"));
        System.out.println("The 5 symbol in the our string is 'B'? -" + scannerString.startsWith("B",4));
        //System.out.println("Is this string start with 'This'? -" + scannerString.startsWithThis()); can find this method
        System.out.println("Is this string end with '?'? -" + scannerString.endsWith("?"));
        System.out.println(String.format("In this string: %s. I was found some character like %s. Also I compared our string and another string: %s. In the end i did another string methods",scannerString, character, anotherString));

    }
}
