/**  Rectangle class test
 */
import java.util.Scanner;

public class RectangleTest {
   public static void main(String[] args) {
      Rectangle myRectangle = new Rectangle(14, 2);

      System.out.printf("The rectangle's perimeter is %s%n", myRectangle.getPerimeter());
      System.out.printf("The rectangle's area is %s%n", myRectangle.getArea());
      System.out.println();

      Scanner input = new Scanner(System.in);

      System.out.println("Please enter the rectangle's length: ");
      double theLength = input.nextDouble();
      myRectangle.setLength(theLength);
      System.out.println("Please enter the rectangle's width: ");
      double theWidth = input.nextDouble();
      myRectangle.setWidth(theWidth);

      System.out.printf("The rectangle's perimeter is %s%n", myRectangle.getPerimeter());
      System.out.printf("The rectangle's area is %s%n", myRectangle.getArea());
   }

}
