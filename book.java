
class Book1{
	
	String tittleOfBook="";
	String authorOfBook="";
	String publisherOfBook="";
	String numberISBNOfBook="";
	int year;
	double price;
	int quantity;
	
	Book1(String tittleOfBook,String authorOfBook,String publisherOfBook,String numberISBNOfBook,int year,double price,int quantity){
		
		this.tittleOfBook=tittleOfBook;
		this.authorOfBook=authorOfBook;
		this.publisherOfBook=publisherOfBook;
		this.numberISBNOfBook=numberISBNOfBook;
		this.year=year;
		this.price=price;
		this.quantity=quantity;
	}
	public String getTittleOfBook() {
		return tittleOfBook;
	}
	public void setTittleOfBook(String tittleOfBook) {
		this.tittleOfBook = tittleOfBook;
	}
	public String getAuthorOfBook() {
		return authorOfBook;
	}
	public void setAuthorOfBook(String authorOfBook) {
		this.authorOfBook = authorOfBook;
	}
	public String getPublisherOfBook() {
		return publisherOfBook;
	}
	public void setPublisherOfBook(String publisherOfBook) {
		this.publisherOfBook = publisherOfBook;
	}
	public String getNumberISBNOfBook() {
		return numberISBNOfBook;
	}
	public void setNumberISBNOfBook(String numberISBNOfBook) {
		this.numberISBNOfBook = numberISBNOfBook;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	double increaseQuantity(int quantity){
		
		int r= quantity+2;
		
		double result2= price * r;
		
		return result2;
	}
   double decreaseQuantity(int quantity){
		
		int r1= quantity-4;
		
		double result1= price * r1;
		
		return result1;
	
   
   }
   double getInventoryValue(){
	   
	   double result= price * quantity;
	   
	   return result;
   }
   
	
}


public class book {

	public static void main(String[] args) {
		
	Book1 b1= new Book1("life","vaibhav","pratap","1234",1995,125,10);
   
	
	
	System.out.println("total value of inventory book====>"+ b1.getInventoryValue());
	System.out.println("toatl inventory after increasing quantity==>"+b1.increaseQuantity(15));
	System.out.println("toatl inventory after deacreasing quantity==>"+b1.decreaseQuantity(10));
	}

}
