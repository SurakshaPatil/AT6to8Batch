package Constructors;

public class Book {

	String title;
	String author;
	int price;
	
	Book(String t,String a,int p){
	title=t;
	author=a;
	price=p;
	}
	
	public void displayDetails() {
		System.out.println("Book title is: "+title);
		System.out.println("Book Author name is: "+author);
		System.out.println("Book price is : "+price);	
	}
	
	public static void main(String[] args) {
		Book b1=new Book("Alchemist","P. Coelho",350);
		b1.displayDetails();
	}

}
