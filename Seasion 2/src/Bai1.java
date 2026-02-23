import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tuoi cua ban : ");
        int age = sc.nextInt();

        System.out.println("Nhap so sach dang muon: ");
        int num = sc.nextInt();

        if(age < 18){
            System.out.println("Ket qua : Khong du dieu kien do chua du 18 tuoi");
        } else if (num>3) {
            System.out.println("Ket qua : Khong du dieu kien do ban da muon toi da 3 cuon");
        }else{
            System.out.println("Ban du dieu kien muon sach quy hiem");
        }

        sc.close();
    }

}
