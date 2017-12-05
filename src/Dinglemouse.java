public class Dinglemouse {

	  private String firstName;
	  private String lastName;
  
	  public Dinglemouse(String firstName, String lastName) {
		    this.firstName = firstName;
		    this.lastName = lastName;
	  }
  
	  public String getFullName() { 
		  return firstName + " " + lastName;
	  }
	  
	  public static void main(String[] args) {
		  Dinglemouse x = new Dinglemouse("Sameer", "Khan");
		  System.out.println(x.getFullName());
	  }
}