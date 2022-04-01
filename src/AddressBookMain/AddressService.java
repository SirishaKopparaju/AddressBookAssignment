package AddressBookMain;
import java.util.ArrayList;
import java.util.List;


public class AddressService implements IAddressBookservice {
	
	public ArrayList<AddressBookMain> stockList=new ArrayList();
	


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
stockList.add(stock);
	/*stockList.remove(0)	;*/
	}
	
	public void editName() {
		System.out.println("********AdressBook*******");
		for(int i=0;i<stockList.size();i++) {
			if(stockList.get(i).getFirstName().equals("sirisha")){
			stockList.get(i).setfirstname("sowjanya");
			System.out.println("+stockList:"+stockList.get(i).getFirstName());

			System.out.println("NAME MATCHES");

			}
			else {
				System.out.println("NAME DOES NOT MATCH");

			}
		}
	}
		
		public void deleteName() {
			System.out.println("********AdressBook*******");
			for(int i=0;i<stockList.size();i++) {
				if(stockList.get(i).getFirstName().equals("sirisha")){
				stockList.remove(i).getFirstName();
				System.out.println("cleared index");

				}
		}

	}

	public void printReport() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[]args) {
		addAddresscompany("sirisha","kopparaju","state","hyderabad","sirishakopparaju",500058898,977787);
		addAddresscompany("sowjanya","vadlamani","telangana","hyd","sowjanyavadl",697666760,500067);
		
	}

	private static void addAddresscompany(String string, String string2, String string3, String string4, String string5,
			int i, int j) {
		// TODO Auto-generated method stub
		
	}



}
