```java
public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName) {
		//super(); // Customer sınıfı bir başka sınıfı extend ediyorsa o sınıfın parametresiz constructor'ını çağırır
		// eğer herhangi bir sınıfı extend etmiyorsa super() metodunu kullanmaya gerek yok
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
```

```java
package interfaces;

public class CustomerManager {
	
	/*
	 Bağımlısı olduğumuz şeyin değişkenini oluşturuyoruz.

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

```

```java
package interfaces;

// interface'ler içine şablonlarımızı yerleştiriyoruz
// Java 8 ile beraber default metotları da interface'ler içine koyabilme imkanı gelmiştir.

// Interface'ler gövdesiz metotları içerirler. Kullanıldığı yerde oraya ait özelleştirme yapılır.
// base sınıflar - ortak özellik varsa kullanılıyor. Ama çoğunlukla interface'ler kullanılıyor.

public interface Logger {
	void log(String message);
}
```

```java
package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Customer ahmet = new Customer(1, "Ahmet", "izgi");
		// SmsLogger olarak tercih edildi ama bir süre sonra sms'ten vazgeçtik artık dosyaya
		// loglama yapacağız dendiğinde aşağıdaki satırı
		// new CustomerManager(new FileLogger()); 
		// ile değiştirmemiz yeterli olacaktır.
		// CustomerManager customerManager = new CustomerManager(new SmsLogger());
		
		Logger[] loggers = {new EmailLogger(), new FileLogger(), new SmsLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		
		// Daha önce varolmayan bir loglama yöntemi sonradan projeye dahil edilmek istenirse
		// artık varolan kodlarda değişiklik yapmaya gerek kalmayacak. Sadece eklenmek istenen örneğin EmailLogger olsun 
		// yöntemin class'ı oluşturulacak bu class Logger class'ını implement edecek ve içeride bir override yapılarak 
		// email loglamayla ilgili kodlar yazılması yeterli olacaktır.
		// artık yukarda new CustomerManager(new EmailLogger()); satırını yazmamız yeterli olacaktır.
		
		customerManager.add(ahmet);

	}

}
```