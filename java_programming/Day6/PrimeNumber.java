import java.util.Scanner;

public class PrimeNumber {



        public static void main(String[] args){

            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the Values");

            int flag=0;
            int number;
            number=scanner.nextInt();

            for(int i=2;i<number;i++){
                if(number%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("number is prime");
            }
            else{
                System.out.println("number is not a prime");
            }

        }

}
