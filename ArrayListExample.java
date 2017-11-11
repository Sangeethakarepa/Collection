import java.util.ArrayList;

class Book{
	int id;
	String Author;
	String name;
	Book(int id, String Author, String name){
		this.id=id;
		this.Author=Author;
		this.name=name;
	}
}
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Book> al=new ArrayList<Book>();
		Book b1=new Book(1,"Love your wife","Ajay Pandey K");
	    Book b2=new Book(2,"Forouzan","Mc Graw Hill");  
	    Book b3=new Book(3,"Operating System","Wiley");  
		
al.add(b1);
al.add(b2);
al.add(b3);
for(Book b:al){
	System.out.println(b.id+" "+b.Author+" "+b.name);
}
	}

}
