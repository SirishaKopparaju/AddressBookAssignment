package AddressBookMain;
import java.util.ArrayList;
import java.util.List;


public class AddressService implements iAddressBookservice {
	
	public List<AddressBookMain> stockList=new ArrayList<AddressBookMain>();



	public void addAddress(String firstname, String lastname, String state, String city, String mailid,
			long phonenumber, long zip) {
		// TODO Auto-generated method stub
		AddressBookMain stock=new AddressBookMain();
		AddressBookMain.setfirstName(firstname);
		AddressBookMain.setlastName(lastname);
		AddressBookMain.setphoneNumber(phonenumber));
		AddressBookMain.setmailid(mailid);
        AddressBookMain.setCity(city);
		AddressBookMain.setState(state);
		AddressBookMain.setZip(zip);

		stockList.add(stock);
		
	}
	
	public void printReport() {
		System.out.println("********AdressBook*******");
		for(int i=0;i<AddressBookMainList.size();i++) {
			System.out.println("***************");
			System.out.println("Stock name:"+AddressBookMain.get(i).getfirstName());
			System.out.println("Stock name:"+AddressBookMain.get(i).getlastName());
			System.out.println("Stock name:"+AddressBookMain.get(i).getCity());
			System.out.println("Stock name:"+AddressBookMain.get(i).getState());
			System.out.println("Stock name:"+AddressBookMain.get(i).getZip());
			System.out.println("Stock name:"+AddressBookMain.get(i).getphoneNumber());
			System.out.println("Stock name:"+AddressBookMain.get(i).getmailid());
			
			System.out.println("***************");
		}

	}

	public void printReport1() {
		// TODO Auto-generated method stub

	}

}
