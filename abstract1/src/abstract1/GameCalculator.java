package abstract1;

public abstract class GameCalculator {
	/*
	public void hesapla() {
		System.out.println("Hesaplanan puan: 100");
	}
	*/
	
	/**
	 * Şu durumda hesapla() fonksiyonu GameCalculator sınıfını implement eden class'lar tarafından 
	 * override edilmek suretiyle kullanılabilir ve bu kullanım zorunlu değildir. 
	 * Öyle bir senaryo düşünün ki bu fonksiyon alt sınıflar tarafından kullanılmak ve override edilmek zorunda
	 * olsun. İşte o zaman "abstract" class'lardan bahsedebiliriz. Abstrack sınıflar
	 * public abstract class GameCalculator { şeklinde oluşturulurlar. metotların alt sınıflar tarafından 
	 * kullanılmak zorunda olmasını sağlamak için ise tanımlamayı 
	 * public abstract void hesapla(); şeklinde yapmalıyız. Şayet alt sınıflarda override edilmek için kullanılmamışsa
	 * kullanmamız gerektiği yönünde hata verecektir.
	 */
	
	public abstract void hesapla();

	
	/**
	 * final ifadesini kullandığım zaman bu class'ı implement eden alt class'lar
	 * bu fonksiyonu override edemezler. Eğer fonksiyonun üzerinde herhangi bir değişiklik
	 * yapılmadan, burada tanımlandığı gibi kullanılmasını istersek o zaman final anahtar kelimesini kullanırız.
	 * 
	 */
	public final void gameOver() {
		System.out.println("Oyun sona erdi.");
	}
}
