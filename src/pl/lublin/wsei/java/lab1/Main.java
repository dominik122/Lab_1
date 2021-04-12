package pl.lublin.wsei.java.lab1;

public class Main {
    /**
     * Funkcja main naszej klasy
     * @param args argumenty funkcji main
     */
    public static void main(String[] args){

        System.out.println("Nazywalismy to \"Witamina B3\"");

        System.out.println("\nalfa\tsin(alfa)");
        for (int i =0; i < 370; i += 10){
            System.out.printf("%d\t%f\n", i, Math.sin(i/360.0*2*Math.PI));
        }

        int sum = 0;
        System.out.println("\narg\tlog2(arg)\tsum(arg)");
        for (int i = 1; i < 8; i *= 2){
            sum += i;
            System.out.printf("%d\t%.2f\t\t%d\n", i, (Math.log(i)/Math.log(2)), sum);
        }
    }
}
