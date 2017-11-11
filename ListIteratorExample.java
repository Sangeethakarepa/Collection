import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("pen");
		al.add("pencil");
		al.add("Eraser");
		al.add(1, "sharpner");
		System.out.println("After the second element:" + al.get(2));

		ListIterator<String> itr = al.listIterator();
		System.out.println("This traverse is Forward Direction:");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("This is backwaard Direction:");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
