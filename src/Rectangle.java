/**  Ex. 8.4: Rectangle class
 * Calculates the rectangle's perimeter and area
 */
public class Rectangle {

   private double length=1;
   private double width=1;

   public Rectangle(double length, double width){
      if (length>=0.0 && length<=20.0)
         this.length=length;
      if (width>=0.0 && width<=20.0)
         this.width=width;
   }
   public void setLength(double length){
      if (length>=0.0 && length<=20.0)
         this.length=length;
      else this.length=1;
   }
   public double getLength(){return length;}

   public void setWidth(double width){
      if (width>=0.0 && width<=20.0)
         this.width=width;
      else this.width=1;
   }
   public double getWidth(){return width;}

   public double getPerimeter() {return (length+width)*2; }
   public double getArea(){
      return length*width;
   }
}
