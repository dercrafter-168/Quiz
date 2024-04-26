/*
 * This file is part of the ITS Package, licensed under the MIT License.
 * Developed by Mike Mayer (dercrafter-168) 12/16/2023
 *
 * This Programm adds ASCII art to Java
 * You just have to call your favorite Method
 *
 * Example:
 * ASCII ascii = new ASCII();
 * ascii.DCN();
 *
 * Copyright (c) Mike Mayer (dercrafter-168) <postfach@mike-mayer.eu>
 * Copyright (c) contributors
 *
 */

package src.extensions;

/**This class adds some ASCII art to Java
 * <br>
 * You just have to call your favorite Method
 * <p><br></p>
 * Example: <br>
 * ASCII ascii = new ASCII();
 * ascii.DCN();
 * @author Mike Mayer (dercrafter-168)
 * @since GMS (1.0.0.0)
 * */
public class ASCII {

    public static void main(String[] args) {
        ASCII ascii = new ASCII();
        ascii.DCN();
        ascii.BBS();
        ascii.wip();
    }

    public void DCN() {
        System.out.println(" ________      ________      ________      ");
        System.out.println("|\\   ___ \\    |\\   ____\\    |\\   ___  \\    ");
        System.out.println("\\ \\  \\_|\\ \\   \\ \\  \\___|    \\ \\  \\\\ \\  \\   ");
        System.out.println(" \\ \\  \\ \\\\ \\   \\ \\  \\        \\ \\  \\\\ \\  \\  ");
        System.out.println("  \\ \\  \\_\\\\ \\   \\ \\  \\____    \\ \\  \\\\ \\  \\ ");
        System.out.println("   \\ \\_______\\   \\ \\_______\\   \\ \\__\\\\ \\__\\");
        System.out.println("    \\|_______|    \\|_______|    \\|__| \\|__|");

    }

    public void BBS() {
        System.out.println(" ________      ________      ________      ");
        System.out.println("|\\   __  \\    |\\   __  \\    |\\   ____\\     ");
        System.out.println("\\ \\  \\|\\ /_   \\ \\  \\|\\ /_   \\ \\  \\___|_    ");
        System.out.println(" \\ \\   __  \\   \\ \\   __  \\   \\ \\_____  \\   ");
        System.out.println("  \\ \\  \\|\\  \\   \\ \\  \\|\\  \\   \\|____|\\  \\  ");
        System.out.println("   \\ \\_______\\   \\ \\_______\\    ____\\_\\  \\ ");
        System.out.println("    \\|_______|    \\|_______|   |\\_________\\");
        System.out.println("                               \\|_________|");
    }

    //The top method is going to execute this method if a feature is not ready for a release
    public void wip() {
        System.out.println("================");
        System.out.println("     W.I.P");
        System.out.println("Work.In.Progress");
        System.out.println("================");
        System.out.print(System.lineSeparator());
    }

}
