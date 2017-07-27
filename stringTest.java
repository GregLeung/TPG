import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class stringTest {
	String testString;
	ReverseAndSuffle stringModificationTester = new ReverseAndSuffle();
	GetMedian medianTester = new GetMedian();
	@Before
	public void setUp() throws Exception {
		testString = "abcde";
	}

	@Test
	public void testReverse() {
		testString = stringModificationTester.reverse(testString);
		assertEquals("edcba", testString);
	}
	@Test
	public void testShuffle(){
		testString = stringModificationTester.reShuffle(testString);
		assertNotEquals("abcde", testString);
	}
	@Test
	public void testMedian(){
		int[] oddArr = {0,1,2,3,4,5,6};
		assertEquals(3, medianTester.getMedian(oddArr), 1e-15);
		int[] evenArr = {0,1,2,3,4,5,6,7};
		assertEquals(3.5, medianTester.getMedian(evenArr), 1e-15);

	}
	
}
