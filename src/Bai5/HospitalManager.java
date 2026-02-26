package Bai5;

import java.util.*;

public class HospitalManager {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Patient> list = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chẩn đoán");
            System.out.println("3. Xuất viện");
            System.out.println("4. Sắp xếp danh sách");
            System.out.println("5. Hiển thị danh sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    updateDiagnosis();
                    break;
                case 3:
                    dischargePatient();
                    break;
                case 4:
                    sortPatients();
                    break;
                case 5:
                    showPatients();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    static void addPatient() {
        System.out.print("Nhập ID: ");
        String id = sc.nextLine();

        if (findById(id) != null) {
            System.out.println("ID đã tồn tại!");
            return;
        }

        System.out.print("Nhập tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = sc.nextLine();

        list.add(new Patient(id, name, age, diagnosis));
        System.out.println("Đã thêm bệnh nhân.");
    }

    static void updateDiagnosis() {
        System.out.print("Nhập ID cần cập nhật: ");
        String id = sc.nextLine();

        Patient p = findById(id);

        if (p == null) {
            System.out.println("Không tìm thấy bệnh nhân!");
            return;
        }

        System.out.print("Nhập chẩn đoán mới: ");
        String newDiagnosis = sc.nextLine();
        p.setDiagnosis(newDiagnosis);

        System.out.println("Cập nhật thành công.");
    }

    static void dischargePatient() {
        System.out.print("Nhập ID xuất viện: ");
        String id = sc.nextLine();

        Patient p = findById(id);

        if (p == null) {
            System.out.println("Không tìm thấy bệnh nhân!");
            return;
        }

        list.remove(p);
        System.out.println("Đã xuất viện.");
    }

    static void sortPatients() {

        Collections.sort(list, new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {

                if (p2.getAge() != p1.getAge()) {
                    return p2.getAge() - p1.getAge();
                }

                return p1.getFullName().compareToIgnoreCase(p2.getFullName());
            }
        });

        System.out.println("Đã sắp xếp.");
    }

    static void showPatients() {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }

        for (Patient p : list) {
            System.out.println(p);
        }
    }

    static Patient findById(String id) {
        for (Patient p : list) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
}