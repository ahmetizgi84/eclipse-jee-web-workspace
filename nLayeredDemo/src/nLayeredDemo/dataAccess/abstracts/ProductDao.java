package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	
	void update(Product product);
	
	void delete(Product product);
	
	Product get(int id);
	
	List<Product> getAll();
	/**
	 * int[] sayilar = {1,2,3,4,5};
	 * 
	 * yukarıda bir array tanımlandığı görülmektedir. Bu diziye bir değer 
	 * eklenmek istenirse bu işlem gerçekleştirilemez. Nedeni ise 
	 * değişken tanımlanırken dizinin uzunluğu belirlenmiştir yani sabittir.
	 * Bu yüzden eklem veya çıkarma gibi işlemler yapılamaz. Bunun yerine
	 * dinamik olarak ekleme ve çıkarma işlemi yapabilmemize imkan tanıyan
	 * List<> yada ArrayList<> kullanılabilir.
	 */
	
	

}


 