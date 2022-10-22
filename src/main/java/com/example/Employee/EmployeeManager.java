package com.example.Employee;

public class EmployeeManager {
    public EmployeeManager() {
    }

    public long getEmployeeSalary(Employee employee){
        return employee.payroll(employee,employee.getEmployeeType());
    }
    public long covertEmployeeTypeToPermanent(Employee employee) {
        return employee.payroll(employee,EmployeeType.Permanent);
    }
}
