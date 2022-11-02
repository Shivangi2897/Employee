package com.example.Employee.Employee;

import com.example.Employee.BenefitsOffered.EmployeeBenefits;
import com.example.Employee.EmployeeRole.PayRollCalculator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public  class Employee {
    @NotEmpty
    public String name;
    @Positive
    public long employeeId;
//    public String DOJ;

    public PayRollCalculator payRollCalculator;
    public  List<EmployeeBenefits> employeeBenefits;
    public long salary(){
        return payRollCalculator.calculatePayroll();
    }
    public List<String> benefits(){
        return payRollCalculator.calculateEmployeeBenefits(employeeBenefits);
    }
}
//salary method
//divergent change-if both permanent and permanent would have been part of Employee class
//state related changes based logic-contractor can or cannot be permanent
//intern can become permanent