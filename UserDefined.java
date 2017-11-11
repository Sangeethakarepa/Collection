import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int Rollno,id;
	String name;
	Student(int Rollno, int id, String name){
		this.Rollno=Rollno;
		this.id=id;
		this.name=name;
	}
}
public class UserDefined {

	public static void main(String[] args) {
		Student s1=new Student(123,1,"sangi");
		Student s2=new Student(456,2,"sangeetha");
	ArrayList<Student> al=new ArrayList<Student>();	
al.add(s1);
al.add(s2);
Iterator itr=al.iterator();
while(itr.hasNext()){
	Student st=(Student) itr.next();
	System.out.println(st.Rollno+" "+st.id+" "+st.name);
}
	}

}
