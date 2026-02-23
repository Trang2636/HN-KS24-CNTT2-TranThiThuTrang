import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Văn học", "Mác", "Triết","Anh"};
        int[] quantities = {3,9,10,2};
        maxQuantityOfBooks(names,quantities);
    }

    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
                int max = quantities[0];
                int min = quantities[0];
                int indexMax = -1;
                int indexMin = -1;
                for (int i=0; i<names.length;i++){
                    if(max< quantities[i]){
                        max= quantities[i];
                        indexMax = i;

                    }
                    if(min> quantities[i]){
                        min = quantities[i];
                        indexMin=i;

                    }
                }

                    System.out.println("Sach co so luong nhieu nhat "+max);
                    System.out.printf("%s",names[indexMax]);
                    System.out.println("Sach co so luong it nhat "+min);
                    System.out.printf("%s",names[indexMin]);




    }
}
