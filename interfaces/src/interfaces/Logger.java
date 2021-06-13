package interfaces;

// interface'ler içine şablonlarımızı yerleştiriyoruz
// Java 8 ile beraber default metotları da interface'ler içine koyabilme imkanı gelmiştir.

// Interface'ler gövdesiz metotları içerirler. Kullanıldığı yerde oraya ait özelleştirme yapılır.
// base sınıflar - ortak özellik varsa kullanılıyor. Ama çoğunlukla interface'ler kullanılıyor.

public interface Logger {
	void log(String message);
}
