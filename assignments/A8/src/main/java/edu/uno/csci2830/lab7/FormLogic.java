package edu.uno.csci2830.lab7;

public class FormLogic {

    // TODO:
    // Implement this method:
    //
    public String formatOutput(String name, String number, String email) {
		
		String nameTrimmed = (name == null) ?  "" :  name.trim();
		String numberTrimmed = (number == null) ?  "" :  number.trim();
		String emailTrimmed = (email == null) ?  "" :  email.trim();

		String returnMsg = "Name: " + nameTrimmed + "\n" + 
						   "Number: " + numberTrimmed + "\n" +
						   "Email: " + emailTrimmed + "\n";
		
		return returnMsg;

	}




    //
    // The method should:
    // - Trim whitespace
    // - Handle null values safely
    // - Return a formatted multi-line string like:
    //
    // Name: <value>
    // Number: <value>
    // Email: <value>

}
