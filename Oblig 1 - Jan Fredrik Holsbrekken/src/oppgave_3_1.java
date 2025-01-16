
import java.util.Scanner;

public class oppgave_3_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Skriv inn navn på planeten:  ");
        String navn = input.nextLine();

        System.out.print("Skriv inn radius til planeten:  ");
        double radius = input.nextDouble();

        System.out.print("Skriv inn massen til planeten:  ");
        double masse = Double.parseDouble(input.nextLine());    // Måtte ty til Double.parseDouble for at
                                                                // Scanner'n skulle ta imot input med "E" i seg.
        Planet nyplanet = new Planet(navn, radius, masse);
        nyplanet.planetInfo();

        input.close();

    }
}
