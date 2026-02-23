import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach can quan ly: ");
        int n = sc.nextInt();

        int[] arrInt = addBookToLibraries(n);

        System.out.println("Danh sach ma sach:");
        displayLibraries(arrInt);
    }

    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("Nhap ma so cho " + n + " cuon sach:");
        for (int i = 0; i < n; i++) {
            System.out.print("Sach thu " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void displayLibraries(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}