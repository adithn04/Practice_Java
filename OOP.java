import java.util.*;

class Stud {
    String name;
    int rollno;

    void greet() {
        System.out.println("hello " + name);
    }
}

public class OOP {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Stud[] arr = new Stud[2];

        for (int i = 0; i < 2; i++) {

            arr[i] = new Stud();

            System.out.println("Enter name for student " + (i + 1) + ":");
            arr[i].name = input.nextLine();

            System.out.println("Enter rollno for student " + (i + 1) + ":");
            arr[i].rollno = input.nextInt();

            input.nextLine();

        }
        System.out.println("Student details:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Name: " + arr[i].name);
            System.out.println("Roll No: " + arr[i].rollno);
            arr[i].greet();
        }
        input.close();
    }
}
