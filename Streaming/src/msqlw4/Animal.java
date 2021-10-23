package msqlw4;

public class Animal {
	
	public String animalType;
	public String animalSound;
	
	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public Animal(String animalType, String animalSound) {
		this.animalType = animalType;
		this.animalSound = animalSound;
		
	}
	
	//Constructor with no soundType
	
	public Animal(String animalType) {
		this.animalType = animalType;
		
	}
	
	public void makeNoise() {
		System.out.println("Growl!");
	}
}
