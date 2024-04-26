package src.extensions;

public class MathX {

    public static void main(String[] args) {
        MathX mathX = new MathX();
        mathX.run();
    }

    private void run(){
        System.out.println("Hello World");
    }

    public double round_2(double number){
        number = Math.round(100.0 * number) / 100.0;
        return number;
    }

}
