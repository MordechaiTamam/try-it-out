/**
 * Created by modi on 10/04/16.
 */
public class Main {

	public static void main(String[] args){
		Node root = new Node();
		root.add("AB");
		root.add("ABCDJK");
		root.add("ABCDJKN");
		root.add("ABCDEG");

		String[] strings=root.get("A");
		for(String string:strings){
			System.out.print("\n");
			System.out.print(string);
		}
	}
}
