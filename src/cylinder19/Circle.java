package cylinder19;
/*
1. Write a class with the name Circle. The class needs one field (instance variable) with name radius
of type double.
The class needs to have one constructor with parameter radius of type double and it needs to initialize
the fields.
In case the radius parameter is less than 0 it needs to set the radius field value to 0.
Write the following methods (instance methods):
● Method named getRadius without any parameters, it needs to return the value of the radius
field.
● Method named getArea without any parameters, it needs to return the calculated area
(radius * radius * PI). For PI use Math.PI constant.
 */

public class Circle {

        //private static final double PI = 3.14;
        //Instance Variable
        private double radius;

        //Constructor
        public Circle(double r) {
            this.radius = r;
            if (r < 0) {//If Statements
                r = 0;
            } else {
                radius = r;
            }
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return radius * radius * Math.PI;
        }
    }

