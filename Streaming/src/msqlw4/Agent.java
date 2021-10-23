package msqlw4;

	public class Agent  {
		
		public String name;
		public Integer id;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public Agent(int id, String name) {
			this.id = id;
			this.name = name;
		}
			
		public int compareTo(Agent agent) {
			return name.compareTo(agent.getName());
		}

		public static int compare(Agent a1, Agent a2) {
			return a1.getName().compareTo(a2.getName());
		}
		
		public String toString() {
			return name;
		}
}
