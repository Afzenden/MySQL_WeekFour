package msqlw4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class QTwo {

	public static void main(String[] args) {
		
		List<Agent> agents = new ArrayList<>(List.of(new Agent(5, "Sam Lee"), new Agent(9, "Aaron Curtis"),
				new Agent(8, "Cindy Slagel"), new Agent(1, "Hilary Woods")));
		
		System.out.println(agents.stream().map(name -> name.toString()).sorted().collect(Collectors.joining(", ")));
		
	}
}
