package com.example.Employee;

import com.example.Employee.Employee.Employee;
import com.example.Employee.EmployeeAbstractFactory.ContractorBenefits;
import com.example.Employee.EmployeeAbstractFactory.InternBenefits;
import com.example.Employee.EmployeeAbstractFactory.PermanentBenefits;
import com.example.Employee.EmployeeRole.Contractor;
import com.example.Employee.EmployeeRole.Intern;
import com.example.Employee.EmployeeRole.Permanent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeManagerTest {

    @Test
    void shouldGetPayrollOfContractorEmployee() {
        Employee employee=new Employee("Abc", 1,new Contractor(),new ContractorBenefits());

        long employeeSalary = employee.salary();
        employee.benefits();

        assertEquals(employeeSalary,9L);
    }
    @Test
    void shouldGetPayrollOfPermanentEmployee() {
        Employee employee=new Employee("Abc", 1,new Permanent(), new PermanentBenefits());

        long employeeSalary = employee.salary();
        employee.benefits();

        assertEquals(employeeSalary,10L);
    }

    @Test
    void shouldGetPayrollOfInternEmployee() {
        Employee employee=new Employee("Abc", 1,new Intern(),new InternBenefits());

        long employeeSalary = employee.salary();
        employee.benefits();

        assertEquals(employeeSalary,8L);

    }
}