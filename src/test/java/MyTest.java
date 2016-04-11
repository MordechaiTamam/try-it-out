import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by modi on 11/04/16.
 */
public class MyTest {

	@Test
	public void test1(){
		Node root = new Node();
		root.add("AB");
		root.add("ABCDJK");
		root.add("ABCDJKN");
		root.add("ABCDEG");

		String[] strings=root.get("A");
		Assert.assertEquals(strings.length,2);
		for(String string:strings){
			System.out.print("\n");
			System.out.print(string);
		}
	}
}
