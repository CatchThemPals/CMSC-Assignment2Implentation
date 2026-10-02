/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi 
 * Description: (Holding the patient methods)
 * Due: 10/2/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
  independently. I have not copied the code from a student or * any source. I have not given my code to any student.
 * Print your Name here: Sebastian Xu
*/

package cmsc202Assignment2;

public class Patient {
	private String firstName, middleName, lastName, 
	streetAddress, city, state, phoneNumber, zipCode, emergencyName, emergencyNumber;
	Patient() // No arg constructor
	{
		
	}
	Patient(String a, String b, String c) // Constructor that initializes patient full name
	{
		firstName = a;
		middleName = b;
		lastName = c;
	}	
	Patient(String a, String b, String c,String d, String 
			e, String f, String g, String h, String i, String j) // Constructor that initializes all variables
	{
		firstName = a;
		middleName = b;
		lastName = c;
		streetAddress = d;
		city = e;
		state = f;
		phoneNumber = g;
		zipCode = h;
		emergencyName = i;
		emergencyNumber = j;
	}
	
	/**
	 * Return the String firstName
	 * @return String
	 */
	public String getFirstName()
	{
		return firstName;
	}
	/**
	 * Replaces firstName with the new firstName
	 * @param String
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	/**
	 * Return the String MiddleName 
	 * @return String
	 */
	public String getMiddleName()
	{
		return middleName;
	}
	/**
	 * Replaces MiddleName with the new MiddleName
	 * @param String
	 */
	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	/**
	 * Return the String LastName 
	 * @return String
	 */
	public String getLastName()
	{
		return lastName;
	}
	/**
	 * Replaces LastName with the new LastName
	 * @param String
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	/**
	 * Return the String streetAddress
	 * @return String
	 */
	public String getStreetAddress()
	{
		return streetAddress;
	}
	/**
	 * Replaces streetAddress with the new streetAddress
	 * @param String
	 */
	public void setStreetAddress(String streetAddress)
	{
		this.streetAddress = streetAddress;
	}
	/**
	 * Return the String city
	 * @return String
	 */
	public String getCity() {
		return city;
	}
	/**
	 * Replaces city with the new city
	 * @param String
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * Return the String state
	 * @return String
	 */
	public String getState() {
		return state;
	}
	/**
	 * Replaces state with the new state
	 * @param String 
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * Return the String phoneNumber
	 * @return String
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * Replaces PhoneNumber with the new phoneNumber
	 * @param String
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * Return the String zipcode
	 * @return String
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * Replaces zipcode with the new zipcode
	 * @param String
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * Return the String emergencyName
	 * @return String
	 */
	public String getEmergencyName() {
		return emergencyName;
	}
	/**
	 * Replaces emergencyName with the new emergencyName
	 * @param String
	 */
	public void setEmergencyName(String emergencyName) {
		this.emergencyName = emergencyName;
	}
	/**
	 * Return the String emergencyNumber
	 * @return String
	 */
	public String getEmergencyNumber() {
		return emergencyNumber;
	}
	/**
	 * Replaces emergencyNumber with the new emergencyNumber
	 * @param emergencyNumber
	 */
	public void setEmergencyNumber(String emergencyNumber) {
		this.emergencyNumber = emergencyNumber;
	}
	/**
	 * Combines all of the Names to make a full name
	 * @return String
	 */
	public String buildFullName()
	{
		return firstName + " " +  middleName + " " + lastName;
	}
	/**
	 * Combines the street address, city, state, and zipCode into one string
	 * @return String
	 */
	public String buildAddress()
	{
		return streetAddress + " " + city + " " + state + " " + zipCode;
	}
	/**
	 * Combine the emergency name and emergency number
	 * @return String
	 */
	public String buildEmergencyContact()
	{
		return emergencyName + " " + emergencyNumber;
	}
	/**
	 * Check if the phone number has the requirements
	 * @return boolean
	 */
	public boolean isVaildPhoneNumber()
	{
		if(phoneNumber.length() == 12)
		{
			for(int i = 0; i < phoneNumber.length() - 1; i++)
			{
				char letter = phoneNumber.charAt(i);
				if(i == 3 && letter != '-')
				{
					return false;
				}
				if(i == 7 && letter != '-')
				{
					return false;
				}
			}
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	 * Check if the emergency phone number has the requirements
	 * @return boolean
	 */
	public boolean isVaildEmergencyPhoneNumber()
	{
		if(emergencyNumber.length() == 12)
		{
			for(int i = 0; i < emergencyNumber.length() - 1; i++)
			{
				char letter = emergencyNumber.charAt(i);
				if(i == 3 && letter != '-')
				{
					return false;
				}
				if(i == 7 && letter != '-')
				{
					return false;
				}
			}
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	 * Return last name, middle name, and first name as a string
	 * @return String
	 */
	public String getLastFirstMiddle()
	{
		return lastName + " " + middleName + " " + firstName;
	}
	/**
	 * Checks if the city and state are the same
	 * @param String
	 * @param String
	 * @return Boolean
	 */
	public boolean hasSameCityState(String city, String state)
	{
		if(this.city.equals(state) && this.state.equals(state))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	 * Take the new parameters and replace the old information
	 * @param String
	 * @param String
	 * @param String
	 * @param String
	 */
	public void updateAddress(String street, String city, String state, String zip)
	{
		streetAddress = street;
		this.city = city;
		this.state = state;
		zipCode = zip;
	}
	/**
	 * Combine the contact and name of patient and emergency contact
	 * @return String
	 */
	public String getContactSummary()
	{
		return buildFullName() + ": " + phoneNumber + " " + buildEmergencyContact();
	}
	/**
	 * Overrides
	 */
	public String toString()
	{
		return buildFullName() + " " + buildAddress() + " " + buildEmergencyContact();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
