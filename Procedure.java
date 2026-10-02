/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi 
 * Description: (Holding the Procedure methods)
 * Due: 10/2/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
  independently. I have not copied the code from a student or * any source. I have not given my code to any student.
 * Print your Name here: Sebastian Xu
*/
package cmsc202Assignment2;

public class Procedure {
	private String name,date,PName;
	private double charges;
	public Procedure() // No arg
	{
		
	}
	public Procedure(String PName, String date) // PName and date
	{
		this.PName = PName;
		this.date = date;
	}
	public Procedure(String name, String PName, String date, double charges) // All attributes
	{
		this.name = name;
		this.PName = PName;
		this.date = date;
		this.charges = charges;
	}
	
	/**
	 * Return the String Name
	 * @return String
	 */
	public String getName() {
		return name;
	}
	/**
	 * Replaces name with the new name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Return the String date
	 * @return String
	 */
	public String getDate() {
		return date;
	}
	/**
	 * Replaces date with the new date
	 * @param String
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * Return the String PName
	 * @return String
	 */
	public String getPName() {
		return PName;
	}
	/**
	 * Replaces PName with the new PName
	 * @param String
	 */
	public void setPName(String pName) {
		PName = pName;
	}
	/**
	 * Return the double charges
	 * @return double
	 */
	public double getCharges() {
		return charges;
	}
	/**
	 * Replaces charges with the new charges
	 * @param double
	 */
	public void setCharges(double charges) {
		this.charges = charges;
	}
	/**
	 * Check if the procedure is more than $1000
	 * @return Boolean
	 */
	public boolean isExpensiveProcedure()
	{
		if(charges >= 1000.00) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	 * Apply a percent to the charges
	 * @param double
	 */
	public void applyDiscount(double percent)
	{
		if(percent > 0 && percent < 100)
		{
			charges = charges - ((percent/100)*charges);
		}
	}
	/**
	 * Overrides
	 */
	public String toString()
	{
		return name + " " + date + " " + PName + " " + charges;
	}
	/**
	 * Checks how much it cost and then return one of three categories
	 * @return String
	 */
	public String getChargeCategory()
	{
		if(charges < 270.00)
		{
			return "Low";
		}
		else if(charges < 600)
		{
			return "Medium";
		}
		else
		{
			return "High";
		}
	}
	/**
	 * Checks if the pracitionerName is the same as the PName
	 * @param String
	 * @return Boolean
	 */
	public boolean isPerformedBy(String pracitionerName)
	{
		if(PName.equals(pracitionerName))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	 * Takes charges and put into a string with commas and a dollar sign
	 * @return String
	 */
	public String getFormattedCharge()
	{
		return "$" + String.format("%,.2f", charges); // String.format works like printf()
	}









}
