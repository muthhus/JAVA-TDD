package com.microservice.testing.sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CricketTeamTest {
	
	private static final  int TEAM_POINTS = 22;

	@Test
	public void constructorShouldSetTeamPts() {
		CricketTeam team = new CricketTeam(TEAM_POINTS);
		assertEquals("This team won 11 Matches to get this points.", TEAM_POINTS, team.getTeamPts());
	}
}
