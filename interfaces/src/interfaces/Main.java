package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Customer ahmet = new Customer(1, "Ahmet", "izgi");
		// SmsLogger olarak tercih edildi ama bir süre sonra sms'ten vazgeçtik artık dosyaya
		// loglama yapacağız dendiğinde aşağıdaki satırı
		// new CustomerManager(new FileLogger()); 
		// ile değiştirmemiz yeterli olacaktır.
		//CustomerManager customerManager = new CustomerManager(new SmsLogger());
		
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
