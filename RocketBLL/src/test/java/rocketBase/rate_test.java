package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.junit.Test;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class rate_test {

	//TODO - RocketBLL rate_test
	//		Check to see if a known credit score returns a known interest rate
	@Test
	public void getInterestRate() throws RateException {
		
		assertEquals(RateBLL.getRate(670),4.5,4.5);
	}
	//TODO - RocketBLL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score
	@Test(expected = RateException.class) 
	public void testException() throws RateException{
		RateBLL.getRate(900);
	}
}
