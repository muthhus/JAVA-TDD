package com.microservice.testing.sample;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;



@RunWith(JUnitParamsRunner.class)
public class CricketTeamTest {
	
	private static final  int TEAM_POINTS = 22;
	


	@Test
	public void constructorShouldSetTeamPts() {
		CricketTeam team = new CricketTeam(TEAM_POINTS);
		assertEquals("This team won 11 Matches to get this points.", TEAM_POINTS, team.getTeamPts());
	}
	
//	 Second Test with Parameterized Test
	
	public Object[] nbOfMatchesWon() {
		return $(18,20,22,24);
	}
	
	
	
	@Test
	@Parameters(method = "nbOfMatchesWon")
	public void constructorShouldSetTeamPts(int nbOfMatchesWon){
		
		CricketTeam team = new CricketTeam(nbOfMatchesWon);
		assertEquals("Testing with multiple team ponits which considered as team has moved to next levels.", nbOfMatchesWon, team.getTeamPts());
		
	}
	
//	 Multiple params testing
	
//	private static final Object[] nbOfMatchesAndPts(){
//		
//		return new Object[]{
//				new Object[]{9, 18},
//				new Object[]{10, 20},
//				new Object[]{11, 22},
//				new Object[]{12, 24}
//		};
//	}
	
	private static final Object[] nbOfMatchesAndPtsWithDollarSign(){
		return $(
					$(9,18),
					$(10, 20),
					$(11, 22),
					$(12, 24)
				);
	}
	
	@Test
	@Parameters(method="nbOfMatchesAndPtsWithDollarSign")
	public void constructorShouldSetTeamPts(int match, int teamPts){
		CricketTeam team = new CricketTeam(match, teamPts);
		assertEquals(match, team.getMatch());
		assertEquals(teamPts, team.getTeamPts());
	}
	
	
	
	
}
