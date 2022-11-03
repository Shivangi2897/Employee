package com.example.Employee;

import com.example.Employee.AbstractFactory.BenefitsFactory;
import com.example.Employee.AbstractFactory.EmployeeFactory;
import com.example.Employee.BenefitsOffered.CabService;
import com.example.Employee.BenefitsOffered.EmployeeBenefits;
import com.example.Employee.BenefitsOffered.Gifts;
import com.example.Employee.BenefitsOffered.HRA;
import com.example.Employee.Employee.Employee;
import com.example.Employee.EmployeeRole.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeManagerTest {
    @Test
    void shouldGetPayrollAndBenefitsOfContractorEmployee() {
        List<EmployeeBenefits> employeeBenefits =Arrays.asList(new Gifts(), new HRA());
        Employee employee=new Employee("Abc", 1, new Contractor(),new EmployeeFactory(),new BenefitsFactory(),employeeBenefits);

        long details = employee.employeeDetails();
        List<String> benefitsProvidedDetails = employee.employeeBenefitsDetails();

        assertEquals(benefitsProvidedDetails.size(),2);
        assertEquals(details,9L);
    }
    @Test
    void shouldGetPayrollAndBenefitsOfPermanentEmployee() {
        List<EmployeeBenefits> employeeBenefits =Arrays.asList(new Gifts(), new CabService(),new HRA());
        Employee employee=new Employee("Abc", 1, new Permanent(),new EmployeeFactory(),new BenefitsFactory(),employeeBenefits);

        long details = employee.employeeDetails();
        List<String> benefitsProvidedDetails = employee.employeeBenefitsDetails();

        assertEquals(benefitsProvidedDetails.size(),3);
        assertEquals(details,10L);
    }

    @Test
    void shouldGetPayrollAndBenefitsOfInternEmployee() {
        List<EmployeeBenefits> employeeBenefits =Arrays.asList(new Gifts(), new CabService());
        Employee employee=new Employee("Abc", 1, new Intern(),new EmployeeFactory(),new BenefitsFactory(),employeeBenefits);

        long details = employee.employeeDetails();
        List<String> benefitsProvidedDetails = employee.employeeBenefitsDetails();

        assertEquals(benefitsProvidedDetails.size(),2);
        assertEquals(details,8L);
    }
}