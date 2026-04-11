public class car {
    String brand;
    int speed;

    void display() {
        System.out.println("brand: " + brand);
        System.out.println("speed: " + speed);
    }

    void IncreaseSpeed(int val) {
        speed = speed + val;
    }

    public static void main(String[] args) {
        car c1 = new car();
        c1.brand = "BMW";
        c1.speed = 200;
        c1.IncreaseSpeed(50);

        System.out.println("Car 1 details:");
        c1.display();

        car c2 = new car();
        c2.brand = "Audi";
        c2.speed = 250;
        c2.IncreaseSpeed(50);

        System.out.println("Car 2 details:");
        c2.display();

    }
}
