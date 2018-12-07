
public class Cat extends Animal {
	
	private String colour;
	private String breed;
	
	public Cat(String type, String name, String colour, String breed) {
		super(type, name);
		this.colour = colour;
		this.breed = breed;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}
