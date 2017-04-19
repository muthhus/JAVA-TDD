package com.microservice.testing.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CricketTeamImplTest {

	@Mock
	PlayerRepository playerRepository;

	@InjectMocks
	CricketTeamImpl cricketTeamImpl;

	@Test
	public void getTeamNameAndPlayersTest() {
		
	}

}
