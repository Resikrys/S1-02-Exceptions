package s1_02_eexceptions_lvl2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        while(true) {
            try {
                System.out.print(missatge + ": ");
                return scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Insert byte value.");
                scanner.nextLine();
            }
        }
    }

    public static int readInt(String message)
}
