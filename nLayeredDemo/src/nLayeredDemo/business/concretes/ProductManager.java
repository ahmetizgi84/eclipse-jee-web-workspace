package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	
	private ProductDao productDao;
	private LoggerService loggerService;

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		// iş kodları - kurallar
		if (product.getCategoryId() == 1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor...");
			return;
		}
		
		/**
		 * Aşağıdaki yaklaşımla program çalışır mı? çalışır. Ancak 
		 * yaklaşım doğru değildir. (Manager iş katmanını dataAccess'e sıkı sıkıya bağımlı hale getirmiş oluyoruz.)
		 * Bu şekilde kullanımda alternatif bir servisi enjekte edemeyiz. Bu durumda unit test'de yazılamaz.
		 * 
		 * Bu durumu düzeltmek için dependency injection yapılır. Bu sayede sıkı sıkıya bağımlılık durumu
		 * gevşek bir bağımlılığa çevirilir.
		 * Bu sınıftan HibernateProductDao concrete sınıfına ulaşmak yerine onun abstract interface'ine ulaşmak
		 * bu bağımlılığı gevşek hale getirir. Interface üzerinden hybernate fonskiyonlarına ulaşmış oluyoruz.
		 * 
		 * 
		 * Business katmanından database katmanına erişilmeye çalışılıyor.
		 * Oysa katmanlı mimariye göre business katmanının data access katmanına gitmesi gerekir.
		 * 
		 * | Core |
		 * | Data Access Layer | -> | Database |
		 * | Business |
		 * | API |
		 * | Ayrık Sistemler |
		 * 
		 *	HibernateProductDao dao = new HibernateProductDao();
		 *  dao.add(product);
		 * 
		 */
		
		this.productDao.add(product);
		loggerService.logToSystem("Ürün eklendi " + product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
