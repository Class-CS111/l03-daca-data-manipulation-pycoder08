// STUDENT NAME: Muhammad Conn
// DATE: 2/9/2025

public class Main 
{
  public static void main(String[] args) 
    {

        /***** DECLARATION SECTION *****/
	// We define the components of today's date to call on later
	int presentDay = 9;
	int presentMonth = 2;
	int presentYear = 2025;

	// We define the components of the birth date
	int birthDay = 01;
	int birthMonth = 01;
	int birthYear = 2000;

	// julianPresentConstant and julianBirthConstant are variables that will be used in the julian formula
	int julianPresentConstant = (14 - presentMonth) / 12;
	int julianBirthConstant = (14 - birthMonth) / 12;

	// We define the components of the julian formula for the present julian day
	int julianPresentMonth = presentMonth + 12 * julianPresentConstant - 3;
	int julianPresentYear = presentYear + 4800 - julianPresentConstant;

	// We define the components of the julian formula for the birth julian day
	int julianBirthMonth = birthMonth + 12 * julianBirthConstant - 3;
	int julianBirthYear = birthYear + 4800 - julianBirthConstant;

	//We declare these variables that will be initialized in calculation
	int julianPresent;
	int julianBirth;
	int julianDifference;
	int julianDifferenceYears;
        
        /***** CALCULATION & PROCESSING SECTION *****/
	// Here we calculate the Julian days for today and the birthdate, as well as their difference and the years between them so we can print the values later
	julianPresent = presentDay + (153 * julianPresentMonth + 2) / 5 + 365 * julianPresentYear + julianPresentYear / 4 - julianPresentYear / 100 + julianPresentYear / 400 - 32045;
	julianBirth = birthDay + (153 * julianBirthMonth + 2) / 5 + 365 * julianBirthYear + julianBirthYear / 4 - julianBirthYear / 100 + julianBirthYear / 400 - 32045;
	julianDifference = julianPresent - julianBirth;
	julianDifferenceYears = julianDifference / 365;

        /***** OUTPUT SECTION *****/
	//output to print our calculated values to the screen
	System.out.println("Julian Day Number for today's date, " + presentMonth + "/" + presentDay + "/" + presentYear + ", is " + julianPresent);
	System.out.println("Julian Day Number for birthday, " + birthMonth + "/" + birthDay + "/" + birthYear + ", is " + julianBirth);
	System.out.println("The difference in days is " + julianDifference + ", which makes you approximately " + julianDifferenceYears + " years old!");
    }
}
