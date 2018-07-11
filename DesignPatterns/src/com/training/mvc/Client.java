package com.training.mvc;

public class Client {
public static void main(String[] args) {
	
	EmployeeController controller=new EmployeeController(retrieve(), new StarView(), new DashView());
	controller.updateView("star");
}
private static Employee retrieve()
{
	return new Employee(1,"sfdsfsf");
}

}
