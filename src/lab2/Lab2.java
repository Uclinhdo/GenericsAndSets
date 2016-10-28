/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author linhdo
 */
public class Lab2 {
    public static void main(String[] args) {
        List employeelist = new ArrayList();
        employeelist.add(new Employee("Do","Linh","12-345-6789"));
        employeelist.add(new Employee("Ament","Matt","00-234-1235"));
        employeelist.add(new Employee("Smith","John","00-679-4567"));
        employeelist.add(new Employee("Edman","Emily","12-345-6789"));
        
        String employee1 = (String) employeelist.get(1);
        System.out.println(employee1);
        
        //old-style for loop
        for(int i =0; i<= employeelist.size();i++){
            String employee = (String) employeelist.get(i);
            System.out.println(employee);
            
        }
        //new style for loop
        for(Object e: employeelist){
            String employee2 = (String) e;
            System.out.println(employee2);
        }
        
        employeelist.remove(1);
        for(Object o:employeelist){
            String e = (String) o;
            System.out.println(e);
        }
        employeelist.add(new Employee("Luke","Mike","45-563-9012"));
        for(Object e:employeelist){
            String i = (String)e;
            System.out.println(i);
        }
    }
    
}
