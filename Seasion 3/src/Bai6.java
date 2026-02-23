import java.util.Arrays;

public class Bai6{
    public static void main(String[] args) {
        int[] arrayFirst = {101, 105, 110, 115};
        int[] arraySecond = {102, 105, 115, 120, 130};

        System.out.println("Kho cũ: " + Arrays.toString(arrayFirst));
        System.out.println("Lô mới: " + Arrays.toString(arraySecond));

        int[] finalLibrary = mergeBooks(arrayFirst, arraySecond);

        System.out.println("\nDanh sách sau khi gộp và lọc trùng:");
        System.out.println(Arrays.toString(finalLibrary));
    }

    public static int[] mergeBooks(int[] a, int[] b) {
        // Mảng tạm có độ dài tối đa bằng tổng 2 mảng
        int[] temp = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                temp[k++] = a[i++];
            } else if (a[i] > b[j]) {
                temp[k++] = b[j++];
            } else {
                // Hai mã sách trùng nhau: chỉ lấy 1 và tăng cả 2 chỉ số
                temp[k++] = a[i++];
                j++;
            }
        }

        // Chép phần còn lại của mảng a (nếu có)
        while (i < a.length) {
            temp[k++] = a[i++];
        }

        // Chép phần còn lại của mảng b (nếu có)
        while (j < b.length) {
            temp[k++] = b[j++];
        }

        // Vì k là số lượng phần tử thực tế, ta cắt mảng temp về đúng kích thước k
        return Arrays.copyOf(temp, k);
    }
}