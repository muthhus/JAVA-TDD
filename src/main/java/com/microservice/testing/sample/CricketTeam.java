package com.microservice.testing.sample;

public class CricketTeam {
	
	private int teamPts;
	private int match;

	public CricketTeam(int teamPts) {
		this.teamPts = teamPts;
	}

	public CricketTeam(int match, int teamPts){
		this.match = match;
		this.teamPts = teamPts;
	}
	

	public int getTeamPts() {
		return teamPts;
	}

	public void setTeamPts(int teamPts) {
		this.teamPts = teamPts;
	}
	
	public int getMatch() {
		return match;
	}

	public void setMatch(int match) {
		this.match = match;
	}
	
	
}
