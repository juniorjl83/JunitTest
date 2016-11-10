package test.java;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.Test;

public class FileSystemTest {

	private static final String FILENAME = "test.data";
	
	@Test
	public void testFileCreation()  throws Exception {

		File f = new File(FILENAME);
		assertFalse(f.exists());
		
		f.createNewFile();
		
		assertTrue(f.exists());
	}

	@After
	public void reallyClean(){
		
		new File(FILENAME).delete();
		new File(FILENAME + ".bak").delete();
		new File(FILENAME + ".tmp").delete();
	}
}
