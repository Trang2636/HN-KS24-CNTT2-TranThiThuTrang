import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sach tra muon: ");
        int n = sc.nextInt();
    int totalday=0;
       for (int i =0; i< n; i++){
           System.out.printf("Nhap so ngay tre cua cuon thu %d:" ,i+1);
           int day = sc.nextInt();
           totalday += day;
       }
       int total = totalday * 5;
        System.out.printf("tong tien: %d",total);
        sc.close();
    }
}
