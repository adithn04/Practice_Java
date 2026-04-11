public class vehicle {
    private String cmpy;
    private String type;

    vehicle(String cmpy, String type) {
        this.cmpy = cmpy;
        this.type = type;
    }

    public String getCmpy() {
        return cmpy;
    }

    public String getType() {
        return type;
    }

    public void setCmpy(String cmpy) {
        this.cmpy = cmpy;
    }

    public void setType(String type) {
        this.type = type;
    }

    void start() {
        System.out.println("Vehicle is starting");
    }

    void display() {
        System.out.println("company: " + cmpy);
        System.out.println("type: " + type);
    }
}

class bike extends vehicle {
    String brand;

    bike(String cmpy, String type, String brand) {
        super(cmpy, type);
        this.brand = brand;
    }

    @Override
    void display() {
        super.display();
        System.out.println("brand: " + brand);
    }

    @Override
    void start() {
        System.out.println("Bike is starting");
    }

}

class carr extends vehicle {
    String brand;

    carr(String cmpy, String type, String brand) {
        super(cmpy, type);
        this.brand = brand;
    }

    @Override
    void display() {
        System.out.println("brand: " + brand);
        super.display();
    }

    @Override
    void start() {
        System.out.println("Car is starting");
    }
}

class trav {
    public static void main(String[] args) {
        bike b1 = new bike("Honda", "Sport", "CBR");
        b1.display();
        b1.start();

        System.out.println();

        carr c1 = new carr("BMW", "Sedan", "X5");
        c1.display();
        c1.start();
    }
}
