package AddressBookMain;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class AddressService implements IAddressBookservice {
	final static String FILE_PATH = "/d/AddressBook4/addressBookOutputData.txt";
	final static String CSV_FILE_PATH = "d:\\AddressBook4\\addressBookOutputDataCSVFile.csv";
	
	private static final Object FILE_IO = null;
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
		//addressservice.SortTheName("Sirisha");
	//	addressservice.SortTheCity("Hyd");
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

/*public void SortTheName(String FirstName) {
	List<String> sortedList = addressList.stream().sorted((FirstName1,FirstName2)->FirstName2.compareTo(FirstName1).collect(Collectors.toList());
			System.out.println(+sortedList);
}
public void SortTheCity(String cityName) {
	List<String> sortedList = addressList.stream().sorted((cityName1,cityName2)->cityName2.compareTo(cityName1).collect(Collectors.toList());
			System.out.println(+sortedList);
}*/
    public void writeAddressBookInFiles(AddressService ioService){
        if (ioService.equals(AddressService.FILE_IO)) {
            List<AddressBookMain> entries;
			//new AdressBookFileIO().writeData(entries);
            System.out.println("Data stored successfully in /IdeaProjects/AddressBook/AddressBook.txt");
        }
    }

    public void readAddressBookInFiles(AddressService ioService){
        if (ioService.equals(AddressService.FILE_IO)) {
            new AdressBookFileIO().readData();
            System.out.println("Data Read successfully From /IdeaProjects/AddressBook/AddressBook.txt");
        }
        
    }
  /* public void readPersonDataFromFile() {
   	 try {
            Files.lines(new File(FILE_PATH).toPath()).forEach(System.out::println);
        }catch (IOException ioException) {
            ioException.printStackTrace();
        }
   }*/
   
   public  void writeDataIntoCSVFile() {
       FileWriter fileWrite;
       try {
           fileWrite = new FileWriter(CSV_FILE_PATH );
           CSVWriter writer = new CSVWriter();
           for (Map.Entry<String, AddressBookMain> e : AddressBookMain.entrySet()) {
               HashSet<AddressBookMain> addressBook = e.getValue().addressBook;
               List<String[]> contacts = addressBook.stream().map(person -> {
                           String[] contact = new String[]{person.getFirstName(), person.getCity(), person.getState(), person.email};
                           return contact;
                       }
               ).collect(Collectors.toList());
               writer.writeAll(contacts);
           }
           writer.close();
       } catch (IOException e) {
           e.printStackTrace();
           System.err.println("Invalid path");
       }

   }

public void readCSVDataFromFile() {
   System.out.println("Reading from CSV File");
   try {
       FileReader filereader = new FileReader(CSV_FILE_PATH);
       CSVReader csvReader = new CSVReader();
       String[] nextRecord;
       while ((nextRecord = csvReader.readNext()) != null) {
           for (String cell : nextRecord) {
               System.out.print(cell + "\t");
           }
           System.out.println();
       }
   } catch (Exception e) {
       System.err.println("File not found at given path");
   
}
   public void writeDataIntoJsonFile() throws IOException {
       Gson gson = new GsonBuilder().setPrettyPrinting().create();
       Writer writer = null;
       try {
           writer = new FileWriter(JSON_FILE_PATH);
           for (Map.Entry<String, AddressBook> e : dictionaryOfAddressBooks.entrySet()) {
               gson.toJson(e.getValue(), writer);//HashSet to JSON
           }

           // close writer
       } catch (Exception ex) {
           ex.printStackTrace();
       } finally {
           writer.close();
       }
   }
public void readDataFromJsonFile() {
Gson gson = new GsonBuilder().setPrettyPrinting().create();
try {
   System.out.println("Reading data from a JSON file");
   System.out.println("----------------------------");
   AddressBook data = gson.fromJson(new FileReader(JSON_FILE_PATH), AddressBook.class);
   System.out.println(gson.toJson(data));
} catch (IOException e) {
   System.err.println("File not found in given path");
}
}

   }
}

	

    



