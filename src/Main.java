
public class Main {
    // Use the constructors to fill the employee data
    private static Employee employee1 = new Employee("John Doe", 123456, 1);
    private static Employee employee2 = new Employee("Jane Erick", 789876, 2);
    private static Employee employee3 = new Employee("Britney Square", 987654, 3);

    public static void main(String Args[]) {
        // Call all the public displayInformation() procedures for each employee instance
        employee1.displayInformation();
        employee2.displayInformation();
        employee3.displayInformation();
    }
}
