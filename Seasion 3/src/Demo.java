import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        int[] arrInt;
//        int[][] array2D={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        Object[] arrayObject;
//
//        //cấp phát bộ nhớ cho mảng
//        arrInt= new int[5];
//        arrayObject = new Object[3];
//
//        //khai báo và khởi tạo trực tiếp
//        String[] arrayStr = {"Java","Python"};
//
//        //ktra độ dài mảng
//        System.out.println("Độ dài mảng arrayInt" + arrInt.length);
//
//        //duyệt mảng : thuật toán tìm kiếm tuần tự
//        // for i : duyệt theo chỉ số
//        // duyệt mảng arrayInt để tìm số lớn nhất
//        int max = arrInt[0];
//        for(int i =1 ; i<arrInt.length;i++){
//            if(arrInt[i]>max)
//                max = arrInt[i];
//        }
//        // for each : duyệt theo giá trị
//        for(int e: arrInt) {
//            System.out.println("Element: "+ e);
//        }


        //kỹ thuật lập trình
        // count,sum, multi, average, min, max, flag, search
        //đếm số lượng phần tử trong 1 danh sách cho trước
        // tính tổng của các ptu trong mảng số
        //tính min max trong 1 danh sách
        // bài toán cắm cờ
        //khi bài toán ycau ktra kết quả là có hay k mà cần xảy ra đk if ở trong 1 vòng lặp ít nhất 1 lần


        // bài tập
        //1.1 : nhập và in mảng , cho ng dùng nhập vào số lượng phần tử mảng n và nhập n gtri cho từng ptu
        //tiến hành in ra các ptu trong mảng vừa nhập
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang");
        int[] arrayInt;
        int n = sc.nextInt();
        arrayInt = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Phan tu i" + (i+1));
            arrayInt[i] = sc.nextInt();
        }
        System.out.printf("Mang vua nhap :");
        for (int e : arrayInt){
            System.out.printf("%d ",e);
        }

        int min = arrayInt[0];
        int max = arrayInt[0];

        for (int e : arrayInt) {
            if (e < min) {
                min = e;
            }
            if (e > max) {
                max = e;
            }
        }

        System.out.println("\nGia tri nho nhat (min): " + min);
        System.out.println("Gia tri lon nhat (max): " + max);

        //1.2 : ptrien bài 1.1 thêm các ycau
        //yc 1 : tìm và in các số nguyên tố trong mảng
        // tính tổng các số fibonaci trong mảng
        // tìm min, max trong mảng
        // tính tổng các giai thừa của từng phần tử trong mảng


//        for(int e: arrayInt){
//            if(e<2) continue;
//            boolean isPrime = true;
//            for (int i=2; i<= Math.sqrt(e);i++){
//                if(e%i==0){
//                    isPrime=false;
//                    break;
//                }
//            }
//            if(isPrime)
//                System.out.printf("%d ",e);
//        }

        for (int e : arrayInt) {
            if (isPrime(e)) {
                System.out.print(e + " ");
            }
        }



        int sum =0;
        for(int e: arrayInt){
            if(isFibonaci(e)){
                sum +=e;
            }
        }
        System.out.println("\nTong cac so Fibonacci trong mang: " + sum);


    }


    //tìm min max


    public static boolean isPrime(int e) {
        if(e<2) return false;
        for(int i=2; i<= Math.sqrt(e);i++){
            if(e%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean isFibonaci(int n) {
        if(n<0) return false;
        int f1 =0;
        int f2 =1;
        while (f2<n){
            int f3 = f1+f2;
            f1=f2;
            f2=f3;
        }
        return (n == f1 || n == f2);

    }
}
