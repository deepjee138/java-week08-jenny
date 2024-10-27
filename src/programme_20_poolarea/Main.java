package programme_20_poolarea;

/**3. Write a class with the name Main that contains the main method.
 *
 */

public class Main {
    public static void main(String[] args) {
        // Test code for Rectangle
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());  // Output: 5.0
        System.out.println("rectangle.length= " + rectangle.getLength()); // Output: 10.0
        System.out.println("rectangle.area= " + rectangle.getArea());     // Output: 50.0

        // Test code for Cuboid
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());        // Output: 5.0
        System.out.println("cuboid.length= " + cuboid.getLength());      // Output: 10.0
        System.out.println("cuboid.area= " + cuboid.getArea());          // Output: 50.0
        System.out.println("cuboid.height= " + cuboid.getHeight());      // Output: 5.0
        System.out.println("cuboid.volume= " + cuboid.getVolume());      // Output: 250.0
    }
}

