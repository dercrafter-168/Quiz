/*
 * This file is part of the ITS Package, licensed under the CC BY-NC-ND 4.0 License.
 * Developed by Mike Mayer (dercrafter-168) <postfach@mike-mayer.eu> 12/29/2023.
 *
 * Support class for console input and output of numeric values.
 *
 * Example:
 * Profil profil = new Profil();
 * System.out.println(profil.getData("GITHUB_USERNAME")); //Prints the E-MAIL Address
 *
 * Copyright (c) (Creator) Mike Mayer (dercrafter-168) <postfach@mike-mayer.eu>
 * Copyright (c) contributors
 *
 */

package src.extensions;

/**
 * This Class is part of the ITS Package, licensed under the CC BY-NC-ND 4.0 License. <br>
 * Developed by Mike Mayer (dercrafter-168) <postfach@mike-mayer.eu> 12/29/2023.
 * <p></p>
 * Support class to print my personal Data in some projects.
 * <p></p>
 * Example: <br>
 * Profil profil = new Profil(); <br>
 * System.out.println(profil.getData("GITHUB_USERNAME")); ///Prints the GitHub Username
 * <p></p>
 * Copyright (c) (Creator) Mike Mayer (dercrafter-168) <postfach@mike-mayer.eu> <br>
 * Copyright (c) contributors <br>
 * */
public class Profil {

    private final String EMAIL_ADDRESS = "support@mail.dercrafter.de";
    private final String PHONE_NUMBER = "+49 (0)174/4163364";
    private final String WEBSITE = "https://www.dercrafter.de";
    private final String FULL_NAME = "Mike Mayer";
    private final String GITHUB_USERNAME = "@dercrafter-168";
    private final String GITHUB_PROFIL_LINK = "https://github.com/dercrafter-168";
    private final String GITHUB_REPOSITORY_LINK = "https://github.com/dercrafter-168/ITS_Java";

    public static void main(String[] args) {
        Profil profil = new Profil();
        profil.displayProfileInfo();
    }

    /**Demo Method to display all personal Data to the console*/
    private void displayProfileInfo(){
        System.out.println(EMAIL_ADDRESS);
        System.out.println(PHONE_NUMBER);
        System.out.println(WEBSITE);
        System.out.println(FULL_NAME);
        System.out.println(GITHUB_USERNAME);
        System.out.println(GITHUB_PROFIL_LINK);
        System.out.println(GITHUB_REPOSITORY_LINK);
    }

    /**This method prints the personal data you ever want when you add your favorit data type as the first argument.
     * <p></p>
     * Example: <br>
     * Profil profil = new Profil(); <br>
     * System.out.println(profil.getData("GITHUB_USERNAME")); //Prints the GitHub Username <br>
     * */
    public String getData(String Data){
        String tmp;

        switch (Data){
            case "EMAIL":
                tmp = EMAIL_ADDRESS;
                break;
            case "PHONE":
                tmp = PHONE_NUMBER ;
                break;
            case "WEB":
                tmp = WEBSITE;
                break;
            case "NAME":
                tmp = FULL_NAME;
                break;
            case "GITHUB_USERNAME":
                tmp = GITHUB_USERNAME;
                break;
            case "GITHUB_LINK":
                tmp = GITHUB_PROFIL_LINK;
                break;
            case "GITHUB_REPOSITORY":
                tmp = GITHUB_REPOSITORY_LINK;
                break;
            default:
                tmp = "ERROR";
                System.out.println("Error wrong cmd");
        }

        return tmp;
    }

}
