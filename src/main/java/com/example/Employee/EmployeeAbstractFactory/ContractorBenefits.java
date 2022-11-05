package com.example.Employee.EmployeeAbstractFactory;

import com.example.Employee.EmployeeCabService.CabService;
import com.example.Employee.EmployeeCabService.ContractorCabService;
import com.example.Employee.EmployeeGifts.ContractorGifts;
import com.example.Employee.EmployeeGifts.Gifts;
import com.example.Employee.EmployeeHRA.ContractorHRA;
import com.example.Employee.EmployeeHRA.HRA;

public class ContractorBenefits extends EmployeeBenefits {
    @Override
    public HRA hra() {
       return new ContractorHRA();
    }

    @Override
    public CabService cabService() {
       return new ContractorCabService();
    }

    @Override
    public Gifts gifts() {
       return new ContractorGifts();
    }
}
