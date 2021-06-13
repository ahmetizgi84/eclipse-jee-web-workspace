```java
package inheritance2;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(new DatabaseLogger());
		
		//customerManager.add(new FileLogger());
		
		customerManager.add(new EmailLogger());
	}
}
```

```java
package inheritance2;

public class CustomerManager {
	// add metotu Logger tipinde bir referans alıyor.
	// DatabaseLogger, EmailLogger ve de FileLogger Logger sınıfından extend edildikleri için
	// o sınıfların referanslarını tutabiliyor. Yani metota gönderilen parametre her üç Logger referanslarından
	// biri olabilir. 
	
	public void add(Logger logger) {
		System.out.println("Müşteri eklendi");
		logger.log();
	}
}
```

```java
package inheritance2;

// Logger.java
//		FileLogger.java
//		DatabaseLogger.java
// 		EmailLogger.java

public class Logger {
	public void log() {
		System.out.println("Ortak konfigürasyon");
	}
}
```

```java
package inheritance2;

public class EmailLogger extends Logger {
	// Metot Override etmek Logger içindeki log fnu override ediliyor.
	@Override
	public void log() {
			System.out.println("Email yollandı");
	}
}
```

```java
package inheritance2;

// SmsLogger sınıfını Logger sınıfından türettik 
// dolayısıyla SmsLogger sınıfı Logger sınıfı içerisindeki
// log() fonksiyonunu miras aldı. Fakat burada bu fonksiyonu 
// override etmezsek Logger içinde nasıl tanımlandıysa o şekilde çalışacaktır

// Javada bir sınıf sadece 1 adet sınıfı extend edebilirken, birden fazla interface'i implement edebilir.

public class SmsLogger extends Logger {

}
```

```java
package inheritance2;

public class LogManager {
	
	// Aşağıdaki mantık handikaplıdır.
	// Spagetti :)
	// yönetim geldi dediki bundan sonra veritabanına loglama yok. Kaldırıyoruz dedi
	// bu durumda doğru bir yaklaşım sergilenmemiş olur
	// Birbirinin alternatifi olan kod bloklarını if ile yönetilmez.
	// İleride kontrolü çok zorlaşır.
	// Doğru yaklaşım Logger.java da gösterildi
	
	public void log(int logType) {
		if(logType == 1) {
			System.out.println("Veritabanına loglandı");
		}else if(logType == 2) {
			System.out.println("Dosyaya loglandı");
		}else {
			System.out.println("Emaile loglandı");
		}
	}
}
```