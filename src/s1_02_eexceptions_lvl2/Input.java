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
                System.out.println("Format error: Insert a byte value.");
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
                System.out.println("Format error: Insert an int value.");
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
                System.out.println("Format error: Insert a float value.");
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

    public static char readChar(String message) {
        while(true) {
            try {
                System.out.print(message + ": ");
                String input = scanner.nextLine();
                if (input.length() != 1) {
                    throw new Exception("Error: You have to insert only one character.");
                }
                return input.charAt(0);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String readString(String message) {
        while(true) {
            try {
                System.out.print(message + ": ");
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    throw new Exception("Error: Text can't be empty.");
                }
                return input;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static boolean readYesNo(String message) {
        while (true) {
            try {
                System.out.print(message + " (s/n): ");
                String input = scanner.nextLine().trim().toLowerCase();
                if(input.equals("s")) {
                    return true;
                } else if(input.equals("n")) {
                    return false;
                } else {
                    throw new Exception("Error: you have to insert 's' or 'n'.");
                }
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
