package prob2B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
 String orderNumber;
 LocalDate orderDate;
 List<OrderLine> orderLines= new ArrayList();
 Order(String orderNumber, LocalDate date){
	 OrderLine firsOrderLine= new OrderLine(this);
	 orderLines.add(firsOrderLine);
	 this.orderNumber=orderNumber;
	 this.orderDate=orderDate;
 }
 public void addOrder(OrderLine orderLine) {
	 orderLines.add(orderLine);
 }
 public List<OrderLine> getOrderLines() {
	 return orderLines;
 }
}
