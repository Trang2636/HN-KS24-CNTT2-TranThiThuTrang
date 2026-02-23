import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Giả sử thư viện ban đầu có 5 mã sách
        int[] books = {101, 102, 103, 104, 105};
        int n = 5; // Số lượng sách thực tế đang có

        while (n > 0) {
            System.out.println("\nDanh sách sách hiện tại:");
            display(books, n);

            System.out.print("Nhập mã sách muốn xóa (hoặc nhập -1 để dừng): ");
            int bookId = sc.nextInt();

            if (bookId == -1) break;

            int newN = deleteBook(books, n, bookId);

            if (newN == n) {
                System.out.println("=> Không tìm thấy mã sách " + bookId);
            } else {
                n = newN;
                System.out.println("=> Xóa thành công!");
            }
        }

        if (n == 0) System.out.println("Thư viện đã trống!");
        System.out.println("Kết thúc chương trình.");
    }

    public static int deleteBook(int[] arr, int n, int bookId) {
        int index = -1;

        // Bước 1: Tìm vị trí của mã sách
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                index = i;
                break;
            }
        }

        // Bước 2: Nếu tìm thấy, thực hiện dồn mảng
        if (index != -1) {
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1]; // Phần tử sau đè lên phần tử trước
            }
            return n - 1; // Trả về số lượng phần tử mới
        }

        return n; // Không xóa được thì trả về n cũ
    }

    public static void display(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i < n - 1 ? ", " : ""));
        }
        System.out.println();
    }
}