package btth;

import java.util.Scanner;

public class MainMenu {

    static Scanner sc = new Scanner(System.in);
    static PatientManager manager = new PatientManager();

    public static void main(String[] args) {

        while (true) {
            displayMenu();
            int choice = Integer.parseInt(sc.nextLine());
            handleMenuSelection(choice);
        }
    }

    public static void displayMenu() {
        System.out.println("\n===== QUẢN LÝ BỆNH NHÂN =====");
        System.out.println("1. Thêm bệnh nhân");
        System.out.println("2. Xóa bệnh nhân");
        System.out.println("3. Cập nhật bệnh nhân");
        System.out.println("4. Tìm kiếm theo tên");
        System.out.println("5. Hiển thị danh sách");
        System.out.println("0. Thoát");
        System.out.print("Chọn: ");
    }

    public static void handleMenuSelection(int choice) {

        switch (choice) {

            case 1:
                add();
                break;

            case 2:
                System.out.print("Nhập ID cần xóa: ");
                int idRemove = Integer.parseInt(sc.nextLine());
                manager.removePatient(idRemove);
                break;

            case 3:
                update();
                break;

            case 4:
                System.out.print("Nhập tên cần tìm: ");
                String name = sc.nextLine();
                manager.searchPatientByName(name);
                break;

            case 5:
                manager.displayPatients();
                break;

            case 0:
                System.out.println("Kết thúc chương trình.");
                System.exit(0);

            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    private static void add() {
        System.out.print("ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Tên: ");
        String name = sc.nextLine();

        System.out.print("Tuổi: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Giới tính: ");
        String gender = sc.nextLine();

        System.out.print("Bệnh lý: ");
        String disease = sc.nextLine();

        manager.addPatient(new Patient(id, name, age, gender, disease));
    }

    private static void update() {
        System.out.print("Nhập ID cần cập nhật: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Tên mới: ");
        String name = sc.nextLine();

        System.out.print("Tuổi mới: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Giới tính mới: ");
        String gender = sc.nextLine();

        System.out.print("Bệnh lý mới: ");
        String disease = sc.nextLine();

        manager.updatePatient(id, new Patient(id, name, age, gender, disease));
    }
}