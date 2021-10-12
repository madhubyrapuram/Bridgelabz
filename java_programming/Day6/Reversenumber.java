import java.util.Scanner;

class ReverseNum {

    private int originalnumber;

    public ReverseNum(int originalnumber) {
        this.originalnumber = originalnumber;
    }

    public int reversenumber() {

        int number=0;
        while(originalnumber>0){

            int rem = originalnumber%10;
            number=(number*10)+rem;
            originalnumber=(int) originalnumber/10;
        }

        return number;

    }
}

public class Reversenumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int originalNumber = sc.nextInt();

        ReverseNum reverse = new ReverseNum(originalNumber);
        int reversedNumber = reverse.reversenumber();
        System.out.println("Reversed number is " + reversedNumber);

    }
}
