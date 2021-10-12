
import java.util.Random ;

public class SnakeandLadder {

    public static void main( String args[] ) {
        int rolledDie = 0;
        int position = 0;
        //int maxPosition = 100;
        int min = 1;
        int max = 6;
        int range = max - min + 1;

        int min1 = 1;
        int max1 = 3;
        int range1 = max1 - min1 + 1;

        System.out.println("Random value in int from " + min + " to " + max + ":");


          while (position < 100){

            int randomInt = (int) (Math.random() * range) + min;
            int randomIntOptions = (int) (Math.random() * range1) + min1;
            rolledDie = rolledDie + 1;

            //No play
            if (randomIntOptions == 1) {
                position = position;
                System.out.println("Die position " + position);

            }
            // ladder
            else if (randomIntOptions == 2 && position <= 100) {
                position = position + randomInt;
                if (position > 100) {
                    position = position - randomInt;
                }
                System.out.println("Die position " + position);

            }

            // snake
            else if (randomIntOptions == 3) {
                position = position - randomInt;
                if (position <= 0) {
                    position = 0;
                }
                System.out.println("Die position " + position);
            }



        if (position == 100) {
            System.out.println("Die reached final position " + position);
            break;
        }

    }
        System.out.println(rolledDie + " times the dice was played to win the game");
        }


    }

