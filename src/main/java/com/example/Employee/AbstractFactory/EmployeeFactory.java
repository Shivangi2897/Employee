package com.example.Employee.AbstractFactory;

import com.example.Employee.AbstractFactory.EmployeeAbstractFactory;
import com.example.Employee.BenefitsOffered.EmployeeBenefits;
import com.example.Employee.EmployeeRole.PayRollCalculator;

import java.util.List;

public class EmployeeFactory extends EmployeeAbstractFactory {


    @Override
    public long employeeType(PayRollCalculator payRollCalculator) {
        return payRollCalculator.calculatePayroll();
    }

    @Override
    public List<String> benefitsOffered(List<EmployeeBenefits> employeeBenefits) {
        return null;
    }
}
