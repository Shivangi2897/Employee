package com.example.Employee.EmployeeAbstractFactory;

import com.example.Employee.EmployeeAbstractFactory.EmployeeBenefits;
import com.example.Employee.EmployeeCabService.CabService;
import com.example.Employee.EmployeeCabService.PermanentCabService;
import com.example.Employee.EmployeeGifts.Gifts;
import com.example.Employee.EmployeeGifts.PermanentGifts;
import com.example.Employee.EmployeeHRA.HRA;
import com.example.Employee.EmployeeHRA.PermanentHRA;

public class PermanentBenefits extends EmployeeBenefits {
    @Override
    public HRA hra() {
        return new PermanentHRA();
    }

    @Override
    public CabService cabService() {
        return new PermanentCabService();
    }

    @Override
    public Gifts gifts() {

        return new PermanentGifts();
    }
}
