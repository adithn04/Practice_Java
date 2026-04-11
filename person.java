public class person {
    String name;

    person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("name: " + name);
    }
}

class student extends person {
    int mark;

    student(String name, int mark) {
        super(name);
        this.mark = mark;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Mark: " + mark);
    }
}

class sor {
    public static void main(String[] args) {
        student s1 = new student("john", 90);
        s1.display();
    }
}
