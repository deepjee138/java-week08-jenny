package programme_19_Cylinder;

/**2. Write a class with the name Cylinder that extends Circle class. The class needs one field (instance
 variable) with name height of type double.
 The class needs to have one constructor with two parameters radius and height both of type double.
 It needs to call the parent constructor and initialize a height field.
 In case the height parameter is less than 0 it needs to set the height field value to 0.
 Write the following methods (instance methods):
 ● Method named getHeight without any parameters, it needs to return the value of height
 field.

 ● Method named getVolume without any parameters, it needs to return the calculated volume.
 To calculate volume, multiply the area with height.
 *
 */

public class Cylinder extends Circle {
    // Instance variable
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        super(radius); // Call the parent constructor
        // If height is negative, set it to 0
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method to get the height
    public double getHeight() {
        return height;
    }

    // Method to calculate the volume
    public double getVolume() {
        return getArea() * height; // Volume = Area * Height
    }
}



