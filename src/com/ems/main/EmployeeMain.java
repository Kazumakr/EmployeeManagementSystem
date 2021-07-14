package com.ems.main;

import com.ems.dto.Employee;
import com.ems.service.EmployeeService;
import com.ems.service.EmployeeServiceImpl;

import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeService eService = new EmployeeServiceImpl();
        eService.addEmployee(new Employee(1111, "Michael", "Sales", 28));
        eService.addEmployee(new Employee(2222, "Casandra", "Technology", 30));
        eService.addEmployee(new Employee(3333, "Samuel", "Marketing", 25));
        eService.addEmployee(new Employee(4444, "Joe", "Accounts", 27));
        eService.addEmployee(new Employee(5555, "Alex", "Coder", 23));

        List<Employee> employeeList = eService.showAllEmployees();

        System.out.println("     ");
        for (Employee e: employeeList){
            System.out.println(e.getId()+ " : " +e.getName()+ " : " +e.getDept()+ " : " + e.getDaysAttended());
        }
        System.out.println("     ");

        eService.deleteEmployee(1111);
        eService.deleteEmployee(3333);
        eService.deleteEmployee(4444);
        eService.updateEmployee(5555,"Alex","HR",23);
        
        List<Employee> employeeList2 = eService.showAllEmployees();
        for (Employee e: employeeList2){
            System.out.println(e.getId()+ " : " +e.getName()+ " : " +e.getDept()+ " : " + e.getDaysAttended());
        }
        System.out.println("     ");
        
    }
}
