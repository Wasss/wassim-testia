import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

/**
 * You can access to the Internet and get all libraries you want.
 */
public class TestLevel1 {

	@Test // Configure project to solve this problem.
	public void concatTest() {
		/**
		 * Create a class "ClassTest" with 2 fields: - An integer initialized to 1 - A
		 * String initialized to "toto". In this class, create a private method "String
		 * concat()" that concatenate both fields.
		 * 
		 * From this test method, validate that private method return "1toto" /!\
		 * Caution this method is private
		 */
		// a private method is usually called from another public method in the class,
		// so when testing the public method, the private method will be covered by the
		// test. Here I added to the class ClassTest a new public method called
		// getConcat() that just call the private concat() method
		ClassTest classTest = new ClassTest();
		assertEquals("1toto", classTest.getConcat());
	}

	@Test // Configure project to solve this problem.
	public void streamTest() {
		List<Integer> values = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 });

		// 1- Using stream and lambda, add +1 to each value
		List<Integer> valuesIncremented = values.stream().map(v -> v + 1).collect(Collectors.toList());

		// 2- Using JUnit Verify that the result is {2,3,4,5,6}
		Assert.assertEquals(Arrays.asList(new Integer[] { 2, 3, 4, 5, 6 }), valuesIncremented);
	}

}
