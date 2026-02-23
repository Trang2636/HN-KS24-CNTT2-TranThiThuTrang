import java.math.BigDecimal;

public class Employee {
    String employeeID;
    String fullName;
    BigDecimal salary;

    public Employee(String employeeID) {
        this.employeeID = employeeID;
    }

    public Employee(){
        employeeID="";
        fullName="";
        salary=BigDecimal.ZERO;
    }

    public Employee(String employeeID, String fullName, BigDecimal salary) {
        this.employeeID = employeeID;
        this.fullName = fullName;
    }
}

