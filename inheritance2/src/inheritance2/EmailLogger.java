package inheritance2;

public class EmailLogger extends Logger {
	// Metot Override etmek Logger içindeki log fnu override ediliyor.
	@Override
	public void log() {
			System.out.println("Email yollandı");
	}
}


