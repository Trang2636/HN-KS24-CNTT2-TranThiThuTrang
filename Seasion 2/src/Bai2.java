import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                'A': "Tầng 1: Sách Văn học"
                'B': "Tầng 2: Sách Khoa học"
                'C': "Tầng 3: Sách Ngoại ngữ"
                'D': "Tầng 4: Sách Tin học"
                Nhập mã thể loại sách (A, B, C, D): "
                """);
        char choose = sc.next().toUpperCase().charAt(0);
        switch (choose){
            case 'A':
                System.out.println("Tầng 1: Sách Văn học");
                break;
            case 'B':
                System.out.println("Tầng 2: Sách Khoa học");
                break;
            case 'C':
                System.out.println("Tầng 3: Sách Ngoại ngữ");
                break;
            case 'D':
                System.out.println("Tầng 4: Sách Tin học");
                break;
            default:
                System.out.println("Mã không hợp lệ!");

        }
        sc.close();
    }

}
