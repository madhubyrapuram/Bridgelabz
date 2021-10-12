import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Values");

        int count=2;
        int x=0;
        int y=1;
        int z;
        int number;
        number=scanner.nextInt();

        System.out.print(x);
        System.out.print(" ");
        System.out.print(y);
        System.out.print(" ");

        for(int i=2;i<number;i++){
            z=x+y;
            x=y;
            y=z;
            System.out.print(z);
            System.out.print(" ");

        }

    }
}


