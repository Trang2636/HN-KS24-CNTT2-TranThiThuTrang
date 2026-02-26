import java.util.*;

public class Bai3 {

    public static <T> List<T> findCommonPatients(List<T> a, List<T> b) {
        List<T> result = new ArrayList<>();

        for (T item : a) {
            if (b.contains(item) && !result.contains(item)) {
                result.add(item);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(101, 102, 105);
        List<Integer> list2 = Arrays.asList(102, 105, 108);

        List<Integer> kq1 = findCommonPatients(list1, list2);
        System.out.println("Test Case 1 Output: " + kq1);

        List<String> list3 = Arrays.asList("DN01", "DN02", "DN03");
        List<String> list4 = Arrays.asList("DN02", "DN04");

        List<String> kq2 = findCommonPatients(list3, list4);
        System.out.println("Test Case 2 Output: " + kq2);
    }
}