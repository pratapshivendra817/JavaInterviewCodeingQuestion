import java.util.*;
import java.util.stream.Collectors;


public class Employee {
    private String name;
    private String gender;
    private int age;

    // Constructor, getters, and setters
    public Employee(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



public class EmployeeStatistics {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "Female", 30),
            new Employee("Bob", "Male", 25),
            new Employee("Charlie", "Male", 35),
            new Employee("Diana", "Female", 28)
        );

        Map<String, Long> genderCount = employees.stream()
            .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println("Male Employees: " + genderCount.getOrDefault("Male", 0L));
        System.out.println("Female Employees: " + genderCount.getOrDefault("Female", 0L));
    }
}
}
