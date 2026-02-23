import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=0;
        int min =100;
        for(int i =0 ; i<7;i++){
            if (i==6){
                System.out.println("Nhap luot muon ngay chu nhat:");
            }else{
                System.out.println("Nhap luot muon ngay thu" + (i+2) );
            }
            int num = sc.nextInt();

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }




        }
        System.out.println("\n-- Ket qua --");
        System.out.println("Luot muon cao nhat: " + max);
        System.out.println("Luot muon thap nhat: " + min);
    }
}
