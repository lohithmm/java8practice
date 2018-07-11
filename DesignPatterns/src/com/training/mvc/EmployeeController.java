package com.training.mvc;

public class EmployeeController 
{
	private Employee model;
private StarView starView;
public EmployeeController(Employee model, StarView starView, DashView dashView) {
	super();
	this.model = model;
	this.starView = starView;
	this.dashView = dashView;
}
private DashView dashView;
public DashView getDashView() {
	return dashView;
}
public Employee getModel() {
	return model;
}
public void setModel(Employee model) {
	this.model = model;
}
public StarView getStarView() {
	return starView;
}
public void setStarView(StarView starView) {
	this.starView = starView;
}
public void setDashView(DashView dashView) {
	this.dashView = dashView;
}

public void updateView(String name)
{
	if("star".equals(name)) this.getStarView().printEmployee(this.model);
	else if ("dash".equals(name)) this.getDashView().printEmployee(this.model);
}
}
