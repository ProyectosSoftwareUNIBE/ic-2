package unibe;

public class User {
	private String name, familyName;
	
	public User(String name, String familyName) {
		
		this.name=name;
		this.familyName=familyName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	public String Mayusculas() {
		return name.toLowerCase();
		
	}

}
