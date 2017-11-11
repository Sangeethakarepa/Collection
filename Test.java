import java.util.ArrayList;
import java.util.Iterator;

public class Test {
public static void main(String args[]){
ArrayList<String> al=new ArrayList<String>();
al.add("sangi");
al.add("sangeetha");
al.add("NIIT");
ArrayList<String>al2=new ArrayList<String>();
al2.add("Princes");
al2.add("angel");
//al.addAll(al2);
al.removeAll(al2);
 Iterator itr=al.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
}
/*for(String obj:al){
	System.out.println(obj);
}*/
}
}
