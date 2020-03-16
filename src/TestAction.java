
public class TestAction {
	
	private String message;
	private String firstName;
	private String lastName;
	
	public String execute() {
		message = "SUCCESS Message"; 
		System.out.println("execute() method called");
		System.out.println("Name: " + firstName + " " + lastName);
		return "success";
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}

}
