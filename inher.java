class inher {
    String name;
    int speed;

    inher(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
}

class cars extends inher {
    public String brand = "BMW";

    cars(String name, int speed) {
        super(name, speed);
    }

    void display() {
        System.out.println("brand: " + brand);
        System.out.println("name: " + name);
        System.out.println("speed: " + speed);
    }
}

class Main {
    public static void main(String[] args) {
        cars c1 = new cars("X5", 200);
        c1.display();
    }
}
