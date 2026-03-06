package org.example;

import org.example.enums.Plan;

public class Main {

    public static void main(String[] args) {
        runProject();
    }

    public static void runProject() {
        Healthplan healthplan = new Healthplan(1, "Employee Health Plan", Plan.BASIC);
        System.out.println(healthplan);

        Employee employee = new Employee(
                1000000,
                "Sila Cukur",
                "silaxy",
                "12345xxyd",
                new String[3]
        );

        employee.addHealthPlan(0, "Basic Plan");
        employee.addHealthPlan(1, "Premium Plan");
        employee.addHealthPlan(1, "VIP Plan");
        employee.addHealthPlan(5, "Extra Plan");
        System.out.println(employee);

        Company company = new Company(
                1001,
                "Tech Company",
                -5000,
                new String[3]
        );

        company.addEmployee(0, "Sarp");
        company.addEmployee(1, "Samet");
        company.addEmployee(1, "Ece");
        company.addEmployee(8, "Zeynep");
        System.out.println(company);
    }
}