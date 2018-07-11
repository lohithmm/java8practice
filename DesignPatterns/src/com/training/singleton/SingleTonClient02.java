
package com.training.singleton;

public class SingleTonClient02 {

public static void main(String[] args) {
	Company company=null;
	company=Company.getInstance(company);
	System.out.println(company.hashCode());
	
	Emp emp1=new Emp();
	emp1.empId=1;
	emp1.empName="fgdgd";
	emp1.company=company;
	System.out.println(emp1.company.hashCode());
	
	
	Emp emp2=new Emp();
	emp2.empId=2;
	emp2.empName="feegdgd";
	emp2.company=company;
	
	System.out.println(emp2.company.hashCode());
	
}

}
