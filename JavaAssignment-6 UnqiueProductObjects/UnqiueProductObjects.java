package UnqiueProductObjects;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class UnqiueProductObjects {

	public static void main(String[] args) {
		

		 

		 
		Products product1 = new Products("honeybee");
		Products product2 = new Products("reeback");
		Products product3 = new Products("fasttrack");
		
		Set<Products> unique = new TreeSet<>();
		
		unique.add(product1);
		unique.add(product2);
		unique.add(product3);
		
		unique.add(product1);
		
		  Iterator<Products> i= unique.iterator();  
	         while(i.hasNext())  
	         {  
	             System.out.println(i.next().name);  
	         }  

	}

}

class Products implements Comparable<Products>{
	
	String name;

	public Products(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Products o) {
		  
		if (name.compareTo(o.name)>0) {
            return 1;
        }
        else if (name.compareTo(o.name)<0) {
            return -1;
        }
        else {
            return 0;
        } 
	}	
		

}


