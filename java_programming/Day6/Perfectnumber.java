import java.util.Scanner;

public class Perfectnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        float perfectnumber = sc.nextInt();

        int i =1;
        int sum=0;

        while(i<perfectnumber){
            //System.out.println("i is"+i);

            if(perfectnumber%i==0){
                sum=sum+i;
            }
            i=i+1;
        }
        if (sum==perfectnumber){
            System.out.println(perfectnumber+" is a perfect number");

        }
        else{
            System.out.println(perfectnumber+" is not a perfect number");
        }

    }
}
