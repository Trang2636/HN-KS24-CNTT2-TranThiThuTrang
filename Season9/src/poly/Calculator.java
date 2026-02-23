package poly;

public class Calculator {

    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b,int c){
        return a+b+c;
    }
    public static int sum(int[] arr){
        int sum=0;
        for (int value:arr){
            sum+=value;
        }
        return sum;
    }
}
