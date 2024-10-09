public class Method1 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.setdata("rectangle", 2, 4);
        obj.show();
        obj.area();
    }
}

abstract class Shape {
    float d1, d2;
    String name;

    void setdata(String name, float d1, float d2) {
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
    }

    abstract void area();
}

public class Rectangle extends Shape {
    void show() {
        System.out.println("dimension 1: " + d1 + " dimension 2: " + d2);
    }

    void area() {
        System.out.println("area of rectangle is: " + (d1 * d2));
    }
}
