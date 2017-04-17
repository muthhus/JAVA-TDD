package com.microservice.testing.sample;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.contains;

import java.util.ArrayList;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;

public class PlayerTest {
	
	@InjectMocks
	private Player objPlayer;
	
	private ArrayList<String> arrPlayerName = null;
	
	@BeforeClass
	public static  void initPlayerTest(){
		System.out.println("Starting Player Object Test...");
	}
	
	@Before
	public void setPlayerConstructor(){
		System.out.println("This method called execute before every method run ..");
	}
	
	@Test
	public void constructorShouldBeSetWithParams(){
		System.out.println("Testing Player");	
		
		objPlayer = new Player();
		objPlayer.setAge(31);
		objPlayer.setName("Dhoni");
		
		assertEquals(31,objPlayer.getAge());
		assertEquals("Dhoni", objPlayer.getName());
		
		
	}
	
	@Test
	public void checkPlayerList(){
		ArrayList<String> arrPlayerName = new ArrayList<>();
		arrPlayerName.add("Dhoni");
		arrPlayerName.add("Jadeja");
		arrPlayerName.add("Aswin");
		
		objPlayer = new Player();
		objPlayer.setLstPlayers(arrPlayerName);
		
		assertThat(objPlayer.getLstPlayers(), is(arrPlayerName));
		assertThat(objPlayer.getLstPlayers(), hasItems("Aswin"));
		assertThat(objPlayer.getLstPlayers().size(), is(3));
		
	}
	

	@After
	public void executeAfterEachMethod(){
		System.out.println("This method called/execute after every method run ..");
	}
	
	@AfterClass
	public static void endPlayerTest(){
		System.out.println("Ending Player Object Test..");
	}
	

}
