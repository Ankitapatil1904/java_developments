class FinalClass1 {
    public static void main(String[]args) {
        System.out.println("\t Final Class \n");
        Vehicle v = new Vehicle();
        Car c = new Car();
        v.setDetails();
        c.setCar();
        System.out.println("\nVehicle details :");
        v.showDetails();
        c.showCar();
        System.out.println("\nThank you.");
    }
}
final class Vehicle {
    private String co, mo;
    String type;
    void setDetails() {
        System.out.println("Enter " + type + " details :");
        System.out.print("Company name : ");
        co = System.console().readLine();
        System.out.print("Model : ");
        mo = System.console().readLine();
    }
    void showDetails() {
        System.out.println("Company : " + co + ", Model : " + mo);
    }
}
// Total members : 5, Data members : 3, Member methods : 2

class Car extends Vehicle { */
class Car {
    int eCC;
    String type;
    float price;
    Car() {
        type = "Petrol";
    }
    void setCar() {
        System.out.print("Engine CC : ");
        eCC = Integer.parseInt(System.console().readLine());
        System.out.print("Price Rs : ");
        price = Float.parseFloat(System.console().readLine());
    }
    void showCar() {
        System.out.println("Car details :");
        System.out.println("Engine CC : " + eCC + ", Price Rs : " + price) ;
    }
}
// Total members : 5, Data members : 3, Member methods : 2
