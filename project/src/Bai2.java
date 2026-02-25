public class Bai2 {
    public static void main(String[] args) {
        String input= "leetcode";
        boolean flag = false;
        int count =0;
        int index = -1;
        char c ;
        for(int i=0; i<input.length()-1;i++){
            for (int j=1;j<input.length();j++){
                if(input.charAt(i)==input.charAt(j)){
                    flag=true;
                    count++;
                    if(count !=0){
                        System.out.printf("%c",input.charAt(i));
                    }else{
                        System.out.println("không tìm thấy");
                    }
                }
            }

        }

    }
}
