package com.microservice.testing.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CricketTeamImpl {

	private PlayerService playerRepository;

	private Player objPlayer;

	private List<Player> lstPlayer;

	Map<String, List<Player>> mapTeam;

	public CricketTeamImpl(PlayerService playerRepository) {
		this.playerRepository = playerRepository;
	}


	public Map<String, List<Player>> getTeamNameAndPlayers() {
		lstPlayer = new ArrayList<Player>();
		mapTeam = new HashMap<>();

		objPlayer = new Player();
		objPlayer.setName("Dhoni");
		objPlayer.setAge(32);

		lstPlayer.add(objPlayer);

		objPlayer = new Player();
		objPlayer.setName("Jadeja");
		objPlayer.setAge(27);

		lstPlayer.add(objPlayer);

		objPlayer = new Player();
		objPlayer.setName("Rahanae");
		objPlayer.setAge(26);

		lstPlayer.add(objPlayer);

		objPlayer = new Player();
		objPlayer.setName("Aswin");
		objPlayer.setAge(29);

		lstPlayer.add(objPlayer);

		objPlayer.setLstPlayers(lstPlayer);
		
		mapTeam.put("Chennai", objPlayer.getLstPlayers());
		
		return mapTeam;
	}

}
