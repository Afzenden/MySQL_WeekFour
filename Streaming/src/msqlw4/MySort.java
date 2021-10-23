package msqlw4;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class MySort {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Choose Your Sort: \n1: Anonymous Inner Class \n2: Lamda Expresion \n3: Method Reference");
	    int showSort = myObj.nextInt();
	    myObj.close();
	    
	    if (showSort > 0 && showSort < 4) {
	    	    if (showSort == 1) {
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
	    	else if (showSort == 2) {
	    		DAO getAgents = new DAO();
	    		
	    		System.out.println("-- Original List --");
	    		
	    		for(Agent agent : getAgents.agents) {
	    			System.out.println(agent.name);
	    		}
	    		
	    		System.out.println("\n-- Lambda Sorted List --");
	    		
	    		Comparator<Agent> comp = null;
	    		
	    		comp = (a1, a2) -> Agent.compare(a1, a2);
	    		
	    		getAgents.agents.sort(comp);
	    			
	    		getAgents.agents.forEach(agent -> System.out.println(agent.getName()));
	    	}
	    	else if (showSort == 3) {
	    		DAO getAgents = new DAO();
	    		
	    		System.out.println("-- Original List --");
	    		
	    		for(Agent agent : getAgents.agents) {
	    			System.out.println(agent.name);
	    		}
	    		
	    		System.out.println("\n-- Method Reference Sorted List --");
	    		
	    		Comparator<Agent> comp = null;
	    		
	    		comp = Agent::compare;
	    		
	    		getAgents.agents.sort(comp);
	    			
	    		getAgents.agents.forEach(System.out::println);
	    	}
	    }
	    	    
	}

}
