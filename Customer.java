package kamp4;

public class Customer implements Entity{

	private int Id;
	private String firstName;
	private String lastName;
	private String NationalIdentity;
	public Customer(int id, String firstName, String lastName, String nationalIdentity) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		NationalIdentity = nationalIdentity;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalIdentity() {
		return NationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		NationalIdentity = nationalIdentity;
	}
}
