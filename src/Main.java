/*
 * Link zu OnlineGDB: https://www.onlinegdb.com/
 */
package src;

import src.extensions.InOutX;

public class Main {

    public static void main(String[] args){
        Main m = new Main();
        m.run();
    }

    private void run(){
        int points = 0;
        String answer;

        System.out.println("Frage: Welches Volk befreite Moses? ");
        System.out.println("");
        System.out.println("a) Israel");
        System.out.println("b) Deutschland");
        System.out.println("c) Vatikanstaat");
        System.out.println("d) Frankreich");
        System.out.println("");

        answer = InOutX.readString("Bitte gib hier den richtigen Buchstaben ein:");

        if (answer.equalsIgnoreCase("a")){
            System.out.println("Richtig");
            points = points + 1;
        }else if(answer.equalsIgnoreCase("b")){
            System.out.println("Falsch");
        }else if(answer.equalsIgnoreCase("c")){
            System.out.println("Falsch");
        }else if(answer.equalsIgnoreCase("d")){
            System.out.println("Falsch");
        }else {
            System.out.println("Error");
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Frage: Durch welches Meer führte Moses Israel? ");
        System.out.println("");
        System.out.println("a) Mittelmeer");
        System.out.println("b) Atlantik");
        System.out.println("c) Rotes Meer");
        System.out.println("d) Südchinesisches Meer");
        System.out.println("");

        answer = InOutX.readString("Bitte gib hier den richtigen Buchstaben ein: ");

        if (answer.equalsIgnoreCase("a")){
            System.out.println("Falsch");
        }else if(answer.equalsIgnoreCase("b")){
            System.out.println("Falsch");
        }else if(answer.equalsIgnoreCase("c")){
            System.out.println("Richtig");
            points = points + 1;
        }else if(answer.equalsIgnoreCase("d")){
            System.out.println("Falsch");
        }else {
            System.out.println("Error");
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Frage: Welches Land war Moses sein  Ziel ?");
        System.out.println("");
        System.out.println("a) Israel");
        System.out.println("b) Kaahan");
        System.out.println("c) Iran");
        System.out.println("d) Nordkorea");
        System.out.println("");

        answer = InOutX.readString("Bitte gib hier den richtigen Buchstaben ein: ");

        if (answer.equalsIgnoreCase("a")){
            System.out.println("Error");
        }else if(answer.equalsIgnoreCase("b")){
            System.out.println("Error");
            points = points + 1;
        }else if(answer.equalsIgnoreCase("c")){
            System.out.println("Error");
        }else if(answer.equalsIgnoreCase("d")){
            System.out.println("Error");
        }else {
            System.out.println("Error");
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Frage: Vor welchem Land flüchtete Israel ?");
        System.out.println("");
        System.out.println("a) Russland");
        System.out.println("b) Ägypten");
        System.out.println("c) Italien");
        System.out.println("d) Japan");
        System.out.println("");

        answer = InOutX.readString("Bitte gib hier den richtigen Buchstaben ein: ");

        if (answer.equalsIgnoreCase("a")){
            System.out.println("Error");
        }else if(answer.equalsIgnoreCase("b")){
            System.out.println("Error");
            points = points + 1;
        }else if(answer.equalsIgnoreCase("c")){
            System.out.println("Error");
        }else if(answer.equalsIgnoreCase("d")){
            System.out.println("Error");
        }else {
            System.out.println("Error");
        }

        System.out.println("");
        System.out.println("");


        System.out.println("Finish! " + "You earend: " + points + " Points");
    }

}