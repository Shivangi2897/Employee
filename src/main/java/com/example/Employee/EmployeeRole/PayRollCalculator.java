package com.example.Employee.EmployeeRole;

import com.example.Employee.BenefitsOffered.EmployeeBenefits;
import java.util.List;

public abstract class PayRollCalculator {

    public abstract long calculatePayroll();

    public abstract List<String> calculateEmployeeBenefits(List<EmployeeBenefits> employeeBenefits);
}
