import java.util.Objects;

public class Employee {
    private final String name;
    private int department;
    private double salary;
    private static int counter = 0;
    private final int id;

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Employee.counter = counter;
    }

    public int getId() {
        return id;
    }

    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public static void listAllNames(Object a) {
        for (int i = 0; i < 10; i++) {
            System.out.println(a.toString());
        }
    }



    @Override
    public String toString() {
        return name + ", department no.:  " + department + ", salary " + salary + ", id: " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(salary, employee.salary) == 0 && id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary, id);
    }
}
