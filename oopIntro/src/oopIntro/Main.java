package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Lenovo V14");
		product1.setDetail("16 GB Ram, FHD Ekran, 128 SSD");
		product1.setUnitPrice(15280);
		product1.setDiscount(10);
		
		System.out.println(product1.getUnitPriceAfterDiscount());
		
		// Yapıcı blok kullarak product1.id = 1 şeklinde atama yapmamıza gerek kalmaz
		/*
		Product product1 = new Product();
		product1.id = 1;
		product1.name = "Lenovo V14";
		product1.unitPrice = 15000;
		product1.detail = "16 GB Ram, FHD Ekran, 128 SSD";
		*/
		
		//Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB Ram, FHD Ekran, 128 SSD", 10, 13500);

		
		//Product product4 = new Product();

		
		/*
		Category category1 = new Category();
		category1.id= 1;
		category1.name = "Bilgisayar";
		
		Category category2 = new Category();
		category2.id= 2;
		category2.name = "Ev Bahçe";
		
		
		Product[] products = {product1, product2, product3};		
		for (Product product : products) {
			System.out.println(product.name);
		}
		
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product3);
		*/
	
		
		
	}

}
