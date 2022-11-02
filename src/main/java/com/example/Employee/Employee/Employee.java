package com.example.Employee.Employee;

import com.example.Employee.EmployeeRole.PayRollDecider;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

@AllArgsConstructor
@NoArgsConstructor
@Data
public  class Employee {
    @NotEmpty
    public String name;
    @Positive
    public long employeeId;
//    public String DOJ;
//    public long hra;
//    //public EmployeeType employeeType;
    public PayRollDecider payRollDecider;
    public long salary(){
        return payRollDecider.payroll();
    }
}
//salary method
//divergent change-if both permanent and permanent would have been part of Employee class
//state related changes based logic-contractor can or cannot be permanent
//intern can become permanent