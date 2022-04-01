package AddressBookMain;

public interface IAddressBookservice {
	
	void addAddress(String firstname, String lastname, String state, String city, String mailid, long phonenumber,
			long zip);
void printReport();

}

