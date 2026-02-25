import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao so phan tu mang");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++) {
                System.out.println("Nhap vao phan tu ");
                arr[i] = sc.nextInt();
            }
            boolean flag = false;
            for(int i=0;i<n;i++){
                int x=0;
                    int max = arr[0];
                    if(arr[i]>max){
                        max= arr[i];
                        x= max;
                        flag=true;
                        if (flag){
                            for(int j=0;j<x;j++){
                                if(arr[j]!=j){
                                    System.out.printf("%d\n",j);
                                }
                            }
                        }
                }

            }




    }
}
