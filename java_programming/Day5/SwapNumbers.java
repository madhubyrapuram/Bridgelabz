import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        float a = sc.nextInt();
        System.out.println("Enter the second number:");
        float b = sc.nextInt();
        System.out.println(" ");
        System.out.println("Numbers before swapping:");
        System.out.println("a= "+ a);
        System.out.println("b= "+ b);

         a = a+b;
         b = a-b;
         a = a-b;

        System.out.println("Numbers after swapping:");
        System.out.println("a= "+ a);
        System.out.println("b= "+ b);

    }
}
