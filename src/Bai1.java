import java.util.ArrayList;
import java.util.Iterator;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Double> nhietDoList = new ArrayList<>();
        nhietDoList.add(36.5);
        nhietDoList.add(40.2);
        nhietDoList.add(37.0);
        nhietDoList.add(12.5);
        nhietDoList.add(39.8);
        nhietDoList.add(99.9);
        nhietDoList.add(36.8);
        System.out.println("Danh sach ban dau: " +nhietDoList);
        Iterator<Double> iterator = nhietDoList.iterator();
        while (iterator.hasNext()){
            Double nhietDo = iterator.next();
            if(nhietDo<34.0 ||nhietDo>42.0 ){
                iterator.remove();
            }
        }
        System.out.println("Danh sach sau khi loc :"+ nhietDoList);

        double tong= 0;
        for( Double nhietDo : nhietDoList){
            tong+= nhietDo;
        }
        double trungBinh = tong / nhietDoList.size();
        System.out.printf("Nhiet do tbinh: %.2f\n",trungBinh);
    }
}
