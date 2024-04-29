// *************************************************************** Employee class
public class Employee {
    private String firstName;
    private String lastName;
    private double salaryPerMonth;

    public Employee(String firstName, String lastName, double salaryPerMonth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryPerMonth = (salaryPerMonth > 0) ? salaryPerMonth : 0.0; //ternary operator usage 
    }
    // **********************************************  Get methods 
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public double getSalaryPerMonth(double salaryPerMonth) {
        return salaryPerMonth;
    }
    // ********************************************** Set Methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = (salaryPerMonth > 0) ? salaryPerMonth : 0.0;
    }
    // ********************************************* Other Methods
    public double salaryPerYear() {
        return salaryPerMonth * 12;
    }
    public void Raise(double per) {
        double raise = (per > 0 ? ((salaryPerMonth * per) / 100) : 0);
        salaryPerMonth = salaryPerMonth + raise;
    } 
} // ************************************************ end of class
