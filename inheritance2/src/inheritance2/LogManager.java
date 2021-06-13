package inheritance2;

public class LogManager {
	
	// Aşağıdaki mantık handikaplıdır.
	// Spagetti :)
	// yönetim geldi dediki bundan sonra veritabanına loglama yok. Kaldırıyoruz dedi
	// bu durumda daha doğru bir yaklaşım sergilenmemiş olur
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
