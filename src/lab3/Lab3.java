/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import lab2.Employee;

/**
 *
 * @author linhdo
 */
public class Lab3 {
    public static void main(String[] args) {
        List <Employee> employeelist = new ArrayList <>();
       employeelist.add(new Employee("Do","Linh","12-345-6789"));
       employeelist.add(new Employee("Ament","Matt","00-234-1235"));
       employeelist.add(new Employee("Smith","John","00-679-4567"));
       employeelist.add(new Employee("Edman","Emily","12-345-6789"));
       
       
//       Collection<Employee> noDupes = new HashSet<Employee>(employeelist);
//     // Employee employee = employeelist.get(2);
//     String employee;
        Employee employee = employeelist.get(1);
        System.out.println(employee);
        
        
        for(int i = 0; i < employeelist.size(); i++){
            Employee em = employeelist.get(i);
            System.out.println(em);
        }
        for(Employee o : employeelist){
            Employee em1 =  o;
            System.out.println(em1);
        }
        employeelist.remove(1);
        for(Employee o : employeelist){
            Employee em2 =  o;
            System.out.println(em2);
        }
         employeelist.add(new Employee("Luke","Mike","45-563-9012"));
         
        for(Employee o : employeelist){
            Employee em3 =  o;
            System.out.println(em3);
        }
        
       
    }
    
    //Lab4
    
    
}
