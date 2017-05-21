package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.junit.Test;
import org.w3c.dom.ranges.RangeException;

import rocketDomain.RateDomainModel;

public class Rate_Test {

	
	//TODO - RocketDAL rate_test
	//		Check to see if a known credit score returns a known interest rate
	@Test
	public void getInterestRate() {
		ArrayList<Integer> crdtScores = new ArrayList<Integer>();
		RateDAL.getAllRates();
		crdtScores.add(660);
		double interestRate = .045;
		assertEquals(interestRate,.045,.045);
	}
	
	//TODO - RocketDAL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score
	@Test(expected = HibernateException.class) 
	public void testException() throws Exception{
		ArrayList<RateDomainModel> alRates = new ArrayList<RateDomainModel>();	
		if(alRates.size() == 0){
			throw new HibernateException("no values present");
		}
	}
}
