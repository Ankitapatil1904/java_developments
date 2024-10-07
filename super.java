class MethodOverriding1 {
    public static void main(String[]args) {
        System.out.println("\t -- Method Overriding --");
        Product p1 = new Product("Asus", "ROG 17", "Laptop", "AMD Ryzen 7", 8, 512f, 124999f);
        Product p2 = new Product("Samsung", "S24 Ultra", "Android Phone", "Eyxon 7200",
                                    8, 256f, 144999f);
        System.out.println("\nProduct 1 details : Type : " + p1.type);
        p1.showData();
        System.out.println("\nProduct 2 details : Type : " + p2.type);
        p2.showData();
        System.out.println("\nThank you.");
    }
}
class Company {
    private String name, model;
    String type;
    Company(String name, String model) {
        this.name = name;
        this.model = model;
        System.out.println("\nCompany name and Model defined.");
    }
    void showData() {
        System.out.println("Company name : " + name + " and Model : " + model);
    }
}
// Total members : 4, Data members : 3, Member Methods : 1
class Product extends Company {
    private String proc;
    private int ram;
    private float rom, mrp;
    Product(String n, String m, String type, String p, int ram, float rom, float mrp) {
        super(n, m);
        this.type = type;
        proc = p;
        this.ram = ram;
        this.rom = rom;
        this.mrp = mrp;
        System.out.println("Product specification defined.");
    }
    void showData() {                           // Overriding of super class method
        super.showData();                       // Invoking the overridden method
        System.out.println("Processor : " + proc + ", RAM (in GB) : " + ram +
                        ", ROM (in GB) : " + rom + " and MRP Rs : " + mrp + "/-");
    }
}
// Total members : 4 + 5 = 9, Data members : 3 + 4 = 7, Member Methods : 1 + 1 = 2
