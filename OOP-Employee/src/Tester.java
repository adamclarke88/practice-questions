
public class Tester extends Programmer {
	
	private Integer yearsExperience;
	private Boolean isCertified;

	public Tester(String name, Integer age, Integer yearStarted, String preferredLanguage, String preferredIDE,
			Integer yearsExperience, Boolean isCertified) {
		super(name, age, yearStarted, preferredLanguage, preferredIDE);
		this.yearsExperience = yearsExperience;
	}
	
	
	public void outputName() {
		System.out.println("Testers name is" + this.getName());
	}
	
	public void outputYearsExperience() {
		System.out.println(this.getName() + " Has " + this.getYearsExperience() + " years experience");
	}
	
	public void isTesterCertified() {
		System.out.println("Is " + this.getName() + " certified? " + this.isCertified);
	}
	
	

	public Integer getYearsExperience() {
		return yearsExperience;
	}

	public void setYearsExperience(Integer yearsExperience) {
		this.yearsExperience = yearsExperience;
	}

	public Boolean getIsCertified() {
		return isCertified;
	}

	public void setIsCertified(Boolean isCertified) {
		this.isCertified = isCertified;
	}
	
	

}
