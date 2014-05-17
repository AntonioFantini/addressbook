package antoniofantini.addressbook.factory;

import antoniofantini.addressbook.executor.DaysOfDiffExecuor;
import antoniofantini.addressbook.executor.Executor;
import antoniofantini.addressbook.executor.MalesCounterExecutor;
import antoniofantini.addressbook.executor.OldestFinderExecutor;

public class ExecutorFactory {

	public static Executor getExecutor(ExecutorType type){
		
		switch (type) {
		case OLDEST_FINDER:
			return new OldestFinderExecutor();
		case MALES_COUNTER:
			return new MalesCounterExecutor();
		case DOD_FINDER:
			return new DaysOfDiffExecuor();		

		default:
			throw new RuntimeException();
		}
	}
}
