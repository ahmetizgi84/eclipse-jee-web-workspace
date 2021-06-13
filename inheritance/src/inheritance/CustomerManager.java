package inheritance;

public class CustomerManager {
	
	/*
	
	// Overloading metotlarda metot isimleri aynıdır. 
	// burada ilk başta aynı isimde metotların olamayacağı akla gelebilir.
	// Ancak overloading metotlar için bu kural geçerli değildir. Nedeni ise
	// her iki fonksiyonun farklı tipte parametre alıyor olmasıdır.
	// metotların kullanıldığı yerde metota geçilen parametre hangi referans tipindeyse
	// burdaki ilgili metot çalışır.
	// Burada her iki müşteri için ayrı ayrı add metotu yazılmak durumunda kalındı.
	// bunun önüne geçmek için inheritance'ın sağladığı faydaları kullanmak gerekir.
	
	public void add(IndividualCustomer customer) {
		System.out.println("Bireysel Müşteri kaydedildi.");
	}
	
	public void add(CorporateCustomer customer) {
		System.out.println("Kurumsal Müşteri kaydedildi.");
	}
	*/
	
	// IndividualCustomer ve CorporateCustomer sınıfları Customer sınıflarından extend edildikleri
	// için her iki sınıf da birer Customer sınıfıdır. Bununla birlikte her iki sınıf hem kendi özelliklerini
	// hem de Customer sınıfının özelliklerini barındırırlar.
	// Polymorphism ile üst sınıf onu extend eden sınıfların referanslarını tutabilir.?
	// customer referansından IndividualCustomer veya CorporateCustomer sınıflara ait değişkenlere ulaşılamadığına 
	// dikkat et! Unboxing yöntemi_?
	
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi...");
	}
	
	
	// Bulk insert
	
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}
	
	
}
