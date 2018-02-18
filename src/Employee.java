public class Employee {
    private String name;
    private int number;
    private int shift;

    // Use the constructor to set the private variables for the employee
    Employee(String cName, int cNumber, int cShift) {
        name = cName;
        number = cNumber;
        shift = cShift;
    }

    // Return the employee name
    public String getName() {
        return name;
    }

    // Set the employee name
    public void setName(String pName) {
        name = pName;
    }

    // Return the employee number
    public int getNumber() {
        return number;
    }

    // Set the employee number
    public void setNumber(int pNumber) {
        number = pNumber;
    }

    // Return the employee shift
    public int getShift() {
        return shift;
    }

    // Set the employee shift
    public void setShift(int pShift) {
        shift = pShift;
    }

    // Display the data for the employee to the user
    public void displayInformation() {
        System.out.println("Employee Name:  " + name);
        System.out.println("Employee Number:  " + number);
        System.out.println("Employee Shift:  " + shift);
        System.out.println();
    }
}
