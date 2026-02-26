import java.util.LinkedList;

public class Bai4 {

    private LinkedList<String> queue = new LinkedList<>();

    public void patientCheckIn(String name) {
        queue.addLast(name);
    }

    public void emergencyCheckIn(String name) {
        queue.addFirst(name);
    }

    public void treatPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không có bệnh nhân.");
            return;
        }

        String name = queue.pollFirst();

        if (queue.size() >= 0) {
            if (name.equals("C")) {
                System.out.println("Đang cấp cứu: " + name);
            } else {
                System.out.println("Đang khám: " + name);
            }
        }
    }

    public static void main(String[] args) {

        Bai4 er = new Bai4();

        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");

        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}