class FinalMethod1 {
    public static void main(String[]args) {
        System.out.println("\t -- Final Method --\n");
        Car c = new Car();
        c.setDetails();
        c.setCar();
        System.out.println("\nVehicle details :");
        c.showDetails();
        c.showCar();
        System.out.println("\nThank you.");
    }
}
class Vehicle {
    private String co, mo;
    String type;
    void setDetails() {
        System.out.println("Enter " + type + " details :");
        System.out.print("Company name : ");
        co = System.console().readLine();
        System.out.print("Model : ");
        mo = System.console().readLine();
    }
    final void showDetails() {
        System.out.println("Company : " + co + ", Model : " + mo);
    }
}
// Total members : 5, Data members : 3, Member methods : 2
class Car extends Vehicle {
    int eCC;
    String type;
    float price;
    Car() {
        super.type = "Car";
        type = "Petrol";
    }
    void setCar() {
        System.out.print("Engine CC : ");
        eCC = Integer.parseInt(System.console().readLine());
        System.out.print("Price Rs : ");
        price = Float.parseFloat(System.console().readLine());
    }
    /* ERROR : showDetails() in Car cannot override showDetails() in Vehicle
    void showDetails() { */
    void showCar() {
        System.out.println(type + " " + super.type + " details :");
        System.out.println("Engine CC : " + eCC + ", Price Rs : " + price) ;
    }
}
// Total members : 5 + 5 = 10, Data members : 3 + 3 = 6, Member methods : 2 + 2 = 4
