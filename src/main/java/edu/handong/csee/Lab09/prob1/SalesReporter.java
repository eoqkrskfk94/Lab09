package edu.handong.csee.Lab09.prob1;
import java.util.Scanner;
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
	private Salesman[] team;//initiates private array variable
	private int numOfSalesman; //initiates private int variable
	
	public SalesReporter() //This method lets the user to enter an input
	{
		System.out.print("Enter number of salesman: "); //prints out the information
		Scanner myScanner = new Scanner(System.in); //creates scanner for insertion
		numOfSalesman = myScanner.nextInt(); //inserts the input value to numOfSalesman
	}
	
	public void printOutMySentence() //This method prints out the information
	{
		System.out.println("I want to print out something when I instatiate "); //prints out the info
	}
	
	public void getData() //This method gets the data from the user and inserts them to the variables
	{
		team = new Salesman[numOfSalesman]; //declares a salesman array team with the number of the salesman the user inserted
		
		for(int i = 0; i < numOfSalesman; i++) //loops until i is smaller than the number of salesman (i starts with 0 and adds 1 every loop)
		{
			Salesman salesman = new Salesman(); //declares an array salesman 
			Scanner myScanner = new Scanner(System.in); //creates scanner for insertion
			System.out.println("Enter data for associate number " + (i+1)); //prints out the info
			
			System.out.print("Enter name of sales associate: "); //prints out the info
			String name = myScanner.nextLine(); //inserts the input value to name
			
			System.out.print("Enter associate's sales: $"); //prints out the info
			double sales = myScanner.nextDouble(); //inserts the input value sales 
			
			salesman.setName(name); //inserts the name of salesman using set method
			salesman.setSales(sales); //inserts the sales of salesman using set method
			
			team[i] = salesman; //inserts the info of salesman into i th team
			
			
		}
	}
	
	public void calculateAverageSales() //this method calculates the average of sales in the team
	{
		double sum = 0; //initiates double sum variable and insert 0 into it
		for(int i = 0; i < numOfSalesman; i++) //loops until i is smaller than the number of salesman (i starts with 0 and adds 1 every loop)
		{
			double sales = team[i].getSales(); //insert the sales value of ith team (using getter method) into sales
			sum = sum + sales; //add all the sales
		}
		
		averageSales = sum / numOfSalesman; //calculate the average
	}
	
	public void calculateHighestSales() //this method calculates the highest sales of sales in the team
	{
		highestSales = 0; //insert 0 to highestSales variable
		for(int i = 0; i < numOfSalesman - 1; i++) //loops until i is smaller than the number of salesman -1(i starts with 0 and adds 1 every loop)
		{
			if(team[i].getSales() < team[i+1].getSales()) //if the value of ith team's sales is smaller than the value of (i+1)team's sales run if statement
			{
				highestSales = team[i+1].getSales(); //insert the value to highestSales
			}
		}
	}
	
	public void printOutResults() //prints out the results of the all the calculation
	{
		System.out.println("Average sales per associate is $" + averageSales); //prints out the average sales per associate
		System.out.println("The highest sales figure is $" + highestSales); //prints out the highest sales 

		
		System.out.println("\nThe following had the highest sales:"); //prints out info
		for(int i = 0; i < numOfSalesman; i++) //loops until i becomes same or bigger than numOfSalesman (i start in the value of 0 and add 1 every loop)
		{
			if(team[i].getSales() == highestSales) //if statement is carried out if ith associate's sales is the same with the value of highestSales
			{
				System.out.println("Name: " + team[i].getName()); //prints out the name of the associate
				System.out.println("Sales: $" + team[i].getSales()); //prints out the sales of the associate
				System.out.println("$" + (highestSales - averageSales) + "above average"); //prints out how much difference there is in highestSales and averageSales
			}
		}
		
		System.out.println("\nThe rest performed as follows:"); //prints out the info
		for(int i = 0; i < numOfSalesman; i++) //loops until i becomes same or bigger than numOfSalesman (i start in the value of 0 and add 1 every loop)
		{
			if(team[i].getSales() != highestSales) //if statement is carried out if ith associate's sales is not same with the value of highest Sales
			{
				System.out.println("Name: " + team[i].getName());//prints out the name of the associate
				System.out.println("Sales: $" + team[i].getSales());//prints out the sales of the associate
				if(team[i].getSales() > averageSales) System.out.println("$" + (team[i].getSales() - averageSales) + " above average");
				//if statement is carried out if ith associate's sales is greater then averageSales
				//print out how much difference there is in the associate's sales and averageSales
				else System.out.println("$" + (averageSales - team[i].getSales()) + " below average"); 
				//print out how much difference there is in the associate's sales and averageSales (if the associate's sales is lower then the averageSales)
			}
		}
		
		
	}

}
