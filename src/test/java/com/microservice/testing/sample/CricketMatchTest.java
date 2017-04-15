package com.microservice.testing.sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CricketMatchTest {
	
	private static final String MATCH_VENUE ="Chennai";
	
	@Test
	public void constructorShouldSetMatchDetails(){
		CricketMatch match = new CricketMatch();
		match.setmVenue("Chennai");
		
		assertEquals(MATCH_VENUE, match.getmVenue());
	}

}
