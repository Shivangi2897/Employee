package com.example.Employee.AbstractFactory;

import com.example.Employee.AbstractFactory.EmployeeAbstractFactory;
import com.example.Employee.BenefitsOffered.EmployeeBenefits;
import com.example.Employee.EmployeeRole.PayRollCalculator;

import java.util.List;
import java.util.stream.Collectors;

public class BenefitsFactory extends EmployeeAbstractFactory {
    @Override
    public long employeeType(PayRollCalculator payRollCalculator) {
        return 0;
    }

//    @Override
//    public String benefitsOffered(EmployeeBenefits employeeBenefits) {
//        return employeeBenefits.policy();
//    }
    @Override
    public List<String> benefitsOffered(List<EmployeeBenefits> employeeBenefits) {
        return employeeBenefits.stream().map(benefit->benefit.policy()).collect(Collectors.toList());
    }
}
