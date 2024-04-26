/*
 * This file is part of the ITS Package, licensed under the MIT License.
 * Developed by Mike Mayer (dercrafter-168) 12/16/2023
 *
 * This Programm makes Java more colorfully.
 * You just have to call the getColor() Method
 * and add your favorite Color as the first argument
 *
 * Example:
 * ConsoleColors cc = new ConsoleColors(); //Farbcodes for java
 * System.out.println(cc.getColor("BLUE") + "This text is BLUE");
 *
 * Copyright (c) Mike Mayer (dercrafter-168) <postfach@mike-mayer.eu>
 * Copyright (c) contributors
 *
 */

package src.extensions;

public class ConsoleColors {

    private final String RESET = "\033[0m";
    private final String BLACK = "\033[0;30m";
    private final String RED = "\033[0;31m";
    private final String GREEN = "\033[0;32m";
    private final String YELLOW = "\033[0;33m";
    private final String BLUE = "\033[0;34m";
    private final String PURPLE = "\033[0;35m";
    private final String CYAN = "\033[0;36m";
    private final String WHITE = "\033[0;37m";

    public static void main(String[] args) {
        ConsoleColors cc = new ConsoleColors();
        System.out.println(cc.getColor("BLUE") + "This text is BLUE");
    }

    /**This method makes Java more colorfully
     * <br>
     * You just have to call the getColor() Method
     * and add your favorite Color as the first argument
     * <p><br></p>
     * Example: <br>
     * ConsoleColors cc = new ConsoleColors();
     * System.out.println(cc.getColor("BLUE") + "This text is BLUE");
     * @author Mike Mayer (dercrafter-168)
     * @since GMS (1.0.0.0)
     * */
    public String getColor(String Color){
        String tmp;

        switch (Color){
            case "RESET":
                tmp = RESET;
                break;
            case "BLACK":
                tmp = BLACK;
                break;
            case "RED":
                tmp = RED;
                break;
            case "GREEN":
                tmp = GREEN;
                break;
            case "YELLOW":
                tmp = YELLOW;
                break;
            case "BLUE":
                tmp = BLUE;
                break;
            case "PURPLE":
                tmp = PURPLE;
                break;
            case "CYAN":
                tmp = CYAN;
                break;
            case "WHITE":
                tmp = WHITE;
                break;
            default:
                tmp = "ERROR";
                System.out.println("Error wrong color");
        }

        return tmp;
    }

}
