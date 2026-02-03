import java.util.Scanner;
import java.util.regex.Pattern;

public class Thuchanh {
    public static String[] studentIds = new String[100];
    public static int currentSize = 0;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            System.out.print("Chọn chức năng (1-6): ");
            if (!sc.hasNextInt()) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên!");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    displayStudents();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    searchStudent();
                    break;
                case 6:
                    System.out.println(" Chương trình kết thúc");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại (1-6).");
            }
        }
    }

    // 1. Hiển thị Menu
    public static void printMenu() {
        System.out.println("\n========= QUẢN LÝ MÃ SỐ SINH VIÊN =========");
        System.out.println("1. Hiển thị danh sách MSSV");
        System.out.println("2. Thêm mới MSSV");
        System.out.println("3. Cập nhật MSSV theo vị trí");
        System.out.println("4. Xóa MSSV");
        System.out.println("5. Tìm kiếm MSSV");
        System.out.println("6. Thoát");
        System.out.println("===========================================");
    }

    // 2. Regex kiểm tra định dạng
    public static boolean isValidMSSV(String mssv) {
        String regex = "^B\\d{7}$";
        return Pattern.matches(regex, mssv);
    }

    // 3. Chức năng Hiển thị
    public static void displayStudents() {
        if (currentSize == 0) {
            System.out.println("Danh sách hiện đang rỗng.");
            return;
        }
        System.out.println("\nDANH SÁCH SINH VIÊN:");
        for (int i = 0; i < currentSize; i++) {
            System.out.printf("%d. %s\n", (i + 1), studentIds[i]);
        }
    }

    // 4. Chức năng Thêm mới
    public static void addStudent() {
        if (currentSize >= 100) {
            System.out.println("Mảng đã đầy (100 phần tử), không thể thêm mới.");
            return;
        }

        String newId;
        while (true) {
            System.out.print("Nhập MSSV mới (Ví dụ B2101234): ");
            newId = sc.nextLine().trim();
            if (isValidMSSV(newId)) {
                studentIds[currentSize] = newId;
                currentSize++;
                System.out.println("Thêm mới thành công!");
                break;
            } else {
                System.out.println("Định dạng sai! MSSV phải bắt đầu bằng chữ B và theo sau là 7 chữ số.");
            }
        }
    }

    // 5. Chức năng Cập nhật
    public static void updateStudent() {
        System.out.print("Nhập vị trí index cần sửa (0 - " + (currentSize - 1) + "): ");
        if (!sc.hasNextInt()) {
            System.out.println("Vị trí phải là một số.");
            sc.next();
            return;
        }
        int index = sc.nextInt();
        sc.nextLine();

        if (index < 0 || index >= currentSize) {
            System.out.println("Vị trí không hợp lệ!");
            return;
        }

        while (true) {
            System.out.print("Nhập MSSV mới cho vị trí " + index + ": ");
            String updateId = sc.nextLine().trim();
            if (isValidMSSV(updateId)) {
                studentIds[index] = updateId;
                System.out.println("Cập nhật thành công!");
                break;
            } else {
                System.out.println("Định dạng sai! Vui lòng nhập lại.");
            }
        }
    }

    // 6. Chức năng Xóa và dồn mảng
    public static void deleteStudent() {
        System.out.print("Nhập MSSV cụ thể cần xóa: ");
        String deleteId = sc.nextLine().trim();
        int foundIndex = -1;

        for (int i = 0; i < currentSize; i++) {
            if (studentIds[i].equalsIgnoreCase(deleteId)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            for (int i = foundIndex; i < currentSize - 1; i++) {
                studentIds[i] = studentIds[i + 1];
            }
            studentIds[currentSize - 1] = null;
            currentSize--;
            System.out.println("Đã xóa MSSV: " + deleteId);
        } else {
            System.out.println("Không tìm thấy MSSV này trong danh sách.");
        }
    }

    // 7. Chức năng Tìm kiếm
    public static void searchStudent() {
        System.out.print("Nhập chuỗi ký tự để tìm kiếm: ");
        String keyword = sc.nextLine().toLowerCase();
        boolean found = false;

        System.out.println("Kết quả tìm kiếm:");
        for (int i = 0; i < currentSize; i++) {
            if (studentIds[i].toLowerCase().contains(keyword)) {
                System.out.println("- " + studentIds[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy kết quả phù hợp.");
        }
    }
}