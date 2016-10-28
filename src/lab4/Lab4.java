/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author linhdo
 */
public class Lab4 {
    public static void main(String[] args) {
          List <Employee> employeelist = new ArrayList <>();
       employeelist.add(new Employee("Do","Linh","12-345-6789"));
       employeelist.add(new Employee("Ament","Matt","00-234-1235"));
       employeelist.add(new Employee("Smith","John","00-679-4567"));
       employeelist.add(new Employee("Edman","Emily","12-345-6789"));
       
       
    Set <Employee> noDupes = new HashSet<>(employeelist);
//     // Employee employee = employeelist.get(2);
//     String employee;
        Employee em;
        
        for(int i = 0; i < noDupes.size(); i++){
//            Employee em = employeelist.get(i);
//            System.out.println(em);
        }
        for(Employee o : noDupes){
             em =  o;
            System.out.println(em);
        }
        employeelist.remove(1);
        for(Employee o : noDupes){
             em =  o;
            System.out.println(em);
        }
         employeelist.add(new Employee("Luke","Mike","45-563-9012"));
         
        for(Employee o : noDupes){
             em =  o;
            System.out.println(em);
        }
        
        
    }
    
}
