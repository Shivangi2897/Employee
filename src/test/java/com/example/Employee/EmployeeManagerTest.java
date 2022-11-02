package com.example.Employee;

import com.example.Employee.BenefitsOffered.CabService;
import com.example.Employee.BenefitsOffered.EmployeeBenefits;
import com.example.Employee.BenefitsOffered.Gifts;
import com.example.Employee.BenefitsOffered.HRA;
import com.example.Employee.Employee.Employee;
import com.example.Employee.EmployeeRole.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeManagerTest {
    @Test
    void shouldGetPayrollAndBenefitsOfContractorEmployee() {
        List<EmployeeBenefits> employeeBenefits =Arrays.asList(new Gifts(), new HRA());
        Employee employee=new Employee("Abc", 1, new Contractor(),employeeBenefits);

        long employeeSalary =employee.salary();

        assertEquals(employee.benefits().size(),2);
        assertEquals(employeeSalary,9L);
    }
    @Test
    void shouldGetPayrollAndBenefitsOfPermanentEmployee() {
        List<EmployeeBenefits> employeeBenefits =Arrays.asList(new Gifts(), new CabService(),new HRA());
        Employee employee=new Employee("Abc", 1, new Permanent(),employeeBenefits);

        long employeeSalary =employee.salary();

        assertEquals(employee.benefits().size(),3);
        assertEquals(employeeSalary,10L);
    }

    @Test
    void shouldGetPayrollAndBenefitsOfInternEmployee() {
        List<EmployeeBenefits> employeeBenefits =Arrays.asList(new Gifts(), new CabService());
        Employee employee=new Employee("Abc", 1, new Intern(),employeeBenefits);

        long employeeSalary =employee.salary();

        assertEquals(employee.benefits().size(),2);
        assertEquals(employeeSalary,8L);
    }
}