import java.util.LinkedList;
import java.util.List;

/**
 * Created by modi on 10/04/16.
 */
public class Node {
	public static final int LETTERS_COUNT = 52;
	char chare;
	Node arr[] = new Node[LETTERS_COUNT];

	public void add(String strToadd) {
		char charAt = strToadd.charAt(0);
		Node n = getNode(charAt);
		if (strToadd.length() > 1) {
			n.add(strToadd.substring(1));
		}
	}

	public String[] get(String string) {
		List<String> strings = new LinkedList<String>();
		if (string.length() > 0) {
			char firstChar = string.charAt(0);
			Node node = getNode(firstChar);
			String[] retVal = node.get(string.substring(1));
			for (String str : retVal) {
				String concat;
				if (Character.isLetter(this.chare)) {
					concat = Character.toString(this.chare).concat(str);
				} else {
					concat = str;
				}
				strings.add(concat);
			}
		} else {
			String[] strings2 = new String[0];
			for (int i = 0; i < LETTERS_COUNT; i++) {
				Node node1 = arr[i];
				if (node1 != null) {
					System.out.print("\n Found non null node:" + node1);
					strings2 = node1.get("");
					if (strings2.length > 0) {
						for (String str : strings2) {
							strings.add(Character.toString(chare) + str);
						}
					}
				}
			}

			if (strings2.length < 1) {
				strings.add(Character.toString(chare));
			}
		}
		String[] retVal = strings.toArray(new String[strings.size()]);
		System.out.println("\nstring: " + string);
		printArr(retVal);
		return retVal;
	}

	private void printArr(String[] retVal) {
		for (String str : retVal) {
			System.out.println("returning: " + str);
		}
	}

	private Node getNode(char charAt) {
		System.out.println("\nGetting node for: " + Character.toString(charAt));
		int index = getIndex(charAt);
		Node node = this.arr[index];
		if (node == null) {
			node = new Node();
			node.chare = charAt;
			this.arr[index] = node;
		}
		return node;
	}

	private int getIndex(int charAt) {
		int ascii = charAt;
		return ascii - 65;
	}
}
