
public class Programmer extends Employee {

		private String preferredLanguage;
		private String preferredIDE;
		
		public Programmer(String name, Integer age, Integer yearStarted, String preferredLanguage,
				String preferredIDE) {
			super(name, age, yearStarted);
			this.preferredLanguage = preferredLanguage;
			this.preferredIDE = preferredIDE;
		}

		public String getPreferredLanguage() {
			return preferredLanguage;
		}

		public void setPreferredLanguage(String preferredLanguage) {
			this.preferredLanguage = preferredLanguage;
		}

		public String getPreferredIDE() {
			return preferredIDE;
		}

		public void setPreferredIDE(String preferredIDE) {
			this.preferredIDE = preferredIDE;
		}
		
		
}
