package java3;

public class EInvalidAmount extends RuntimeException {
    String msg;
	EInvalidAmount(String msg)
	{
		super(msg);
		this.msg=msg;
	}
	 @Override
	    public String toString() {
	        return msg;
	    }
}
