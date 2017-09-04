package MainTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Main.openfile;

public class openfileTest {
	private openfile f;

	@Before
	public void setUp() throws Exception {
		f=new openfile("C:\\Users\\marek\\Desktop\\Test1.txt");
	}

	@Test
	public void testGetText() {
		String test="test\n";
		assertTrue(test.equals(f.getText()));
	}

}
