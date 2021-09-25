package com.ttn.java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee
{

    public static void main (String[] arg)
    {
        List<EmployeeData>  emp = new ArrayList<>();
        emp.add(new EmployeeData("Swati", 30,5000));
        emp.add(new EmployeeData("Ashish", 35,8000));
        emp.add(new EmployeeData("Saanvi", 25,9000));
        emp.add(new EmployeeData("Mishka", 20,3000));
        Collections.sort(emp, new EmployeeData.SalaryComparator());

        for(EmployeeData ED : emp)
            System.out.println("Employee Name: "  + ED.Emp_name + "    Employee Age: "+ ED.Emp_age +  "    Employee Salary: " + ED.Emp_salary);
    }

    static class EmployeeData
    {
        double Emp_salary;
        double Emp_age;
        String Emp_name;

    public EmployeeData(String Name, double Age, double Salary)
    {
        this.Emp_name = Name;
        this.Emp_age =Age;
        this.Emp_salary = Salary;
    }

    static class SalaryComparator implements Comparator<EmployeeData>
    {
        public int compare(EmployeeData E1, EmployeeData E2)
        {
            return -(int) (E1.Emp_salary-E2.Emp_salary);
        }
    }
    }
}

