package com.example.Employee.EmployeeAbstractFactory;

import com.example.Employee.EmployeeCabService.CabService;
import com.example.Employee.EmployeeCabService.InternCabService;
import com.example.Employee.EmployeeCabService.PermanentCabService;
import com.example.Employee.EmployeeGifts.Gifts;
import com.example.Employee.EmployeeGifts.InternGifts;
import com.example.Employee.EmployeeGifts.PermanentGifts;
import com.example.Employee.EmployeeHRA.HRA;
import com.example.Employee.EmployeeHRA.InternHRA;
import com.example.Employee.EmployeeHRA.PermanentHRA;

public class InternBenefits  extends EmployeeBenefits {
    @Override
    public HRA hra() {
        return new InternHRA();
    }

    @Override
    public CabService cabService() {
        return new InternCabService();
    }

    @Override
    public Gifts gifts() {

        return new InternGifts();
    }
}
