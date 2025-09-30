package org.fungover.oop3.employees;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRegister {


    static void main() {
        List<Employee> employees = new ArrayList<>();

        Employee employee = new Developer("Martin", 900.0, 32);
        employees.add(employee);
        employees.add(new Manager("Frida", 35000));
        employees.add(new Developer("Anna", 450.0, 50));


        for (Employee e : employees) {
            System.out.println(e.work());
            System.out.println("Salary: " + e.calculateSalary());
        }
    }
}
