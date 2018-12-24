package design;

import java.util.Scanner;

public class EmployeeInfo extends Abstract implements Employee{
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	private static String companyName;
	private int employeeId;
	private int employeeAge;
	private String name;
	public int salary;
	private int performance;
	private int address;




	
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
    public String getCompanyName(){
        return companyName;
    }
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){
		this.employeeId = employeeId;
	}
    public EmployeeInfo(String name, int employeeId){
	    this.name = name;
	    this.employeeId = employeeId;
	}
	public EmployeeInfo(String name, int employeeId, int employeeAge, int address){
	    this.name = name;
	    this.employeeId = employeeId;
	    this.employeeAge = employeeAge;
        this.address = address;
    }
	
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static double calculateEmployeeBonus(int numberOfYearsWithCompany){
	    double salary = 0;
        double totalBonus = 0;
	    String performance = "Great performance for the year";
	    String okPerformance = "year was ok for employee";
	    double greatPerformanceBonus = .1;
	    double averagePerformanceBonus = .08;

        System.out.println("Employees only get bonuses after 2 years of work with the company. ");

	    if (numberOfYearsWithCompany >= 2 && performance == "Great performance for the year"){
	        totalBonus = salary * greatPerformanceBonus;
        }
        else if (numberOfYearsWithCompany >= 2 && performance == okPerformance){
            totalBonus = salary * averagePerformanceBonus;
        }else{
            System.out.println( "Have not worked long enough and or had poor performance, Therefore no bonus. ");
        }

		return totalBonus;
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static double calculateEmployeePension(int salary){
		double totalPension=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
        String startYear = convertedJoiningDate.substring(convertedJoiningDate.length() - 4);
        String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length() - 4);
        int start = Integer.parseInt(startYear);
        int current = Integer.parseInt(currentYear);
		//Calculate pension  // calculating the years in the company is the difference of currentYear - startYear
        if ((current - start) == 1){
            totalPension = salary * .05;
        }
        else if ((current - start) >= 2){
            totalPension = salary * .1;
        }
        else if ((current - start) <= 1){
            totalPension = 0;
        }
        System.out.println("PENSION = $ " + totalPension + "monthly");

		return totalPension;
	}



	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
