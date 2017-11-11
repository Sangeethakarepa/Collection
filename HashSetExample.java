import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
	HashSet<String> set=new HashSet<String>();
	set.add("Book");
	set.add("Laptop");
	set.add("System");
	set.add("Book");
	Iterator<String> itr=set.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}

	}

}
