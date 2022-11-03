package com.example.Employee.AbstractFactory;

import com.example.Employee.BenefitsOffered.EmployeeBenefits;
import com.example.Employee.EmployeeRole.PayRollCalculator;

import java.util.List;

public abstract class EmployeeAbstractFactory {


    public abstract long employeeType(PayRollCalculator payRollCalculator);


    //    @Override
    //    public String benefitsOffered(EmployeeBenefits employeeBenefits) {
    //        return employeeBenefits.policy();
    //    }
        public abstract List<String> benefitsOffered(List<EmployeeBenefits> employeeBenefits);
}
