package com.example.Employee.EmployeeRole;

import com.example.Employee.BenefitsOffered.EmployeeBenefits;

import java.util.List;
import java.util.stream.Collectors;

public class Permanent extends PayRollCalculator {

    @Override
    public long calculatePayroll() {
        return 10L;
    }

    @Override
    public List<String> calculateEmployeeBenefits(List<EmployeeBenefits> employeeBenefits) {
        return employeeBenefits.stream().map(benefit->benefit.policy()).collect(Collectors.toList());
    }

}
