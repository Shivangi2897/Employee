package com.example.Employee.EmployeeRole;

import javax.validation.constraints.PositiveOrZero;

public class Permanent extends PayRollDecider {

    @Override
    public long payroll() {
        return 10L;
    }

}
