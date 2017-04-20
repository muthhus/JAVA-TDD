package com.microservice.testing.sample;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CricketTeamImplTest {

	@Mock
	PlayerService playerService	;

	@InjectMocks
	CricketTeamImpl cricketTeamImpl;
	
	@InjectMocks
	Player objPlayer;

	@Test
	public void getTeamNameAndPlayersTest() {
		Map<String, List<Player>> map = new HashMap<String, List<Player>>();
		map.put("Chennai", objPlayer.getLstPlayers());
		
		when(playerService.getTeamNameAndPlayers()).thenReturn(map);
		
		Map<String, List<Player>> teamImpl = cricketTeamImpl.getTeamNameAndPlayers();
		
		assertEquals(1, teamImpl.size());
	}
	
	@Test
	public void getTeamNameAndPlayersBDDTest() {
		Map<String, List<Player>> map = new HashMap<String, List<Player>>();
		map.put("Chennai", objPlayer.getLstPlayers());
		
		//When
		when(playerService.getTeamNameAndPlayers()).thenReturn(map);
		
		//And
		Map<String, List<Player>> teamImpl = cricketTeamImpl.getTeamNameAndPlayers();
		
		//then
		assertThat(teamImpl.size(), is(1));
	}

}
