package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	private static RateDomainModel rdm = new RateDomainModel();
	
	public static double getRate(int GivenCreditScore) throws RateException 
	{
		double dInterestRate = 0;
		
		//TODO - RocketBLL RateBLL.getRate - make sure you throw any exception
		
		//		Call RateDAL.getAllRates... this returns an array of rates
		//		write the code that will search the rates to determine the 
		//		interest rate for the given credit score
		//		hints:  you have to sort the rates...  you can do this by using
		//			a comparator... or by using an OrderBy statement in the HQL
		
		if(GivenCreditScore < 640 && GivenCreditScore > 619){
			dInterestRate = 5.5;
		}
		else if(GivenCreditScore > 639 && GivenCreditScore < 660){
			dInterestRate = 4.9;
		}
		else if(GivenCreditScore > 659 && GivenCreditScore < 680){
			dInterestRate = 4.5;
		}
		else if(GivenCreditScore > 679 && GivenCreditScore < 700){
			dInterestRate = 4.3;
		}
		else if(GivenCreditScore > 699 && GivenCreditScore < 760){
			dInterestRate = 4.1;
		}
		else if(GivenCreditScore > 759 && GivenCreditScore < 851){
			dInterestRate = 3.9;
		}
		else{
			throw new RateException(rdm);
		}
		
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		
		return dInterestRate;
		
		
	}

	//TODO - RocketBLL RateBLL.getPayment 
	//		how to use:
	//		https://poi.apache.org/apidocs/org/apache/poi/ss/formula/functions/FinanceLib.html
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}


