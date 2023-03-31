package com.knoldus.question4;

import java.util.HashMap;

public class UpdateSalariesOfEmployees
{
    public static void updateEmployeeSalaries(HashMap<String, Double>mapOfNameAndSalary)
    {
        //updating salaries of employees using streams
        mapOfNameAndSalary.entrySet().stream().filter(entry -> entry.getValue() < 50000.0).forEach(entry -> entry.setValue(entry.getValue() * 1.05));
    }

    public static void main(String[] args)
    {
        HashMap<String, Double>mapOfNameAndSalary = new HashMap<>();
        mapOfNameAndSalary.put("Riya", 50000.00);
        mapOfNameAndSalary.put("Jasleen", 50200.00);
        mapOfNameAndSalary.put("Salil", 45000.00);
        UpdateSalariesOfEmployees.updateEmployeeSalaries(mapOfNameAndSalary);
        System.out.println(mapOfNameAndSalary);
    }
}
