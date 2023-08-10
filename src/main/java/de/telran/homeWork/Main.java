package de.telran.homeWork;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.logging.log4j.util.PropertySource;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", "Manager", "Sales", 1500));
        employees.add(new Employee("Jane Smith", "Assistant", "Sales", 800));
        employees.add(new Employee("Mike Johnson", "Manager", "Marketing", 1200));
        employees.add(new Employee("Sarah Brown", "Assistant", "Marketing", 1000));
        employees.add(new Employee("David Lee", "Manager", "HR", 1300));
        employees.add(new Employee("Anna White", "Assistant", "HR", 900));

        // Пример использования методов
        Map<String, List<Employee>> groupedByPosition = Employee.groupByPosition(employees);
        double averageSalaryAllEmployees = Employee.averageSalary(employees);
        List<Employee> employeesAbove1000Salary = Employee.employeesAbove1000(employees);
        List<Employee> marketingEmployeesWithBonusList = Employee.marketingEmployeesWithBonus(employees);
        Employee employeeWithLowestSalary = Employee.employeeWithLowestSalary(employees);
        List<Employee> employeesWithMaxSalaryPerDepartmentList = Employee.employeesWithMaxSalaryPerDepartment(employees);

        System.out.println("Сотрудники по должности: " + groupedByPosition);
        System.out.println("Средняя зарплата всех сотрудников: " + averageSalaryAllEmployees);
        System.out.println("Сотрудники с зп > 1000: " + employeesAbove1000Salary);
        System.out.println("Сотрудники из отдела маркетинг с увеличенной зп: " + marketingEmployeesWithBonusList);
        System.out.println("Сотрудник с самой низкой зп: " + employeeWithLowestSalary.getName());
        System.out.println("Сотрудники из каждого отдела с максимальной зп: " + employeesWithMaxSalaryPerDepartmentList);
    }
}
@Data
@AllArgsConstructor
class Employee {
    private String name;
    private String position;
    private String department;
    private double salary;

    // 2. Сгрупировать сотрудников по должности
    public static Map<String, List<Employee>> groupByPosition(List<Employee> employees) {
        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
    }

    // 3. Вычислить среднюю зарплату всех сотрудников
    public static double averageSalary(List<Employee> employees) {
        return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);
    }

    // 4. Получить список сотрудников с зп > 1000
    public static List<Employee> employeesAbove1000(List<Employee> employees) {
      return employees.stream().filter(salary -> salary.getSalary() > 1250).collect(Collectors.toList());
    }

    // 5. Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
    public static List<Employee> marketingEmployeesWithBonus(List<Employee> employees) {
        return employees.stream().filter(employee -> "Marketing".equals(employee.getDepartment()))
                .map(employee -> new Employee(employee.getName(),employee.getPosition(),employee.getDepartment(),employee.getSalary()*1.15))
                .collect(Collectors.toList());

    }

    // 6. Получить сотрудника с самой низкой зп
    public static Employee employeeWithLowestSalary(List<Employee> employees) {
        return employees.stream().min(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
    }

    // 7. Получить сотрудников из каждого отдела с максимальной зп
    public static List<Employee> employeesWithMaxSalaryPerDepartment(List<Employee> employees) {
        Map<String,Employee> map = new HashMap<>();
        for (Employee employee : employees){
            String department = employee.getDepartment();
            if(!map.containsKey(department) || employee.getSalary() > map.get(department).getSalary()){
                map.put(department,employee);
            }
        }
        return new ArrayList<>(map.values());
    }

}
