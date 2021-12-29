package com.knoldus.learning.controller;

import com.knoldus.learning.entity.Employee;
import com.knoldus.learning.service.SaveEmployeeService;
import com.knoldus.learning.service.SaveEnployeeServiceImpl;
import com.knoldus.learning.service.ValidateEmployeeService;
import com.knoldus.learning.service.ValidateEmployeeServiceImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeController {

    public static void main(String[] a){
        ValidateEmployeeService validateEmployeeService = new ValidateEmployeeServiceImpl();
        SaveEmployeeService saveEmployeeService = new SaveEnployeeServiceImpl();
        List<Employee> emplList = new ArrayList<>();

        //remove below for loop and
        // read data from employee.csv, csv have id, and name in each row.
        // focus on Functional Interface and mark them Functional if it is.
        // focus on Single responsibility principle.
        // -1,Jiten
        // 2,Ram

//        loop has been replaced by csv file
        File file = new File("src/com/knoldus/learning/controller/employee.csv");
        Scanner scanner;
        String line;

        try {
            scanner =new Scanner(file);
            scanner.useDelimiter(",");
            while (scanner.hasNext()){
                line = scanner.nextLine();
                String employee[] = line.split(",");
                emplList.add(new Employee(Integer.parseInt(employee[0]),employee[1]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Total employee size  :  "+emplList.size());
        //emplList iterate and call validate service, then save.
        for (Employee e : emplList) {
            if(validateEmployeeService.validateEmployee(e))
                saveEmployeeService.saveEmployee(e);
        }

        //Remove this error.
//       error removed
        System.out.println("Saved employee  : "+saveEmployeeService.getEmployeeCount());
    }
}
