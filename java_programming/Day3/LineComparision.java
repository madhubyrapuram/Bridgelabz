import java.util.Objects;
import java.util.Scanner;

import java.lang.*;
import java.lang.Float;

class LineValues {

    Scanner sc=new Scanner(System.in);

    public float LineCoordinates(){

        System.out.println("Enter the X1 value");
        float x1_Line1= sc.nextInt();
        System.out.println("Enter the Y1 value");
        float y1_Line1=sc.nextInt();
        System.out.println("Enter the X2 value");
        float x2_Line1=sc.nextInt();
        System.out.println("Enter the Y2 value");
        float y2_Line1=sc.nextInt();

        float linePoints = (float) (Math.pow((x2_Line1-x1_Line1),2) + Math.pow((y2_Line1-y1_Line1),2));
        float lengthofLine=(float) Math.sqrt(linePoints);
        float round_lengthofLine = (float) (Math.round(lengthofLine* 100.0) / 100.0);
        //return  lengthofLine;
        return  round_lengthofLine;

    }
}


public class LineComparision {

    public static void main(String[] args) {

        System.out.println("Enter the 2D Cartesian coordinate system line1 values,");
        LineValues Line1 = new LineValues();
        float lengthofLine1 = Line1.LineCoordinates();
        System.out.println("Length of line1 is " + lengthofLine1);

        System.out.println(" ");
        System.out.println("Enter the 2D Cartesian coordinate system line2 values,");
        LineValues Line2 = new LineValues();
        float lengthofLine2 = Line2.LineCoordinates();
        System.out.println("Length of line2 is " + lengthofLine2);
        System.out.println(" ");

        //boolean lineEqual = Objects.equals(lengthofLine1, lengthofLine2);
        //System.out.println(lineEqual);
        //int lineCompare = Float.compare(lengthofLine1, lengthofLine2);
        //System.out.println(lineCompare);

        //int lineCompare1 = lengthofLine1.compareTo (lengthofLine2);

        System.out.println("Using Java equals method to check equality of 2 line Lengths ");
        if (Objects.equals(lengthofLine1, lengthofLine2)==true) {
            System.out.println("line1 and line2 are equal ");
        }
        else {
            System.out.println("line1 and line2 are not equal ");
        }

        System.out.println(" ");
        System.out.println("Using Java compare method to check equality of 2 line Lengths ");
        if (Float.compare(lengthofLine1, lengthofLine2)==0) {
            System.out.println("line1 and line2 are equal,");
             }
            else {
            System.out.println("line1 and line2 are not equal");
            }

        }

    }
