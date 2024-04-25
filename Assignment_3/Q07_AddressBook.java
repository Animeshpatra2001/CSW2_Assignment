/*7. Write a java code that comprises of a class Address, having member
variable plot no, at, post and required parameterised constructor. Create
a Tree map having key as name of a person and value as address. 
Insert required key and value in the created tree map and use an iterator to
display it*/
package genericsCollection;

import java.util.Iterator;
import java.util.TreeMap;

class Address {
	String plotNo, at, post;

	public Address(String plotNo, String at, String post) {
		this.plotNo = plotNo;
		this.at = at;
		this.post = post;
	}

	@Override
	public String toString() {
		return "Address{" + "plotNo='" + plotNo + '\'' + ", at='" + at + '\'' + ", post='" + post + '\'' + '}';
	}
}

public class Q07_AddressBook {
	public static void main(String[] args) {

		TreeMap<String, Address> addressBook = new TreeMap<>();

		addressBook.put("Animesh", new Address("16", "Netaji Road", "Kabisuryanagar"));
		addressBook.put("Kanha", new Address("19", "Kumuti Sahi", "Boirani"));
		addressBook.put("Avilasha", new Address("23", "RamMandir Sahi", "Aska"));

		System.out.println("Contents of the Address Book:");
		Iterator<String> iterator = addressBook.keySet().iterator();
		while (iterator.hasNext()) {
			String personName = iterator.next();
			Address address = addressBook.get(personName);
			System.out.println("Name: " + personName + ", Address: " + address);
		}
	}
}
