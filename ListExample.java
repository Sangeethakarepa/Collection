import java.util.ArrayList;

public class ListExample {
public static void main(String args[]){
	ArrayList<String>li=new ArrayList<String>();
	li.add("Apple");
	li.add("Banana");
	li.add("Mango");
	li.add(1,"grapes");
	System.out.println("Element at second position:"+li.get(2));
for(String obj:li){
	System.out.println(obj);
}
}

}
