package com.Xworkz.Learning.exception.uncheckedException;

public class Dmart {
	Product[] products= {new Product("soap",10.00),
			             new Product("paste",5.00),
			             new Product("brush",10.00),
			             new Product("facewash",20.00),
			             new Product("shampoo",2.00)};
	
	void search(Product product) {
		boolean isProductAvailable=false;
		
		for(int i=0; i<products.length; i++) {
			if(products[i].equals(product)) {
				isProductAvailable=true;
			}
		}
		if(isProductAvailable) {
			System.out.println("Product found.");
		}
		else {
			throw new DmartException();
		}
	}

}
