package msqlw4;

import java.util.ArrayList;
import java.util.List;


public class DAO {
	
	List<Agent> agents = new ArrayList<>(
	List.of(new Agent(5, "Sam Lee"),
			new Agent(9, "Aaron Curtis"),
			new Agent(8, "Cindy Slagel"),
			new Agent(1, "Hilary Woods")
	));
	
	public List<Agent> getAgents() {
		return agents;
	}
	
}
