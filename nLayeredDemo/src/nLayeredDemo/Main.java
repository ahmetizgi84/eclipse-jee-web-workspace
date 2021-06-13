package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * Bir projede entity'ler hariç new anahtar kelimesi kullanılarak
		 * bir class referansı oluşturuluyorsa ilerde problem yaşanacağı anlamına gelir
		 * Entity haricinde bir class'ın new'lenmemesi gerekiyor.
		 */
		
		// TODO: Spring IOC ile iyileştirilecek
		// interface'ler gerçek sınıfların referanslarını tutabilir.
		ProductService productService1 = new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());
		Product product1 = new Product(1, 2, "Elma", 12, 50);
		productService1.add(product1);
		
		ProductService productService2 = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		Product product2 = new Product(1, 2, "Elma", 12, 50);
		productService2.add(product2);

	}

}
