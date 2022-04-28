package AddressBookMain;

public class AddressBookMain {
	private	String firstName;
	  private String lastName;
	 private long phoneNumber;
	 private String mailid;
	 private String city;
  private String state;
private long Zip;
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
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZip() {
		return Zip;
	}
	public void setZip(long zip) {
		Zip = zip;
	}
	public void setfirstname(String firstname) {
		this.firstName = firstname;
	}
	public void AdressBook(String firstname, String lastname,String state,String city,String mailid,long phonenumber,long Zip ) {
		
		this.lastName= lastname;
		this.phoneNumber=phonenumber;
		 this.mailid=mailid;
		 this.city= city;
	  this.Zip=Zip;
	  this.state=state;
	  
	}
	public void AdressBook() {
		// TODO Auto-generated constructor stub
	}
	public void getContact() {
		// TODO Auto-generated method stub
		
	}
	
	}





		
	
