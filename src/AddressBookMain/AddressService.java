package AddressBookMain;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class AddressService implements IAddressBookservice {
	
	public ArrayList<AddressBookMain> addressList=new ArrayList();
	


	public void addAddress(String firstname, String lastname, String state, String city, String mailid,
			long phonenumber, long zip) {
		// TODO Auto-generated method stub
		AddressBookMain stock=new AddressBookMain();
		stock.setfirstname(firstname);
		stock.setLastName(lastname);
		stock.setMailid(mailid);
		stock.setPhoneNumber(phonenumber);
        stock.setState(state);
		stock.setCity(city);
		stock.setZip(zip);
		addressList.add(stock);
	/*stockList.remove(0)	;*/
	}
	
	public void editName() {
		System.out.println("********AdressBook*******");
		for(int i=0;i<addressList.size();i++) {
			if(addressList.get(i).getFirstName().equals("sirisha")){
			addressList.get(i).setfirstname("sowjanya");
			System.out.println("+stockList:"+addressList.get(i).getFirstName());

			System.out.println("NAME MATCHES");

			}
			else {
				System.out.println("NAME DOES NOT MATCH");

			}
		}
	}
		
		public void deleteName() {
			System.out.println("********AdressBook*******");
			for(int i=0;i<addressList.size();i++) {
				if(addressList.get(i).getFirstName().equals("sirisha")){
				addressList.remove(i).getFirstName();
				System.out.println("cleared index");

				}
		}

	}
		

	public void printReport() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[]args) {
		AddressService addressservice = new AddressService();
		addressservice.addAddress("sirisha","kopparaju","state","hyderabad","sirishakopparaju",500058898,977787);
		addressservice.addAddress("sowjanya","vadlamani","telangana","hyd","sowjanyavadl",697666760,500067);
		addressservice.searchPerson("hyd", "telangana");
		addressservice.searchPersonS("hyd");
		addressservice.searchWithContact(697666760);
		}

	public void searchPerson(String cityName, String stateName) {
    boolean isPresent =addressList.stream()
            .anyMatch(con -> con.getCity().equals(cityName) || con.getState().equals(stateName));
    if (isPresent) {
    	addressList.stream().filter(s -> s.getCity().equals(cityName) || s.getState().equals(stateName))
                .sorted().forEachOrdered(conts -> System.out.println("User name :" + conts.getFirstName()));

    } else {

        System.out.println("person is not present in this city or state");
    }
    }
    public void searchPersonS(String cityName) {
        boolean isPresent =addressList.stream()
                .anyMatch(con -> con.getCity().equals(cityName));
        if (isPresent) {
        	addressList.stream().filter(s -> s.getCity().equals(cityName))
                    .sorted().forEachOrdered(conts -> System.out.println("User name :" + conts.getFirstName()));

        } else {

            System.out.println("person is not present in this city");
        }
}
    public void searchWithContact(int phoneNumber) {
    	long count =addressList.stream().count();
    	System.out.println(+count);
    }
}
	

    



