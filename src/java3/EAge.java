package java3;

public class EAge extends RuntimeException {
	String msg;
	EAge(String str)
	{
		super(str);
		msg=str;
	}
	@Override
	public String toString()
	{
		return msg;
	}
}
