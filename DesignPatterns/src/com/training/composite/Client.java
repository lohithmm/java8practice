package com.training.composite;

public class Client {
public static void main(String[] args) {
	Customer customer1=new Customer(1,"lohith");
	Customer customer2=new Customer(2,"teja");
	Customer customer3=new Customer(3,"beja");
	Customer customer4=new Customer(4,"roja");
	Customer customer5=new Customer(5,"asd");
	Customer customer6=new Customer(6,"gjgh");
	Customer customer7=new Customer(7,"Ankith");

customer1.addRefrance(customer5);
customer1.addRefrance(customer2);
customer1.addRefrance(customer3);
	
customer2.addRefrance(customer1);
customer2.addRefrance(customer2);

customer3.addRefrance(customer3);
customer3.addRefrance(customer1);
customer3.addRefrance(customer2);

customer4.addRefrance(customer3);
customer4.addRefrance(customer5);

customer5.addRefrance(customer7);
customer5.addRefrance(customer1);

customer6.addRefrance(customer3);
customer6.addRefrance(customer2);

customer7.addRefrance(customer5);
customer7.addRefrance(customer3);

System.out.println("print all customer Refrances...");
System.out.println("customer "+customer1.getName()+" reffered");
for (Customer cus : customer1.refrnaces) {
	System.out.println(cus.getName());
}
	




}
}
