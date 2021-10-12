
public class Flipcoin {

    public static void main(String[] args){

        float coinFlip= (float) (Math.random());
        int coinPercentage= (int) Math.floor(coinFlip*100);

        if(coinPercentage<50){
            System.out.println("percentage of getting tails is " + coinPercentage + "%");
        }
        else{
            int coinPercentage_heads= 100-coinPercentage;
            System.out.println("percentage of getting heads is " + coinPercentage_heads + "%");
        }

        //System.out.println("percentage of coin flip " + coinPercentage + "%");

    }
}
