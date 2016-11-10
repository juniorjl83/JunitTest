package test.java;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class SqrtTest {

	@Test @Ignore
	public void testSqrtBad() {

		assertEquals("test sqrt", 1.414213562D, Math.sqrt(2));	
	}
	
	@Test
	public void testSqrtGood() {

		assertEquals("test sqrt", 1.414213562D, Math.sqrt(2), 0.000000001D);	
	}

}
