package prob2B;

public class OrderLine {
	
String lineNumber;
double price;
int quantity;
Order order;
OrderLine(Order order){
	this.order=order;
}
OrderLine(String lineNumber, double price,int quantity,Order order){
	this(order);
	this.lineNumber= lineNumber;
	this.price= price;
	this.quantity=quantity;
}
}
