package s1_02_eexceptions_lvl2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        while(true) {
            try {
                System.out.print(message + ": ");
                return scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Insert a byte value.");
                scanner.nextLine();
            }
        }
    }

    public static int readInt(String message) {
        while(true) {
            try {
                System.out.print(message + ": ");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Insert an int value.");
                scanner.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while(true) {
            try {
                System.out.print(message + ": ");
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Insert a float value.");
                scanner.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while(true) {
            try {
                System.out.print(message + ": ");
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Insert a double value.");
                scanner.nextLine();
            }
        }
    }
}
