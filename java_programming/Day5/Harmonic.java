
import java.util.Scanner;

public class Harmonic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the required harmonic number:");
        int harmonicNumber = sc.nextInt();

        for (int i = 1; i <= harmonicNumber; i++) {
            if (i == 1) {
                System.out.print(1 + " + ");
            } else if (i == harmonicNumber) {
                System.out.print("1/"+ i);
            } else {
                System.out.print("1/"+ i + " + ");

            }


        }

    }
}
