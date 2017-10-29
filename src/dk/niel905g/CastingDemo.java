package dk.niel905g;

public class CastingDemo {
    public static void main(String[] args) {
        // Create and initialize two objects
        Object object1 = new SubClassCircleFromSimpleGeometricObject(1);
        Object object2 = new SubClassRectangleFromSimpleGeometricObject(1, 1);

        // Display circle and rectangle
        displayObject(object1);
        displayObject(object2);
    }
        // A method for displaying an object
    public static void displayObject(Object object) {
        if (object instanceof SubClassCircleFromSimpleGeometricObject) {
            System.out.println("The circle area is " + ((SubClassCircleFromSimpleGeometricObject)object).getArea());
            System.out.println("The circle diameter is " + ((SubClassCircleFromSimpleGeometricObject)object).getDiameter());
        }
        else if (object instanceof
                SubClassRectangleFromSimpleGeometricObject) {
            System.out.println("\nThe rectangle area is " + ((SubClassRectangleFromSimpleGeometricObject)object).getArea());
        }
    }
}
