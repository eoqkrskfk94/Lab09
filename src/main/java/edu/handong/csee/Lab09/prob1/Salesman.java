package edu.handong.csee.Lab09.prob1;
/**
 * This class has the follwing getters and setters:<br>
 * Getter and setter for name<br>
 * Getter and setter for sales<br>
 * 
 * @author Kim Myung Jin 21400082
 *
 */
public class Salesman { //Constructor class
	
	String name; //initialize string name variable
	double sales; //initialize double sales variable
	
	public String getName() { //getter method for name
		return name; //returns name value
	}
	public void setName(String name) { //setter method for name
		this.name = name; //inserts the value to name
	}
	public double getSales() { //getter method for sales
		return sales; //returns sales value
	}
	public void setSales(double sales) { //setter method for sales
		this.sales = sales; //inserts the value to sales
	}

}
