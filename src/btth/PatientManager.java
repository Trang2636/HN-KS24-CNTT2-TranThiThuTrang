package btth;

import java.util.ArrayList;
import java.util.List;

public class PatientManager {

    private List<Patient> patientList = new ArrayList<>();

    public void addPatient(Patient patient) {
        if (findById(patient.getId()) != null) {
            System.out.println("ID đã tồn tại!");
            return;
        }
        patientList.add(patient);
        System.out.println("Thêm thành công.");
    }

    public void removePatient(int patientId) {
        Patient p = findById(patientId);
        if (p == null) {
            System.out.println("Không tìm thấy bệnh nhân.");
            return;
        }
        patientList.remove(p);
        System.out.println("Đã xóa bệnh nhân.");
    }

    public void updatePatient(int patientId, Patient updatedPatient) {
        Patient p = findById(patientId);
        if (p == null) {
            System.out.println("Không tìm thấy bệnh nhân.");
            return;
        }

        p.setName(updatedPatient.getName());
        p.setAge(updatedPatient.getAge());
        p.setGender(updatedPatient.getGender());
        p.setDisease(updatedPatient.getDisease());

        System.out.println("Cập nhật thành công.");
    }

    public void searchPatientByName(String name) {
        boolean found = false;

        for (Patient p : patientList) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(p);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy bệnh nhân.");
        }
    }

    public void displayPatients() {
        if (patientList.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }

        for (Patient p : patientList) {
            System.out.println(p);
        }
    }

    private Patient findById(int id) {
        for (Patient p : patientList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
