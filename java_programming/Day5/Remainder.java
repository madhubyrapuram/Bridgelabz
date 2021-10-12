import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dividend:");
        float dividend = sc.nextInt();
        System.out.println("Enter the divisor:");
        float divisor = sc.nextInt();

        float quotient=dividend/divisor;

        float remainder=dividend%divisor;

        System.out.println("The Quotient is: "+ quotient);
        System.out.println("The Remainder is: "+ remainder);

    }
}
