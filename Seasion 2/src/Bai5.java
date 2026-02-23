import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 100;

        System.out.println("""
                    -- HE THONG DANH GIA DOC GIA --
                    (Nhap so ngay tre. Nhap 999 de ket thuc)
                    """);
        int num = sc.nextInt();
        while (num!=999){
            if (num<=0){
                System.out.println("Dung han +5 diem");
                max = max+5 ;
            }else{
                System.out.println("Tra tre"+ num+ " ngay - "+ num*2 + " diem");
                max = max - (num*2);
            }
            System.out.printf("Tong diem uy tin:%d ", max);
            if(max >120){
                System.out.println("Doc gia than thiet");
            } else if (max>=80 && max <= 120) {
                System.out.println("Doc gia tieu chuan");
            }else {
                System.out.println("Doc gia can luu ý");
            }
        num = sc.nextInt();
        }
    }
}
