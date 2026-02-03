package com.studentmanagement.th;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Student> list = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo Học lực");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.println("==================================");
            System.out.print("Chọn chức năng: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                choice = 0;
            }

            switch (choice) {
                case 1: inputStudents(); break;
                case 2: displayStudents(); break;
                case 3: searchByRank(); break;
                case 4: sortByScore(); break;
                case 5: System.out.println("Tạm biệt!"); break;
                default: System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);
    }

    // Chức năng 1: Nhập danh sách
    public static void inputStudents() {
        System.out.print("Nhập số lượng sinh viên: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (list.size() + 1) + ":");

            String id;
            while (true) {
                System.out.print("Nhập ID bắt đầu bằng SV: ");
                id = sc.nextLine();
                if (id.startsWith("SV") && id.length() == 5 && id.substring(2).matches("\\d+")) {
                    break;
                }
                System.out.println("ID sai định dạng! Vui lòng nhập lại (VD: SV001).");
            }

            System.out.print("Nhập tên: ");
            String name = sc.nextLine();

            System.out.print("Nhập điểm: ");
            double score = Double.parseDouble(sc.nextLine());

            list.add(new Student(id, name, score));
        }
    }

    // Chức năng 2: Hiển thị (Sử dụng Getter thay vì toString)
    public static void displayStudents() {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        System.out.printf("%-10s | %-20s | %-5s | %-12s\n", "Mã SV", "Họ Tên", "Điểm", "Học Lực");
        for (Student s : list) {
            System.out.printf("%-10s | %-20s | %-5.1f | %-12s\n",
                    s.getId(), s.getName(), s.getScore(), s.getRank());
        }
    }

    // Chức năng 3: Tìm kiếm
    public static void searchByRank() {
        System.out.print("Nhập loại học lực cần tìm (Gioi/Kha/Trung Binh): ");
        String rank = sc.nextLine();
        boolean found = false;
        for (Student s : list) {
            if (s.getRank().equalsIgnoreCase(rank)) {
                System.out.printf("Mã: %s | Tên: %s | Điểm: %.1f | Học lực: %s\n",
                        s.getId(), s.getName(), s.getScore(), s.getRank());
                found = true;
            }
        }
        if (!found) System.out.println("Không tìm thấy sinh viên nào!");
    }

    // Chức năng 4: Sắp xếp
    public static void sortByScore() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getScore() < list.get(j).getScore()) {
                    Student temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println("Đã sắp xếp danh sách giảm dần!");
        displayStudents();
    }
}