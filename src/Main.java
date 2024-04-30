import java.util.Random;

public class Main {
    private static final Employee[] employees = new Employee[10];
    private static final Random random = new Random(1);
    public static void main(String[] args) {
        for (int i = 0; i < employees.length; i++) {
            double salary = Math.round(20_000 + 50_000 * random.nextDouble());
            employees[i] = new Employee("ФИО: " + i, random.nextInt(1, 6), salary);
        }

        System.out.println(getMinSalaryEmployee());
        System.out.println(getSalarySum());
        System.out.println(getMaxSalaryEmployee());
        System.out.println(getMedianSalaryValue());
        getNamesPrinted();
    }

    public static void listNames() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double getSalarySum() {
        var sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    private static Employee getMinSalaryEmployee() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    private static Employee getMaxSalaryEmployee() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public static double getMedianSalaryValue() {
        var sum = 0;
        var value = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
            value = sum / employees.length;
        }
        return value;
    }

    public static void getNamesPrinted() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}
