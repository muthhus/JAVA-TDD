package com.microservice.testing.sample;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private int age;
	private String name;
	
	private List<Player> lstPlayers;
	private ArrayList<String> lstStrPlayer;
	

	public Player() {

	}

	public Player(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Player> getLstPlayers() {
		return lstPlayers;
	}

	public void setLstPlayers(List<Player> lstPlayer) {
		this.lstPlayers = lstPlayer;
	}

	public ArrayList<String> getLstStrPlayer() {
		return lstStrPlayer;
	}

	public void setLstStrPlayer(ArrayList<String> lstStrPlayer) {
		this.lstStrPlayer = lstStrPlayer;
	}


	
	

}
