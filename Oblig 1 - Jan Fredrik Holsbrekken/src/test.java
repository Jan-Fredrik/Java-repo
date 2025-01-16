import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hva er planetens navn?: ");
        String navn = input.nextLine();

        System.out.println("Hva er planetens radius?: ");
        double radius = Double.parseDouble(input.nextLine());

        System.out.println("Hvor stor er massen til planeten?: ");
        double masse = Double.parseDouble(input.nextLine());

        Planet nyplanet = new Planet(navn, radius, masse);
        nyplanet.planetInfo();


        // tester litteranje
        input.close();
    }
}