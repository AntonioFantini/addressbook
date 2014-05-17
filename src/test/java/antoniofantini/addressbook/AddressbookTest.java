package antoniofantini.addressbook;

import antoniofantini.addressbook.factory.ExecutorFactory;
import antoniofantini.addressbook.factory.ExecutorType;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test
 */
public class AddressbookTest extends TestCase {
	public AddressbookTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(AddressbookTest.class);
	}

	public void testApp() {
		
		System.out.println(ExecutorFactory.getExecutor(ExecutorType.OLDEST_FINDER).execute());
		System.out.println(ExecutorFactory.getExecutor(ExecutorType.MALES_COUNTER).execute());
		System.out.println(ExecutorFactory.getExecutor(ExecutorType.DOD_FINDER).execute());
	}
}
