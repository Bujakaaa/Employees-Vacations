package _11_Urlopy;

public class Employee {

    private String name;
    private Departament departament;

    public Employee(String name, Departament departament) {
        this.name = name;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public Departament getDepartament() {
        return departament;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departament=" + departament +
                '}';
    }
}
