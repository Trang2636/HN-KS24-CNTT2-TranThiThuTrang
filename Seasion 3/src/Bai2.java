import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = {
                "Triết", "Toán","Vật lý", "Ngữ văn", "Tiếng Anh"
        };
        System.out.println("Nhap ten sach ban muon tim kiem : ");
        String name = sc.nextLine().trim();
        searchBooks(books,name);
    }

    public static void searchBooks(String[] arr, String search) {
        boolean check = false;
        for(int i=0; i< arr.length; i++){
            if(arr[i].trim().equalsIgnoreCase(search)){
                System.out.println("Tim thay tai vi tri "+ (i+1));
                check = true;
                break;
            }
            }
        if(!check)
            System.out.println("Sach khong ton tai");
        }

    }

