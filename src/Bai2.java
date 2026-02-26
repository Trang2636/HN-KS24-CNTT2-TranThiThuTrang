import java.util.*;

public class Bai2 {

    public static List<String> xuLy(List<String> in) {
        List<String> out = new ArrayList<>();

        for (String s : in) {
            if (!out.contains(s)) {
                out.add(s);
            }
        }

        Collections.sort(out);
        return out;
    }

    public static void main(String[] args) {

        List<String> in = Arrays.asList(
                "Paracetamol",
                "Ibuprofen",
                "Panadol",
                "Paracetamol",
                "Aspirin",
                "Ibuprofen"
        );

        System.out.println("Input: " + in);
        System.out.println("Output: " + xuLy(in));
    }
}