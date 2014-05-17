package antoniofantini.addressbook.executor;

import antoniofantini.addressbook.utils.Utils;

public class DaysOfDiffExecuor extends AbsExecutor {

	@Override
	public String execute() {
		return "There are " + Utils.daysOfDifference(addressBook.get("Bill").getdOB(), addressBook.get("Paul").getdOB())
				+ " days between Bill and Paul Dates of Birth";
	}

}
