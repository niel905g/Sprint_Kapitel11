package dk.niel905g;

public class TestCircleRectangle {
    public static void main(String[] args) {
         SubClassCircleFromSimpleGeometricObject circle =
                 new SubClassCircleFromSimpleGeometricObject(1);
         System.out.println("A circle " + circle.toString());
         System.out.println("The color is " + circle.getColor());
         System.out.println("The radius is " + circle.getRadius());
         System.out.println("The area is " + circle.getArea());
         System.out.println("The diameter is " + circle.getDiameter());

         SubClassRectangleFromSimpleGeometricObject rectangle =
                 new SubClassRectangleFromSimpleGeometricObject(2, 4);
         System.out.println("\nA rectangle " + rectangle.toString());
         System.out.println("The area is " + rectangle.getArea());
         System.out.println("The perimeter is " +
                 rectangle.getPerimeter());
/* Herfra kører jeg polymorphic "extend" metode ind i andre klasser */
        Animal[] thelist = new Animal[2];
        Dog d = new Dog();
        Fish f = new Fish();
// Dette er faktisk en Array!
        thelist[0] = d;
        thelist[1] = f;

        for (Animal x: thelist) {
            x.noise();
        }
    }
}