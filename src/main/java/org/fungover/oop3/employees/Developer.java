package org.fungover.oop3.employees;

import java.util.Objects;

public class Developer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Developer(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String work() {
        return name + " is debugging code.";
    }

    @Override
    public String toString() {
        return "Developer{" +
                "hoursWorked=" + hoursWorked +
                ", name='" + name + '\'' +
                ", hourlyRate=" + hourlyRate +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Developer developer)) return false;

        return this.name.equals(developer.name) &&
                Double.compare(hourlyRate, developer.hourlyRate) == 0 &&
                hoursWorked == developer.hoursWorked;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.hourlyRate, this.hoursWorked);
    }
}
