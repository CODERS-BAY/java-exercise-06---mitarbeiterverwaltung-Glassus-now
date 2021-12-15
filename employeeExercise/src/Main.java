import java.util.*;

public class Main {
    public static void main(String[] args) {
        application();
    }

    static int size = 2;
    static int index = 0;
    static Employee[] employees = new Employee[size];

    private static int generateID() {
        return new Random().nextInt(1000);
    }

    private static void application () {
        Scanner scan = new Scanner(System.in);
        String input;
        int count = 0;
        do {
            System.out.println("Bitte legen Sie ein Abteilung an:");
            Department department = new Department(scan.nextLine(), generateID(), scan.nextLine(), scan.nextLine());
            System.out.println("Bitte legen Sie einen Mitarbeiter an:");
            Employee employee = new Employee(scan.nextLine(), scan.nextLine(), generateID(), department);
            System.out.println("Sie haben folgenden Mitarbeiter angelegt:");
            employee.print();
            addEmployeeToArray(employee);
            System.out.println("Möchten Sie einen weiteren Mitarbeitzer anlegen?");
            System.out.println("Drücken Sie j für JA und n für NEIN:");
            input = scan.nextLine();
            count++;

        } while (input.equals("j"));
        System.out.println("Sie haben folgende Mitarbeiter angelegt:");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null)
            employees[i].print();
        }
        System.out.println("Auf Wiedersehen!");

    }

    private static void addEmployeeToArray(Employee employee) {
        if(index > size -1) {
            doubleArray();
        }
        employees[index++] = employee;
    }

    private static void doubleArray() {
        Employee[] newEmp = employees;
        size *= 2;
        employees = new Employee[size];

        int index = 0;
        for (Employee emp : newEmp) {
            employees[index++] = emp;
        }
    }
}
