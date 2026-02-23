import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {11,9,3,2};
        System.out.println("Mảng trước khi sắp xếp: " + Arrays.toString(arr));
        sortBooks(arr);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
    }

    public static void sortBooks(int[] arr) {
        for(int j=0 ; j< arr.length-1;j++) {
            for (int i = 0; i < arr.length - 1-j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

    }
}
