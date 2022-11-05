package com.example.Employee.EmployeeAbstractFactory;

import com.example.Employee.EmployeeCabService.CabService;
import com.example.Employee.EmployeeGifts.Gifts;
import com.example.Employee.EmployeeHRA.HRA;

public abstract class EmployeeBenefits {
    public abstract HRA hra();
    public abstract CabService cabService();
    public abstract Gifts gifts();
}
