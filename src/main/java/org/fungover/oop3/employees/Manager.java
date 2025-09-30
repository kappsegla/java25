package org.fungover.oop3.employees;

public final class Manager extends Employee {
    private double baseSalary;

    public Manager(String name, double baseSalary) {
        if (baseSalary < 0)
            throw new IllegalArgumentException();
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public String work() {
        return name + " is managing the team.";
    }
}
