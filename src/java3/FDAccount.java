package java3;

public class FDAccount extends Account{
	int noOfDays;
	String ageOfACHolder;
	int age;
	 FDAccount(int day,int age,String name,int amount){
		noOfDays=day;
		ageOfACHolder=name;
		this.amount=amount;
		this.age=age;
	}
	
	@Override
	double calculateInterest()   {
		// TODO Auto-generated method stub
	try{
		if(age<0 || age>100)
			throw new EAge("invalid age");
		if(noOfDays<0)
			throw new EInvalidDate();
		
			if(amount<0)
				throw new EInvalidAmount("invalid ammount");
			else if(amount<=10000000)
			{
				if(age<60)
				{
					if(noOfDays>=7 && noOfDays<=14)amount=amount*1.0450;
					else if(noOfDays>=15 && noOfDays<=29)amount=amount*1.0475;
					else if(noOfDays>=30 && noOfDays<=45)amount=amount*1.0550;
					else if(noOfDays>=45 && noOfDays<=60)amount=amount*1.07;
					else if(noOfDays>=61 && noOfDays<=184)amount=amount*1.075;
					else if(noOfDays>=185 && noOfDays<=365)amount=amount*1.08;
				}
				else {
					if(noOfDays>=7 && noOfDays<=14)amount=amount*1.050;
					else if(noOfDays>=15 && noOfDays<=29)amount=amount*1.0525;
					else if(noOfDays>=30 && noOfDays<=45)amount=amount*1.06;
					else if(noOfDays>=45 && noOfDays<=60)amount=amount*1.075;
					else if(noOfDays>=61 && noOfDays<=184)amount=amount*1.08;
					else if(noOfDays>=185 && noOfDays<=365)amount=amount*1.085;
				}
			}
			else {
				if(noOfDays>=7 && noOfDays<=14)amount=amount*1.0650;
				else if(noOfDays>=15 && noOfDays<=29)amount=amount*1.0675;
				else if(noOfDays>=30 && noOfDays<=45)amount=amount*1.0675;
				else if(noOfDays>=45 && noOfDays<=60)amount=amount*1.08;
				else if(noOfDays>=61 && noOfDays<=184)amount=amount*1.085;
				else if(noOfDays>=185 && noOfDays<=365)amount=amount*1.01;
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
	catch(EInvalidDate e)
	{
		System.out.print(e.invalidDays());
	}
	catch(Exception e) {
		System.out.println(e);
		return 0.0;
	}
	return amount;	
	}
}
