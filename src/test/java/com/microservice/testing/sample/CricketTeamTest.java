package com.microservice.testing.sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CricketTeamTest {

	@Test
	public void constructorShouldSetTeamPts() {
		CricketTeam team = new CricketTeam(22);
		assertEquals(22, team.getTeamPts());
	}
}
