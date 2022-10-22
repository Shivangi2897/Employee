package com.example.Employee.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public  class Employee {
    public String name;
    public long employeeId;
    public EmployeeType employeeType;



}
