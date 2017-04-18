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

	private Player objPlayer;

	private ArrayList<String> arrPlayerName = null;

	@BeforeClass
	public static void initPlayerTest() {
		System.out.println("Starting Player Object Test...");

	}

	@Before
	public void setPlayerConstructor() {
		System.out.println("This method called execute before every method run ..");
		objPlayer = new Player();
		arrPlayerName = new ArrayList<>();
		arrPlayerName.add("Dhoni");
		arrPlayerName.add("Jadeja");
		arrPlayerName.add("Aswin");
	}

	@Test
	public void verifyPlayerAge() {
		objPlayer.setAge(31);
		assertEquals(31, objPlayer.getAge());

	}

	@Test
	public void verifyPlayerName() {
		System.out.println("Testing Player");
		objPlayer.setName("Dhoni");

		assertEquals("Dhoni", objPlayer.getName());

	}

	@Test
	public void checkPlayerList() {
		objPlayer.setLstPlayers(arrPlayerName);

		assertThat(objPlayer.getLstPlayers(), is(arrPlayerName));
		assertThat(objPlayer.getLstPlayers(), hasItems("Aswin"));
		assertThat(objPlayer.getLstPlayers().size(), is(3));

	}

	@After
	public void executeAfterEachMethod() {
		System.out.println("This method called/execute after every method run ..");
	}

	@AfterClass
	public static void endPlayerTest() {
		System.out.println("Ending Player Object Test..");
	}

}
