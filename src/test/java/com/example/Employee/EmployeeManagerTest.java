package com.example.Employee;

import com.example.Employee.Employee.Employee;
import com.example.Employee.EmployeeRole.Contractor;
import com.example.Employee.EmployeeRole.EmployeeManager;
import com.example.Employee.EmployeeRole.Permanent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeManagerTest {
private EmployeeManager employeeManager=new EmployeeManager();
    @Test
    void shouldGetPayrollOfContractorEmployee() {
        Employee employee=new Employee("Abc", 1, new Contractor());

        //long employeeSalary = employeeManager.getEmployeeSalary(employee);
        
        long employeeSalary =employee.salary();

        assertEquals(employeeSalary,9L);
    }
    @Test
    void shouldGetPayrollOfPermanentEmployee() {
        Employee employee=new Employee("Abc", 1,new Permanent());

        long employeeSalary =employee.salary();

        assertEquals(employeeSalary,10L);
    }

//    @Test
//    void shouldConvertEmployeeTypeToPermanent() {
//        Employee employee=new Employee("Abc", 1,new Contractor());
//        long employeeSalary = employeeManager.getEmployeeSalary(employee);
//        long salaryAfterConvertingToPermanent = employeeManager.covertEmployeeTypeToPermanent(employee);
//
//        assertNotEquals(employeeSalary,salaryAfterConvertingToPermanent);
//        assertEquals(salaryAfterConvertingToPermanent,10L);
//        assertEquals(employee.getEmployeeType(),EmployeeType.Permanent);
//    }
}