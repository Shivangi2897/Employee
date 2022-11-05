package com.example.Employee.Employee;

import com.example.Employee.EmployeeAbstractFactory.EmployeeBenefits;
import com.example.Employee.EmployeeRole.PayRollCalculator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public  class Employee {
    public String name;
    public long employeeId;
    public PayRollCalculator payRollCalculator;
    public EmployeeBenefits employeeBenefits;
    public long salary(){
        return payRollCalculator.calculatePayroll();
    }
    public void benefits(){
        //payRollDecider.payroll();
        employeeBenefits.cabService().cabServiceBenefits();
        employeeBenefits.hra().hraBenefits();
        employeeBenefits.gifts().giftsBenefits();
    }

}
