package com.pack;

import java.util.List;

public class DatabaseClient {
	
	public static void main(String args[])
	{
		EmployeeDao employeeDao = new EmployeeDao();
		/*int res1 = employeeDao.save(new Employee(1001,"Abhi",543232.2));
		System.out.println("Data inserted Successfully  " + res1);
		
		int res2 = employeeDao.save(new Employee(1002,"Kalisto",343232.2));
		System.out.println("Data inserted Successfully  " + res2);
		Employee emp = employeeDao.findById(1001);
		System.out.println(emp);
		
		Employee emp = employeeDao.findById(1003);
		System.out.println(emp);
		
		int deleteCount = 0;
		deleteCount = employeeDao.deleteById(1002);
		
		if(deleteCount == 1)
			System.out.println("The data is deleted Successfully   "+deleteCount);
		else
			
			System.out.println("The data deletion failed   "+deleteCount);
		
		int deleteCount = 0;
		deleteCount = employeeDao.deleteBySalary(1002);
		
		if(deleteCount == 1)
			System.out.println("The data is deleted Successfully   "+deleteCount);
		else
			
			System.out.println("The data deletion failed   "+deleteCount);*/
		
		List<Employee> emps = employeeDao.findAll();
		emps.forEach(x->System.out.println(x));
		
		int updateCount = employeeDao.updateSalary(50000, 29990);
		System.out.println("The employee Salary is updated successfully   "+updateCount);
	}

	
	
	

}
