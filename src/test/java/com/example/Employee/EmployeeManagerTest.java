package com.example.Employee;

import com.example.Employee.Employee.Employee;
import com.example.Employee.Employee.EmployeeType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeManagerTest {
private EmployeeManager employeeManager=new EmployeeManager();
    @Test
    void shouldGetPayrollOfContractorEmployee() {
        Employee employee=new Employee("Abc", 1, EmployeeType.Contractor);

        long employeeSalary = employeeManager.getEmployeeSalary(employee);

        assertEquals(employeeSalary,9L);
    }
    @Test
    void shouldGetPayrollOfPermanentEmployee() {
        Employee employee=new Employee("Abc", 1, EmployeeType.Permanent);

        long employeeSalary = employeeManager.getEmployeeSalary(employee);

        assertEquals(employeeSalary,10L);
    }

    @Test
    void shouldConvertEmployeeTypeToPermanent() {
        Employee employee=new Employee("Abc", 1, EmployeeType.Contractor);

        long salaryAfterConvertingToPermanent = employeeManager.covertEmployeeTypeToPermanent(employee);

        assertEquals(salaryAfterConvertingToPermanent,10L);
        assertEquals(employee.getEmployeeType(),EmployeeType.Permanent);
    }
}