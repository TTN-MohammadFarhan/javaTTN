package java3;

public class EInvalidDate extends RuntimeException {

	public String monthInvalid() {
		return " month cant be less than 0"; 
	}
	public String invalidDays()
	{
		return "days cannot be less than 0";
	}
}
