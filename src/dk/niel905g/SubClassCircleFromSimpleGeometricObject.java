package dk.niel905g;

import java.util.Date;

public class SubClassCircleFromSimpleGeometricObject extends SuperClassSimpleGeometricObject{

        private double radius;

          public SubClassCircleFromSimpleGeometricObject() {
         }

          public SubClassCircleFromSimpleGeometricObject(double radius) {
         this.radius = radius;
         }

         public SubClassCircleFromSimpleGeometricObject(double radius,
 String color, boolean filled) {
         this.radius = radius;
         setColor(color);
         setFilled(filled);
}

    public void setColor(String color) {
    }

    public void setFilled(boolean filled) {
    }

         /** Return radius */
         public double getRadius() {
         return radius;
         }

         /** Set a new radius */
         public void setRadius(double radius) {
         this.radius = radius;
         }

         /** Return area */
         public double getArea() {
         return radius * radius * Math.PI;
         }

         /** Return diameter */
         public double getDiameter() {
         return 2 * radius;
         }

         /** Return perimeter */
         public double getPerimeter() {
         return 2 * radius * Math.PI;
         }

         /** Print the circle info */
         public void printCircle() { // With a super.getDateCreated() I would re-write the print method
             //and it would work just as well!
         System.out.println("The circle is created " + getDateCreated() +
         " and the radius is " + radius);
         }

//    public Date getDateCreated() {
//        return null;
    }
//}
