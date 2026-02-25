import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu mang");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhap vao phan tu ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhap vao chi so index muon xoa ");
        int x = sc.nextInt();
        int k=0;
        for(int i=0;i<n;i++){
            if(i==x-1){
                continue;
            }
                System.out.printf("%d\n",arr[i]);


        }


    }


}
