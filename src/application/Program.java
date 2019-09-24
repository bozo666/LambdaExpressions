package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 1000.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 90.00));
		list.add(new Product("Tablet", 350.00));
		
		
		System.out.print("Digite o valor maximo desejado: ");
		int n = in.nextInt();
		
		list.removeIf(p -> p.getPrice() >= n);
		
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
	
	
	
}
