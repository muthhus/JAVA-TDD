package com.microservice.testing.sample;

import java.util.ArrayList;

public class Player {

	private int age;
	private String name;
	
	private ArrayList<String> lstPlayers;

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

	public ArrayList<String> getLstPlayers() {
		return lstPlayers;
	}

	public void setLstPlayers(ArrayList<String> lstPlayers) {
		this.lstPlayers = lstPlayers;
	}
	
	

}
