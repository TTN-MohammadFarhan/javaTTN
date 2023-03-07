package java3;

public class RDAccount extends Account{

	int noOfMonths;
	double monthlyAmount;
	
	int age;
	RDAccount(int Month,int age,int amount){
		 noOfMonths=Month;
		monthlyAmount=amount;
		this.age=age;
	}
	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		try{
			if(noOfMonths<0)
				throw new EInvalidDate();
			if(age<0 || age>100)
				throw new EAge("invalid age");
			
			
				if(amount<0)
					throw new EInvalidAmount("invalid ammount");
				
					if(age<60)
					{
						if(noOfMonths<=6)amount=amount*1.0750;
						else if(noOfMonths>6 && noOfMonths<=12)amount=amount*1.0775;
						else if(noOfMonths>12 && noOfMonths<=15)amount=amount*1.080;
						else if(noOfMonths>15 && noOfMonths<=18)amount=amount*1.0825;
						else if(noOfMonths>18 && noOfMonths<=21)amount=amount*1.085;
						else if(noOfMonths>21)amount=amount*1.0875;
					}
					else {
						if(noOfMonths<=6)amount=amount*1.080;
						else if(noOfMonths>6 && noOfMonths<=12)amount=amount*1.0825;
						else if(noOfMonths>12 && noOfMonths<=15)amount=amount*1.0850;
						else if(noOfMonths>15 && noOfMonths<=18)amount=amount*1.0875;
						else if(noOfMonths>18 && noOfMonths<=21)amount=amount*1.09;
						else if(noOfMonths>21)amount=amount*1.0925;	
					}
				
				
		}
		catch(EInvalidAmount e){
			System.out.println(e);
			return 0.0;
		}
		catch(EAge e)
		{
			System.out.println(e);
			return 0.0;
		}
		catch(EInvalidDate e) {
		  System.out.println(e.monthInvalid());	
		}
		catch(Exception e) {
			System.out.println(e);
			return 0.0;
		}
		return amount;	
	}

}
