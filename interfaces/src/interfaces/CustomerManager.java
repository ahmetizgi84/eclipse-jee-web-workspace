package interfaces;

public class CustomerManager {
	
	/*
	 Bağımlısı olduğumuz şeyin değişkenini oluşturuyoruz.
	 */
	/*
	private Logger logger;
	
	public CustomerManager(Logger logger) {
		this.logger = logger;
	}
	*/
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müşteri eklendi " + customer.getFirstName());
		
		/*
		Aşağıdaki iki satır doğru bir yaklaşım değil. ilerleyen bir zamanda
		veritabanına loglamaktan vazgeçtik. Artık dosyaya loglayacağız dendiğinde
		aşağıdaki satırlar nerelerde kullanılıyorsa hepsinin değişmesi gerekir.
		Zaten burası "simple is best" yaklaşımına uymuyor. Nedeni ise CustomerManager classında
		sadece müşteriyi ilgilendiren işler yapılır ama aşağıdaki iki satırla müşteri ile alakası olmayan
		loglama işlemi yapılıyor.
		
		// tightly coupled
		DatabaseLogger dbLogger = new DatabaseLogger();
		dbLogger.log(customer.getFirstName() + " veri tabanına loglandı...");
		
		CustomerManager loglamaya bağımlıdır. Buna bağımlılık adı verilir. 2 tip bağımlılık vardır.
		loosly coupled - tightly coupled
		yukarıdaki loglama customerManager'a sıkı bir şekilde bağlıdır. Bu bağımlılığı loosly'ye çevirmemiz gerekir.
		bunun için de yukarıda kullanılan 2 satır yerine en yukardaki yöntem uygulanır.
		Buna ise dependency injection tasarım deseni adı verilir.
		*/
		
		//this.logger.log(customer.getFirstName());
		/*
		for (Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}
		*/
		// Utils sınıfı içerisinde metot static olunca
		// Utils. notasyonu ile metota ulaşabiliriz.
		// static metotlar kullan at değil bellekte sürekli yer tutar
		// bu yüzden heryerde kullanımaz. Neredeyse her işlem sonu 
		// çağrılmak istenen fonksiyonlar static olabilir.
		Utils.runLoggers(loggers, customer.getFirstName());

	}
	
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi... " + customer.getFirstName());
		/*
		for (Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}
		*/
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}
