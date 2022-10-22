package com.example.Employee;

class Permanent extends Employee {
    public Permanent(String name, long employeeId, EmployeeType employeeType) {
        super(name, employeeId, employeeType);
    }
    @Override
    public long payroll(Employee employee, EmployeeType employeeType1) {
        return 10L;
    }

}
