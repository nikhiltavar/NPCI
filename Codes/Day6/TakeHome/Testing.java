package Day6.TakeHome;

abstract class Book{
	
	String title;
	
	abstract String getTitle();
	abstract void setTitle(String title);
}

class MyBook extends Book{
	
	@Override
	String getTitle(){
		return super.title;
	}
	
	@Override
	void setTitle(String title){
		super.title = title;
	}
}


public class Testing {
	
	public static void main(String[] args) {
		Book book = new MyBook();
		book.setTitle("A tale of two cities");
		
		System.out.println("The title of my book is: " + book.getTitle());
	}
	
}
