package com.training.client;

import com.training.dao.EmployeeDAO;
import com.training.entity.Employee;
import com.training.standards.IEmployeeDAO;

public class EmployeeClient {
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		employee.setEmpId(104);
		employee.setEmpName("MiKaatttn");
		employee.setEmpSal(186008);
		employee.setEmpEmail("destammmmesiKaan@testing.com");
		
		
		IEmployeeDAO dao = new EmployeeDAO();
		
		//boolean insertFlag = dao.insertEmployee(employee);
		
		
		//condition ? "<True>" : "<False>" 
		//System.out.println(insertFlag? "Record Inserted" : "Sorry record not inserted");
		//System.out.println(dao.deleteEmployee(101));
		//System.out.println(dao.updateEmployeeSalary(102, 10000));
		
		//System.out.println(dao.getEmployee(102));
		dao.getAllEmps().forEach(System.out :: println);   //another way of printing //System.out.println(dao.getEmployee(102));
		

		
		
	}
	
	

}
