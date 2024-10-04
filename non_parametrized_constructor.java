class MultilevelInheritance2 {
    public static void main(String[]args) {
        System.out.println("\t -- The Multilevel Inheritance --");
        Shape sh1 = new Shape();
        sh1.setShape("Triangle");
        sh1.d1 = 10.5f;
        sh1.d2 = 15.6f;
        Circle ci1 =  new Circle();
        ci1.setCircle(6.0f);
        Cylinder cy1 = new Cylinder();
        cy1.setCylinder(5.0f, 10.5f);
       
        cy1.showCylinder();
        ci1.showCircle();
        sh1.showShape();
        System.out.println("Area : " + 0.5f * (sh1.d1 * sh1.d2));
        System.out.println("\nThank you.");
    }
}
class Shape {                                   // GrandParent class
    private String name;
    float d1, d2;
    Shape() {
        name = "Not Defined";
        d1 = d2 = 1.0f;
        System.out.println("\nShape defined.");
    }
    void setShape(String n) {
        name = n;
    }
    void showShape() {
        System.out.println("\nShape name : " + name);
        System.out.println("Dimension 1 : " + d1 + ", dimension 2 : " + d2);
    }
}
// Total members : 5, Data members : 3, and Member methods 2
class Circle extends Shape {                    // Parent class
    float a;
    Circle() {
        a = 1.0f;
        setShape("Circle");
        System.out.println("Shape Circle defined.");
    }
    void setCircle(float radius) {
        d1 = radius;
    }
    void showCircle() {
        showShape();
        a = 3.14f * d1 * d1;
        System.out.println("Area : " + a);
    }
}
// Total members : 5+3 = 8, Data members : 3+1 = 4, and Member methods 2+2 = 4
class Cylinder extends Circle {                 // Child class (Multiple Inheritance)
    float v;
    Cylinder() {
        v = 1.0f;
        setShape("Cylinder");
        System.out.println("Shape Cylinder defined.");
    }
    void setCylinder(float radius, float height) {
        setCircle(radius);
        d2 = height;
    }
    void showCylinder() {
        showCircle();
        v = a * d2;
        System.out.println("Volume : " + v);
    }
}
// Total members : 5+3+3 = 11, Data members : 3+1+1 = 5, and Member methods 2+2+2 = 6
