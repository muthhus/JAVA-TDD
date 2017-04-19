package com.microservice.testing.sample;

import java.util.List;

public class CricketTeam {
	
	private int teamPts;
	private int match;
	
	List<String> lstTeamPlayer;
	
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
	
	public List<String> getLstTeamPlayer() {
		return lstTeamPlayer;
	}

	public void setLstTeamPlayer(List<String> lstTeamPlayer) {
		this.lstTeamPlayer = lstTeamPlayer;
	}
	
	
}
