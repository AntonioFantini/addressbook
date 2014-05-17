package antoniofantini.addressbook.executor;

import antoniofantini.addressbook.container.Person;
import antoniofantini.addressbook.utils.Utils;

public class MalesCounterExecutor extends AbsExecutor {

	@Override
	public String execute() {
		long males = 0;
		for (Person p : addressBook.values()) {
			if (Utils.isMale(p))
				males++;
		}
		return "There are " + males + " males in the addressbook";
	}
}
