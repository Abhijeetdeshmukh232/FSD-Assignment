package com.Abhijeet.Spring_Hibernate.Hibernate;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Abhijeet.Spring_Hibernate.Hibernate.dao.EmployeeDao;
import com.Abhijeet.Spring_Hibernate.Hibernate.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        EmployeeDao dao = context.getBean("employeeDao", EmployeeDao.class);
        
        Employee newEmployee = new Employee();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Press 1:Add Element");
        System.out.println("Press 2:Get all Element");
        System.out.println("Press 3:Get Element by ID");
        System.out.println("Press 4:Update Element");
        System.out.println("Press 5:Delete Element");
        
       try {
    	   int a = sc.nextInt();
    	   switch(a) {
    	   case 1: 
    		   System.out.println("Enter the id");
		           int id = sc.nextInt();
		           System.out.println("Enter the name");
		           String name = sc.next();
		           System.out.println("Enter the email");
		           String email = sc.next();
		           newEmployee.setId(id);
		           newEmployee.setName(name);
		           newEmployee.setEmail(email);
		           break;
		           
    	   case 2:
    		   List<Employee> employees=dao.getAllEmployee();
    	   			for(Employee employee : employees){
    	   			System.out.println(employee);
    	   		break;
		    	   }
    	   case 3:
    		   int id1 = sc.nextInt();
    		   Employee employee = dao.getEmployeeById(id1);
    		   System.out.println(employee);
    		  break;
    	   case 4:
    		   System.out.println("Enter Employee id");
    		   int id2 = sc.nextInt();
    		   System.out.println("Enter Employee name");
    		   String name2 = sc.next();
    		   System.out.println("Enter Employee email");
    		   String email2 = sc.next();
    		   
    		   Employee updateEmployee =new Employee();
    		   updateEmployee.setId(id2);
    		   updateEmployee.setName(name2);
    		   updateEmployee.setEmail(email2);
    		   dao.updateEmployee(updateEmployee);
    		   System.out.println("update done");
    		   
    		   break;
    		   
    		 default:
    			 System.out.println("Enter Valid Option");
    			 break;
    	   }
    	    
    		   
       }catch(Exception e) {
    	   
       }
//       
//        int result =  dao.addEmployee(newEmployee);
//        System.out.println("("+result+") rows inserted...");
//        		
        
        
    }
}
