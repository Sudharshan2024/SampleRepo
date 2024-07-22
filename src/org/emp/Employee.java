package org.emp;

import org.client.*;
import org.company.Company;
import org.project.Project;

public class Employee {
	public void empName() {
		System.out.println("Sudharshan");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		Company  c = new Company();
		Client  cc = new Client();
		Client2 ccc= new Client2();
		Project  p = new Project();
		
		e.empName();
		c.companyName();
		cc.clientName();
		ccc.client2Name();
		p.projectName();
	}

}
