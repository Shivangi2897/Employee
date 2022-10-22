package com.example.Employee;

import com.example.Employee.Employee.Employee;
import com.example.Employee.Employee.EmployeeType;
import com.example.Employee.EmployeeRole.Contractor;
import com.example.Employee.EmployeeRole.Permanent;
import com.example.Employee.EmployeeRole.PayRollDecider;

public class EmployeeManager {
    public EmployeeManager() {
    }

    public long getEmployeeSalary(Employee employee){
        PayRollDecider payRollDecider;
        if(employee.getEmployeeType().equals(EmployeeType.Contractor)){
            payRollDecider = new Contractor();
        }
        else{
            payRollDecider = new Permanent();
        }
        return payRollDecider.payroll();
    }
    public long covertEmployeeTypeToPermanent(Employee employee) {
        employee.setEmployeeType(EmployeeType.Permanent);
        PayRollDecider payRollDecider =new Permanent();
        return payRollDecider.payroll();
    }
}
