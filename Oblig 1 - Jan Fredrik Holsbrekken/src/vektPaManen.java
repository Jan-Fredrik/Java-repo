
import java.util.Scanner;

public class vektPaManen {
    public static void main(String[] args) {

        Scanner brukerinput = new Scanner(System.in);
        System.out.println("Hva er din vekt på jorda i kg?:   ");

        double vekt = brukerinput.nextDouble();

        while (vekt <= 0) {
            System.out.println("Slutt å tull, din tøysekopp. Prøv på nytt! \n");

            System.out.println("Hva er din vekt på jorda i kg?:   ");
            vekt = brukerinput.nextDouble();
        }

        double tyngekraft_månen = vekt * 0.165;

        System.out.printf("\nDin vekt på månen er: %.2f kg!", tyngekraft_månen);

        brukerinput.close();

    }
}
