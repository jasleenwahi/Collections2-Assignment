package com.knoldus.question16;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortEmployeeList
{
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        List<Employee> employeesList = new ArrayList<>();
        System.out.println("Enter the number of persons: ");
        Integer numberOfEmplolyees = takeInput.nextInt();
        String nameOfEmployee;
        Integer idOfEmployee;
        Double salaryOfEmployee;
        for(Integer index = 0; index<numberOfEmplolyees; index++){
            System.out.println("Enter the name: "+index);
            nameOfEmployee = takeInput.nextLine();
            nameOfEmployee = takeInput.nextLine();
            System.out.println("Enter the id"+index);
            idOfEmployee = takeInput.nextInt();
            System.out.println("Enter the salary"+index);
            salaryOfEmployee = takeInput.nextDouble();
            Employee employee = new Employee(nameOfEmployee, idOfEmployee, salaryOfEmployee);
            employeesList.add(employee);
        }
        Collections.sort(employeesList);
        System.out.println(employeesList);
    }
}
