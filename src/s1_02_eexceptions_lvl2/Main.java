package s1_02_eexceptions_lvl2;

public class Main {
    public static void main(String[] args) {
        byte age = Input.readByte("How old are you? (byte): ");
        int num = Input.readInt("Insert a number (int): ");
        float decimalNum = Input.readFloat("Insert a decimal number (float): ");
        double doubleNumber = Input.readDouble("Insert a bigger decimal number (double): ");
        char letter = Input.readChar("Insert a letter (char): ");
        String word = Input.readString("Insert a word (String): ");
        boolean confirmation = Input.readYesNo("Insert 's' to answer yes or 'n' to answer no.");

        System.out.println("Age: " + age);
        System.out.println("Number: " + num);
        System.out.println("Decimal number: " + decimalNum);
        System.out.println("Bigger decimal number: " + doubleNumber);
        System.out.println("Letter: " + letter);
        System.out.println("Word: " + word);
        System.out.println("Answer: " + ((confirmation) ? "Yes" : "No"));

    }
}
