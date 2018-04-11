package edu.handong.csee.Lab09.prob1;
/**
 * This is the main class for century calculator
 * 
 * @author Kim Myung Jin 21400082
 *
 */
public class sales_main { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalesReporter sales = new SalesReporter(); //calls out the class SalesReporter in order to use the methods in that class
		
		sales.getData(); //calls getData method in SalesReporter class and runs it
		sales.calculateAverageSales();//calls calculateAverageSales method in SalesReporter class and runs it
		sales.calculateHighestSales();//calls calculateHighestSales method in SalesReporter class and runs it
		sales.printOutResults();//calls printOutResults method in SalesReporter class and runs it

	}

}
