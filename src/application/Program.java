package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		List<Product> list = new ArrayList<Product>();
		 list.add(new Product("Tv", 900.00));
		 list.add(new Product("Mouse", 50.00));
		 list.add(new Product("Tablet", 350.50));
		 list.add(new Product("HD Case", 80.90));
		
		 /* Pode-se utilizar uma variável para informar o valor */
		 double min = 100.0;
		
		 /* Expressao lambda declarada */
		Predicate<Product> prod = p -> p.getPrice() >= min; 
		
		list.removeIf(prod);
		
		for(Product p : list) {
			System.out.println(p);
		}
		 
		 
	}

}
