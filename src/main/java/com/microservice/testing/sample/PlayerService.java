package com.microservice.testing.sample;

import java.util.List;
import java.util.Map;

public interface PlayerService {
	
	public Map<String, List<Player>> getTeamNameAndPlayers();

}
