package Orders;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;


class Order{
	String status;
	float price;
	public Order( String status, float price) {
		super();
		this.status=status;
		this.price=price;
	}
}

public class Orders {

	public static void main(String[] args) {
		List<Order> list =new ArrayList<Order>();
		list.add(new Order("orders status is ::Accepted",15000f));
		list.add(new Order("orders status is ::Completed",60000f));
		list.add(new Order("orders status is ::Accepted",35000f));
		list.add(new Order("orders status is ::processing",75000f));
		list.add(new Order("orders status is ::Accepted",45000f));
		list.add(new Order("orders status is ::Completed",55000f));
		
		
		Stream<Order> filtered_data=list.stream().filter(p->p.price>10000 && p.status.startsWith("order status is::Accepted") || p.status.startsWith());
		
		filtered_data.forEach(Order-> System.out.println("order price is"+Order.price+" &"+Order.status));
		

	}

}
