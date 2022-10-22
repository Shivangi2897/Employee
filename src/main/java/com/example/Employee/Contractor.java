package com.example.Employee;

class Contractor extends Permanent{
    public Contractor(String name, long employeeId, EmployeeType employeeType) {
        super(name, employeeId, employeeType);
    }
    @Override
    public long payroll(Employee employee,EmployeeType employeeType) {
        if(employeeType.equals(EmployeeType.Permanent)) {
            employee.setEmployeeType(EmployeeType.Permanent);
            Permanent cast = Permanent.class.cast(employee);
            System.out.println(cast);
            return super.payroll(employee,employeeType);
        }
        else{
            return 9l;
        }
    }

}
