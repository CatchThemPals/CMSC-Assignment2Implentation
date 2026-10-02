/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi 
 * Description: (Writes out the patients description and tells what procedures)
 * Due: 10/2/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
  independently. I have not copied the code from a student or * any source. I have not given my code to any student.
 * Print your Name here: Sebastian Xu
*/
package cmsc202Assignment2;
import java.util.Scanner;

public class PatientDriverApp {

	public static void main(String[] args) {
		var input = new Scanner(System.in);
		var patientStuff = inputPatient(input);
		displayPatient(patientStuff);
		var p1 = createProcedure1();
		var p2 = createProcedure2();
		var p3 = createProcedure3();
		displayProcedureTable(p1, p2, p3);
		displaySummary(p1, p2, p3);
		System.out.println("The program was developed by a Student: Sebastian Xu 10/2/26");
		
	}
	/**
	 * Creates the patient by using the scanner and getting input
	 * @param Scanner
	 * @return Patient
	 */
	public static Patient inputPatient(Scanner input)
	{
		var p1 = new Patient();
		System.out.println("Enter first name:");
		p1.setFirstName(input.next());
		System.out.println("Enter middle name:");
		p1.setMiddleName(input.next());
		System.out.println("Enter last name:");
		p1.setLastName(input.next());
		input.nextLine();
		System.out.println("Enter street address:");
		p1.setStreetAddress(input.nextLine());
		System.out.println("Enter city:");
		p1.setCity(input.next());
		System.out.println("Enter state:");
		p1.setState(input.next());
		System.out.println("Enter zip:");
		p1.setZipCode(input.next());
		System.out.println("Enter phone number(###-###-####):");
		p1.setPhoneNumber(input.next());
		System.out.println("Enter emergency contact name:");
		p1.setEmergencyName(input.next());
		input.nextLine();
		System.out.println("Enter emergency contact phone(###-###-####):");
		p1.setEmergencyNumber(input.nextLine());
		return p1;
		
	}
	/**
	 * Creates the first procedure by adding the parameters
	 * @return Procedure
	 */
	public static Procedure createProcedure1()
	{
		return new Procedure("Physical Exam","07/20/2026","Dr.Irvine",250.00);
	}
	/**
	 * Creates the second procedure by adding the parameters
	 * @return Procedure
	 */
	public static Procedure createProcedure2()
	{
		Procedure p1 = new Procedure();
		 p1.setName("X-ray");
		 p1.setDate("07/20/2026");
		 p1.setPName("Dr.Jamison");
		 p1.setCharges(550.43);
		return p1;	
	}
	/**
	 * Creates the third procedure by adding the parameters
	 * @return Procedure
	 */
	public static Procedure createProcedure3()
	{
		Procedure p1 = new Procedure("Dr.smith","07/20/2026");
		p1.setCharges(1400.75);
		p1.setName("Blood Test");
		return p1;
	}
	/**
	 * Prints all of the patient information
	 * @param Patient
	 */
	public static void displayPatient(Patient patient)
	{
		System.out.println("Patient Infomration");
		System.out.println("-------------------");
		System.out.println("Name:" + patient.buildFullName());
		System.out.println("Address:" + patient.buildAddress());
		System.out.println("Phone Number:" + patient.getPhoneNumber());
		System.out.println("Emergency Contact:" + patient.buildEmergencyContact());
		System.out.println("Phone Vaild:" + patient.isVaildPhoneNumber());
		System.out.println("Emergency Phone Valid:" + patient.isVaildEmergencyPhoneNumber());
	}
	/**
	 * Takes procedure and display the test, date, name of doctor, the cost in $, and the cost category
	 * @param Procedure
	 */
	public static void displayProcedure(Procedure procedure)
	{
		System.out.printf("%-18s %-12s %-18s %-11s %-10s%n",procedure.getName(), procedure.getDate(),
				procedure.getPName(), procedure.getFormattedCharge(), procedure.getChargeCategory());
	}

	public static void displayProcedureTable(Procedure p1, Procedure p2, Procedure p3)
	{
		System.out.printf("%-18s %-12s %-18s %-11s %-10s%n",
                "Procedure", "Date", "Practitioner", "Charge", "Category");
		System.out.println("------------------------------------------------------------------------");
		displayProcedure(p1);
		displayProcedure(p2);
		displayProcedure(p3);
		System.out.println();
	}
	
	/**
	 * Takes the cost and adds them
	 * @param Procedure
	 * @param Procedure
	 * @param Procedure
	 * @return double
	 */
	public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3)
	{
		return p1.getCharges() + p2.getCharges() + p3.getCharges();
	}
	/**
	 * Takes the cost and then divides by three
	 * @param Procedure
	 * @param Procedure
	 * @param Procedure
	 * @return double
	 */
	public static double calculateAverageCharges(Procedure p1, Procedure p2, Procedure p3)
	{
		return (p1.getCharges() + p2.getCharges() + p3.getCharges())/3;
	}
	/**
	 * Checks which procedure cost the most by using if statement
	 * @param Procedure
	 * @param Procedure
	 * @param Procedure
	 * @return Procedure
	 */
	public static Procedure findHighestChargeProcedure(Procedure p1,Procedure p2,Procedure p3)
	{
		if(p1.getCharges() > p2.getCharges())
		{
			if(p1.getCharges() > p3.getCharges())
			{
				return p1;
			}
			else
			{
				return p3;
			}
		}
		else
		{
			if(p2.getCharges() > p3.getCharges())
			{
				return p2;
			}
			else
			{
				return p3;
			}
		}
	}
	/**
	 * Using isExpensiveProcedure to check when it's a lot and add one if it's
	 * @param Procedure
	 * @param Procedure
	 * @param Procedure
	 * @return int
	 */
	public static int countExpensiveProcedures(Procedure p1,Procedure p2,Procedure p3)
	{
		int n = 0;
		if(p1.isExpensiveProcedure())
		{
			n += 1;
		}
		if(p2.isExpensiveProcedure())
		{
			n += 1;
		}
		if(p3.isExpensiveProcedure())
		{
			n += 1;
		}
		return n;
	}
	/**
	 * Display the total and average charge, tells the highest cost and tells what cost the most
	 * @param Procedure
	 * @param Procedure
	 * @param Procedure
	 */
	public static void displaySummary(Procedure p1, Procedure p2, Procedure p3)
	{
		String a = "$" + String.format("%,.2f", calculateTotalCharges(p1, p2, p3));
		String b = "$" + String.format("%,.2f", calculateAverageCharges(p1, p2, p3));
		var p4 = findHighestChargeProcedure(p1, p2, p3);
		System.out.println("Total Charges:" + a);
		System.out.println("Average Charge:" + b);
		System.out.println("Highest Charge Procedure:" + p4.getName());
		System.out.println("Number of Expensive Procedures:" + countExpensiveProcedures(p1,p2,p3));
	}
	
}
