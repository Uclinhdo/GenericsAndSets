/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author linhdo
 */
public class Lab5 {
    public static void main(String[] args) {
       List <Employee> employeelist = new ArrayList <>();
       employeelist.add(new Employee("Do","Linh","12-345-6789"));
       employeelist.add(new Employee("Ament","Matt","00-234-1235"));
       employeelist.add(new Employee("Smith","John","00-679-4567"));
       employeelist.add(new Employee("Edman","Emily","12-345-6789"));
       
       
    
       Set<Employee> set = new LinkedHashSet<>(employeelist);
       //Employee em1 = .get(1);
       employeelist = new ArrayList<>(set);
       
       
        
       
    }
    }
    

