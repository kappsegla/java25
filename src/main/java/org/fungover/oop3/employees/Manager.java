package org.fungover.oop3.employees;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Manager{" +
                "baseSalary=" + baseSalary +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Manager manager) {
            return this.name.equals(manager.name) &&
                    this.baseSalary == manager.baseSalary;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, baseSalary);
    }
}
