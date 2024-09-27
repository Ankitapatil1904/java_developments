class InnerClassDemo1 {
    public static void main(String[]args) {
        System.out.println("\t -- Nested Classes : Inner Class --\n");
        Circle objC = new Circle(5.0f, 10.0f);
        System.out.println("\nCircle details are :");
        System.out.println("Radius : " + objC.radius + " and Area : " + objC.area());
        System.out.println("\nCylinder details are : ");
        System.out.println("Radius : " + objC.radius + ", Height : " + objC.objCy.height +
                            " and Volume : " + objC.objCy.volume());
        System.out.println("\nThank you.");
    }
}
class Circle {
    float radius;
    final float pi = 3.1415f;
    Cylinder objCy;
    Circle(float radius, float height) {
        this.radius = radius;
        objCy = new Cylinder(height);
        System.out.println("Circle created.");
    }
    float area() {
        return pi * radius * radius;
    }
    class Cylinder {
        float height;
        Cylinder(float height) {
            this.height = height;
            System.out.println("Cylinder created.");
        }
        float volume() {
            return (area() * height);
        }
    }
}
