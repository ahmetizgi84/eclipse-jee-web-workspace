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




