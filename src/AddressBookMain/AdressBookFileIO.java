package AddressBookMain;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.nio.file.Files;
import java.io.File;

public class AdressBookFileIO {

    public void writeData(List<AddressBook> addressBook){
        StringBuffer addressBookBuffer = new StringBuffer();
        addressBook.forEach(employee ->{
            String empDataString = employee.toString().concat("\n");
            addressBookBuffer.append(empDataString);
        });
        try {
            Files.write(Paths.get("AddressBook.txt"),addressBookBuffer.toString().getBytes());
        }catch (IOException x){
            x.printStackTrace();
        }
    }

    public List<AddressBookMain> readData() {
            List<AddressBookMain> addressBookList = new ArrayList<>();

            try {
                Files.lines(new File("AddressBook.txt").toPath())
                        .map(line -> line.trim())
                        .forEach(line -> System.out.println(line));
            }catch (IOException x){
                x.printStackTrace();
            }
            return addressBookList;
        }
}

}
