import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the required power of 2:");
        int power = sc.nextInt();
        if(power>=0 && power<=31) {
            for (int i = 0; i <= power; i++) {
                System.out.println("2^" + i + "=" + Math.pow(2, i));
            }
        }
        else{
            System.out.println("Entered power is not valid");

            }

    }
}
