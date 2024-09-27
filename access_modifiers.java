class InheritanceDemo2 {
    public static void main(String[]args) {
        System.out.println("\t -- Inheritance in Java : Accessing private members --\n");
        Cylinder obj = new Cylinder();
        obj.setRadius(5.0f);
        obj.setHeight(10.0f);
        System.out.println("Radius : " + obj.getRadius());
        System.out.println("Area : " + obj.getPI() * obj.getRadius() * obj.getRadius());
        obj.volume();
        System.out.println("\nThank you.");
    }
}
class Circle {
    private float r;
    private final float pi = 3.1415f;
    void setRadius(float radius) {
        r = radius;
    }
    float getRadius() {
        return r;
    }
    float getPI() {
        return pi;
    }
}
// Total members : 5, Data members : 2, and Member methods: 3
class Cylinder extends Circle {
    private float h;
    void setHeight(float height) {
        h = height;
    }
    void volume() {
        float rad = getRadius();
        float p = getPI();
        float a = p * rad * rad;
        float v = a * h;
        System.out.println("Height : " + h);
        System.out.println("Volume : " + v);
    }
}
// Total members : 5 + 3 = 8, Data members : 2 + 1 = 3, and Member methods : 3 + 2 = 5
