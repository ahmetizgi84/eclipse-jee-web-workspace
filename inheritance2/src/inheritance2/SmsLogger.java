package inheritance2;

// SmsLogger sınıfını Logger sınıfından türettik 
// dolayısıyla SmsLogger sınıfı Logger sınıfı içerisindeki
// log() fonksiyonunu miras aldı. Fakat burada bu fonksiyonu 
// override etmezsek Logger içinde nasıl tanımlandıysa o şekilde çalışacaktır


// Javada bir sınıf sadece 1 adet sınıfı extend edebilirken, birden fazla interface'i implement edebilir.

public class SmsLogger extends Logger {

}
