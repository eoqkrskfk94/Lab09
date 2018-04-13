package edu.handong.csee.Lab09.prob1;
import java.util.Scanner; //import Scanner class
import java.util.ArrayList; //import ArrayList class
/**
 * This class has the follwing methods:<br>
 * SalesReporter constructor<br>
 * Printing out my sentence<br>
 * Getting data for each associates<br>
 * Calculating the average sales of the associates<br>
 * Calculating the highest sales among the associates<br>
 * Printing out all the information calculated<br>
 * 
 * @author Kim Myung Jin 21400082
 *
 */
public class SalesReporter {
	
	private double highestSales; //initiates private double variable
	private double averageSales; //initiates private double variable
	public ArrayList<Salesman> team = new ArrayList<Salesman>(); //initiate an array list public team
	int i = 0;
	
	
	public void printOutMySentence() //This method prints out the information
	{
		System.out.println("I want to print out something when I instatiate "); //prints out the info
	}
	
	public void getData() //This method gets the data from the user and inserts them to the variables
	{
		team = new ArrayList<Salesman>(); // initiate arraylist team
		boolean done = true; //initiate boolean done with the value of true
		
		while(done) { //loop until done is not true
			Salesman salesman = new Salesman();  //initiate Salesman salesman 
			Scanner myScanner = new Scanner(System.in); //creates scanner for insertion
			System.out.println("Enter data for associate number " + (i+1)); //prints out the info
			i++; //increment i by 1
			
			System.out.print("Enter name of sales associate: "); //prints out the info
			String name = myScanner.nextLine(); //inserts the input value to name
			
			System.out.print("Enter associate's sales: $"); //prints out the info
			double sales = myScanner.nextDouble(); //inserts the input value sales 
			
			salesman.setName(name); //inserts the name of salesman using set method
			salesman.setSales(sales); //inserts the sales of salesman using set method
			
			team.add(salesman); //add the salesman value to team
			
			System.out.print("Do you want to add more associate?");  //prints out the info
			String buffer = myScanner.nextLine(); //buffer in order to ignore the enter
			String ans = myScanner.nextLine(); //inserts the input value ans
			
			if(!ans.equalsIgnoreCase("yes")) //if ans is not yes then if statement is carried out
			{
				done = false; // put false in boolean done
			}
		}
		
		
	}
	
	public void calculateAverageSales() //this method calculates the average of sales in the team
	{
		int listSize = team.size ();
		double sum = 0; //initiates double sum variable and insert 0 into it
		for(Salesman sales : team) { //for each statement where all the sales in team are called one by one
			double temp = sales.getSales(); //initiate and set the value of temp with sales.getSales()
			sum = sum + temp; //add all the sales
		}
		
		averageSales = sum / listSize; //calculate the average
	}
	
	public void calculateHighestSales() //this method calculates the highest sales of sales in the team
	{
		highestSales = 0; //insert 0 to highestSales variable
		Double max = Double.MIN_VALUE; //initiate double variable max with min value of double
		for(Salesman sales : team) { //for each statement where all the sales in team are called one by one
			if(sales.getSales() > max) { //if statement is carried out if sales.getSales() is greater than max
				max = sales.getSales(); //insert the value of sales.getSales() into max
			}
		}
		highestSales = max; //insert the value of max into highestSales
	}
	
	public void printOutResults() //prints out the results of the all the calculation
	{
		System.out.println("Average sales per associate is $" + averageSales); //prints out the average sales per associate
		System.out.println("The highest sales figure is $" + highestSales); //prints out the highest sales 

		
		System.out.println("\nThe following had the highest sales:"); //prints out info
		
		for(Salesman sales : team) { //for each statement where all the sales in team are called one by one
			if(sales.getSales() == highestSales) { //if statement is carried out if ith associate's sales is the same with the value of highestSales
				System.out.println("Name: " + sales.getName()); //prints out the name of the associate
				System.out.println("Sales: $" + sales.getSales()); //prints out the sales of the associate
				System.out.println("$" + (highestSales - averageSales) + "above average"); //prints out how much difference there is in highestSales and averageSales
			}
		}
		
		
		System.out.println("\nThe rest performed as follows:"); //prints out the info
		
		
		for(Salesman sales : team) { //for each statement where all the sales in team are called one by one
			if(sales.getSales() != highestSales) { //if statement is carried out if ith associate's sales is not same with the value of highest Sales
				System.out.println("Name: " + sales.getName());//prints out the name of the associate
				System.out.println("Sales: $" + sales.getSales());//prints out the sales of the associate
				if(sales.getSales() > averageSales) System.out.println("$" + (sales.getSales() - averageSales) + " above average");
				//if statement is carried out if ith associate's sales is greater then averageSales
				//print out how much difference there is in the associate's sales and averageSales
				else System.out.println("$" + (averageSales - sales.getSales()) + " below average"); 
				//print out how much difference there is in the associate's sales and averageSales (if the associate's sales is lower then the averageSales)
			}
		}
		
		
	}

}
