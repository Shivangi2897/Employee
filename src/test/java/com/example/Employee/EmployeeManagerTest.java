package com.example.Employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeManagerTest {
private EmployeeManager employeeManager=new EmployeeManager();
    @Test
    void shouldGetPayrollOfContractorEmployee() {
        Employee employee=new Contractor("Abc",1,EmployeeType.Contractor);
        employeeManager.getEmployeeSalary(employee);

        assertEquals(employee.payroll(employee,employee.getEmployeeType()),9L);
    }
    @Test
    void shouldGetPayrollOfPermanentEmployee() {
        Employee employee=new Permanent("Ab",2,EmployeeType.Permanent);
        employeeManager.getEmployeeSalary(employee);

        assertEquals(employee.payroll(employee,employee.getEmployeeType()),10L);
    }

    @Test
    void shouldConvertEmployeeTypeToPermanent() {
        Employee employee=new Contractor("Abc",1,EmployeeType.Contractor);
        employeeManager.covertEmployeeTypeToPermanent(employee);

        System.out.println(employee.getClass());
        System.out.println(employee.getEmployeeType());

        assertEquals(employee.payroll(employee,EmployeeType.Permanent),10L);
    }
}