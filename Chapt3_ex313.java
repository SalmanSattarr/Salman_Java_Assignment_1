public class Chapt3_ex313 {
    public static void main(String[] args){
        Employee firstEmployee = new Employee("Salman", "Abdul Sattar", 20000);
        Employee secondEmployee = new Employee("John", "Doe", 10000);
        
        //Salaries before raise
        System.out.println(" ");
        System.out.println("Yearly salary: " + firstEmployee.getFirstName() + " " + firstEmployee.getLastName() + ": " + "$" + firstEmployee.salaryPerYear());
        System.out.println("Yearly salary: " + secondEmployee.getFirstName() + " " + secondEmployee.getLastName() + ": " + "$" + secondEmployee.salaryPerYear());
        System.out.println(" ");
        // Give Raise
        firstEmployee.Raise(10);
        secondEmployee.Raise(10);

        //After Raise
        System.out.println("Yearly salary after 10% raise: " + firstEmployee.getFirstName() + " " + firstEmployee.getLastName() + ": " + "$" + firstEmployee.salaryPerYear());
        System.out.println("Yearly salary after 10% raise: " + secondEmployee.getFirstName() + " " + secondEmployee.getLastName() + ": " + "$" + secondEmployee.salaryPerYear());
        System.out.println(" ");
    } // end main
} // end class