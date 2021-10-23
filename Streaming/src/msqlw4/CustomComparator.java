package msqlw4;

import java.util.Collections;
import java.util.Comparator;


public class CustomComparator implements Comparator<Agent> {

	public static void main(String[] args) {
		
		DAO getAgents = new DAO();
		
		System.out.println("-- Original List --");
		
		for(Agent agent : getAgents.agents) {
			System.out.println(agent.name);
		}
		
		System.out.println("\n-- Custom Comparator Sorted List --");
				
		Collections.sort(getAgents.agents, new CustomComparator());
		
		for(Agent agent : getAgents.agents) {
			System.out.println(agent.name);
		}
		
	}
	@Override
	public int compare(Agent o1, Agent o2) {
		return o1.name.compareTo(o2.getName());
	}
		
}	
