package antoniofantini.addressbook.executor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

import antoniofantini.addressbook.container.Person;
import antoniofantini.addressbook.utils.Utils;

public abstract class AbsExecutor implements Executor {

	protected static HashMap<String, Person> addressBook = null;

	static {
		loadAddressBook();
	}
	
	private static void loadAddressBook() {
		if (addressBook == null) {
			addressBook=new HashMap<>();
			InputStream in = Executor.class.getResourceAsStream("/AddressBook.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			String row;

			try {
				while ((row = br.readLine()) != null) {
					Person p = Utils.parsePersonRow(row);
					String key = p.getFullName().contains(" ")? p.getFullName().substring(0, p.getFullName().indexOf(" ")):p.getFullName();
					addressBook.put(key, p);
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}

			try {
				br.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
}
