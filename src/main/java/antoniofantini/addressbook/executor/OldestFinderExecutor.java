package antoniofantini.addressbook.executor;

import antoniofantini.addressbook.container.Person;
import antoniofantini.addressbook.utils.Utils;

public class OldestFinderExecutor extends AbsExecutor {

	@Override
	public String execute() {
		Person retval = null;
		for (Person p : addressBook.values()) {
			if (retval == null) {
				retval = p;
				continue;
			} else if (Utils.isOlder(p.getdOB(), retval.getdOB())) {
				retval = p;
			}
		}
		return "The oldest person in the addressbook is " + retval.getFullName();
	}

}
