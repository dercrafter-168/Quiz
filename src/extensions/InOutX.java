/*
 * This file is part of the ITS Package, licensed under the CC BY-SA 4.0 DEED License.
 * Developed by Gerhard Röhner <GRoehner@t-online.de>.
 * Modified by Mike Mayer (dercrafter-168) <postfach@mike-mayer.eu> 12/29/2023
 *
 * Changes:
 * - More comments
 * - Bug fix in the formatN() method when you input a negativ value
 *
 * Support class for console input and output of numeric values.
 *
 * Example:
 * double abc = InOutX.readDouble("Number"); //Read the double value from the console
 * System.out.println(abc); //Prints the double value
 *
 * Copyright (c) (creator) Gerhard Röhner <GRoehner@t-online.de>
 * Copyright (c) (Modder) Mike Mayer (dercrafter-168) <postfach@mike-mayer.eu>
 * Copyright (c) contributors
 *
 */

package src.extensions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This file is part of the ITS Package, licensed under the CC BY-SA 4.0 DEED License. <br>
 * Developed by Gerhard Röhner <GRoehner@t-online.de>. <br>
 * Modified by Mike Mayer (dercrafter-168) <postfach@mike-mayer.eu> 12/29/2023 <br>
 * <p></p>
 * Changes: <br>
 * - More comments <br>
 * - Bug fix in the formatN() method when you input a negativ value <br>
 * <p></p>
 * Support class for console input and output of numeric values.
 * <p></p>
 * Example: <br>
 * double abc = InOutX.readDouble("Number"); //Read the double value from the console
 * System.out.println(abc); //Prints the double value
 * <p></p>
 * Copyright (c) (creator) Gerhard Röhner <GRoehner@t-online.de> <br>
 * Copyright (c) (Modder) Mike Mayer (dercrafter-168) <postfach@mike-mayer.eu> <br>
 * Copyright (c) contributors <br>
 * */

public class InOutX {

    public static void main(String[] args) {

    }


    /** Formats a double-value with 2 decimal digits. */
    public static String format2(double d) {
        return String.format("%.2f", d);
    }

    /** Formats a double-value with N decimal digits.
     * Edit: <dercrafter-168> fix error when N <= 0*/
    public static String formatN(double d, int N) {
        if (N <= 0){
            System.out.println("Your value for N ("+ N + ") is not allowed here");
            N = 1;
        }
        return String.format("%." + N + "f", d);
    }
    /** Reads a boolean-value from console. */
    public static boolean readBoolean(String prompt) {
        final String[] trueValues =
                { "1", "y", "t", "j", "w", "yes", "true", "ja", "wahr", "ok" };
        System.out.print(prompt);
        String input = readln().toLowerCase();
        for (int i = 0; i < trueValues.length; ++i)
            if (trueValues[i].equals(input))
                return true;
        return false;
    }

    /** Reads a char-value from console. */
    public static char readChar(String prompt) {
        System.out.print(prompt);
        return readln().charAt(0);
    }

    /** Reads a double-value from console. */
    public static double readDouble(String prompt) {
        System.out.print(prompt);
        return Double.parseDouble(readln());
    }

    /** Reads a float-value from console. */
    public static float readFloat(String prompt) {
        System.out.print(prompt);
        return Float.parseFloat(readln());
    }

    /** Reads an int-value from console. */
    public static int readInt(String prompt) {
        System.out.print(prompt);
        return Integer.parseInt(readln());
    }

    /** Reads a long-value from console. */
    public static long readLong(String prompt) {
        System.out.print(prompt);
        return Long.parseLong(readln());
    }

    /** Reads a string-value from console. */
    public static String readString(String prompt) {
        System.out.print(prompt);
        return readln();
    }

    /** Reads a string-value from console without prompt.
     For use at the end of a console program. */
    public static String readln() {
        try {
            return Input.readLine();
        } catch(IOException e) {
            e.printStackTrace();
            return "Error" + e.getMessage();
        }
    }

    private static BufferedReader Input;

    static {
        try {
            Input = new BufferedReader(new InputStreamReader(System.in));
        }
        catch (Exception e) {
            System.out.println("console input not possible.");
        }
    }

}
