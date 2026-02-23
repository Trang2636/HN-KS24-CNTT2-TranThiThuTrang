import com.rikkeiedu.managerment.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[100];
        int currentIndex = 3;
        int choice = 0;
        do {
            System.out.println("""
                    ======MENU=====
                    1.Ad Student 
                    2.Show All Students
                    3.AvgScore All Students
                    4.Exit
                    """);
        }while (choice!=4);
        }
    }
