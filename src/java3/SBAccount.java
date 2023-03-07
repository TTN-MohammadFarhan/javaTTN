package java3;
import java.util.*;
public class SBAccount extends Account {

	String resident;
	SBAccount(String res,int amount){
		resident=res;
		this.amount=amount;
	}
	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		try {
			
			if(amount<0)
				throw new EInvalidAmount("invalid ammount");
			
			if(resident.compareTo("Normal")==0)
				amount=amount*1.04;
			else
				amount=amount*1.06;
			
		}
		catch(EInvalidAmount e)
		{
			System.out.println(e.msg);
			return 0.0;
		}
		catch(Exception e) {
			System.out.println(e);
			return 0.0;
		}
		return amount;
	}

}
