
public class Kitten extends Cat {
	
	private String sound;

	public Kitten(String type, String name, String colour, String breed, String sound) {
		super(type, name, colour, breed);
		this.sound = sound;
	}
	
	public void meow() {
		System.out.println("The kitten goes " + this.sound);
	}
	
	public void kittenDetails() {
		System.out.println("The " + this.getColour() + " " + this.getBreed() + " kitten is called " + this.getName() + " and it goes " + this.getSound());
	}
	

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}


}
