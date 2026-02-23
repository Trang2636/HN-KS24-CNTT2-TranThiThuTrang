import baitap.*;

public class Main {
    public static void main(String[] args) {
        // Bai 1
        Student student = new Student(
                "nnmm",
                29,
                "SV001",
                8.5
        );
        student.displayInfo();
        System.out.println("---------------------\n");


        // Bai 2
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.sound();
        animal2.sound();
        System.out.println("---------------------\n");


        // Bai 3
        Manager manager = new Manager(
                "mlkj",
                15000000,
                "Phòng Kỹ Thuật"
        );
        manager.displayInfo();
        System.out.println("---------------------\n");


    }
}