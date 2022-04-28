package AddressBookMain;

import java.util.Scanner;

public class AddressReport {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("pLease enter the number of address book:");
		int numberOfBooks=scanner.nextInt();
		AddressService iAddressBookservice=new AddressService();
		for(int i=0;i<numberOfBooks;i++) {
			System.out.println("Please enter first name");
			String firstname=scanner.next();
			System.out.println("Please enter last name");
			String lastname=scanner.next();
			System.out.println("Please enter state");
			String state=scanner.next();
			System.out.println("Please enter city");
			String city=scanner.next();
			System.out.println("Please enter mailid");
			String mailid=scanner.next();
			System.out.println("Please enter phonenumber");
			long phonenumber=scanner.nextLong();
			System.out.println("Please enter Zip");
			long Zip=scanner.nextLong();
			
			
			
			
			iAddressBookservice.addAddress(firstname,lastname,state,city,mailid,phonenumber,Zip);
		}
		iAddressBookservice.editName();
		
		
	}
	
}
