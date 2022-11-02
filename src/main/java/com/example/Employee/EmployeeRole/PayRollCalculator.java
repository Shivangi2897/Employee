package com.example.Employee.EmployeeRole;

import com.example.Employee.BenefitsOffered.EmployeeBenefits;
import java.util.List;
import java.util.stream.Collectors;

public abstract class PayRollCalculator {

    public abstract long calculatePayroll();
    public List<String> calculateEmployeeBenefit(List<EmployeeBenefits> employeeBenefits) {
        return employeeBenefits.stream().map(benefit->benefit.policy()).collect(Collectors.toList());
    }
//    public abstract List<String> calculateEmployeeBenefits(List<EmployeeBenefits> employeeBenefits);
}
