package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringBuilderTest {

	private StringBuilder subject;
	
	@Before
	public void init() {
		subject = new StringBuilder();
	}
	
	@Test
	public void testAppendBetter() {

		subject.append("Hello");
		subject.append(",");
		subject.append(" ");
		subject.append("World");
		
		assertEquals("Test Append", "Hello, World", subject.toString());
	}
	
	@Test
	public void testClearing(){
		assertEquals(0, subject.length());
		
		subject.append("Hello world");
		subject.setLength(0);
		assertEquals(0, subject.length());
		
		assertEquals("", subject.toString());
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void StringBuilderChecksIndex(){
		subject.insert(-1, "Where does this go?");
	}

}
