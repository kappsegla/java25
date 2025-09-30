package org.fungover.oop3.employees;

public abstract class Employee {
    protected final String name;

    public Employee(String name) {
        this.name = name;
    }

    public final String name() {
        return name;
    }

    public abstract double calculateSalary();

    public String work() {
        return name + " is working.";
    }


}
