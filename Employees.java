package _11_Urlopy;

import java.util.Arrays;
import java.util.List;

import static _11_Urlopy.Departament.*;


public class Employees {

    public static final Employee ANNA = new Employee("Anna", HR);
    public static final Employee BASIA = new Employee("Basia", MANAGEMENT);
    public static final Employee KASIA = new Employee("Kasia", IT);
    public static final Employee ZDZISIEK = new Employee("Zdzisiek", HR);

    public static final List<Employee> EMPLOYEES = Arrays.asList(ANNA, BASIA, KASIA, ZDZISIEK);

}