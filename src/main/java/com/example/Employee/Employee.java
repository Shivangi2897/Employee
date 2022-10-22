package com.example.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class Employee {
    public String name;
    public long employeeId;
    public EmployeeType employeeType;

    public abstract long payroll(Employee employee, EmployeeType employeeType1);


}
