import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap ma ID sach moi (phai>0)");
             n = sc.nextInt();
        }while (n<=0);
        System.out.println("Ma ID hop le: " + n);
        sc.close();
    }

}
