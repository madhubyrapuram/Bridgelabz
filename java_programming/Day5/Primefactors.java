
import java.util.Scanner;

public class Primefactors {

    public static void main(String args[]){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        number = sc.nextInt();
        System.out.println("Prime factors are:");
        for(int i = 2; i<= number; i++) {
            while(number%i == 0) {
                System.out.print(i+" ");
                number = number/i;
            }
        }

    }
}

