package com.example.Employee.Employee;

import com.example.Employee.BenefitsOffered.EmployeeBenefits;
import com.example.Employee.AbstractFactory.EmployeeAbstractFactory;
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
    public EmployeeAbstractFactory employeeAbstractFactory;
    public EmployeeAbstractFactory employeeAbstractFactory1;
    public  List<EmployeeBenefits> employeeBenefits;
    //public long salary(){
//        return payRollCalculator.calculatePayroll();
//    }
    public long employeeDetails(){
        if(employeeAbstractFactory.employeeType(payRollCalculator)!=0) {
            System.out.println(employeeAbstractFactory.employeeType(payRollCalculator));
            return employeeAbstractFactory.employeeType(payRollCalculator);
        }
        else {
            System.out.println(employeeAbstractFactory1.employeeType(payRollCalculator));
            return employeeAbstractFactory1.employeeType(payRollCalculator);
        }
    }
    public List<String> employeeBenefitsDetails(){
        if(employeeAbstractFactory.benefitsOffered(employeeBenefits)!=null) {
            System.out.println(employeeAbstractFactory.benefitsOffered(employeeBenefits));
            return employeeAbstractFactory.benefitsOffered(employeeBenefits);
        }
        else {
            System.out.println(employeeAbstractFactory1.benefitsOffered(employeeBenefits));
            return employeeAbstractFactory1.benefitsOffered(employeeBenefits);
        }
    }
//    public List<String> benefits(){
//        return payRollCalculator.calculateEmployeeBenefit(employeeBenefits);
//    }
}
//salary method
//divergent change-if both permanent and permanent would have been part of Employee class
//state related changes based logic-contractor can or cannot be permanent
//intern can become permanent