import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee("Kemal",2000,45,1985);
        employee.tax();
        employee.bonus();
        employee.raiseSalary();
        System.out.println(employee.toString());
    }
}