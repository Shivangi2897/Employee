package com.example.Employee.EmployeeRole;

import com.example.Employee.Employee.Employee;
import com.example.Employee.Employee.EmployeeType;
import com.example.Employee.EmployeeRole.Permanent;
import com.example.Employee.EmployeeRole.PayRollDecider;
import org.springframework.stereotype.Service;

@Service
public class EmployeeManager {
    public EmployeeManager() {
    }

//    public long getEmployeeSalary(Employee employee){
//        PayRollDecider payRollDecider;
//        if(employee.getEmployeeType().equals(EmployeeType.Contractor)){
//            payRollDecider = new Contractor();
//        }
//        else{
//            payRollDecider = new Permanent();
//        }
//        return payRollDecider.payroll();
//    }
//    public long covertEmployeeTypeToPermanent(Employee employee) {
//        employee.setEmployeeType(EmployeeType.Permanent);
//        PayRollDecider payRollDecider =new Permanent();
//        return payRollDecider.payroll();
//    }
}
//strategy pattern-will isolate behaviour from object
//ways to inject strategy pattern-through constructor, setter injection-,factory pattern

