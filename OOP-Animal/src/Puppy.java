
public class Puppy extends Dog {

	private String sound;

	public Puppy(String type, String name, String colour, String breed, String sound) {
		super(type, name, colour, breed);
		this.sound = sound;
	}
	
	public void puppyBark() {
		System.out.println("The pup goes " + this.getSound());
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	
}
