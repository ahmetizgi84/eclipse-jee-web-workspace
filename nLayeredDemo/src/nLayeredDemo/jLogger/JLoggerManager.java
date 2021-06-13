package nLayeredDemo.jLogger;

/**
 * 
 * @author Ahmet İZGİ
 * 
 * Projemize bir başkasının yazdığı bir paketi eklemek istiyoruz.
 * Bu paketin adı JLogger olsun. İçeriğindeki kodlara dokunmadan bu paketi kullanmak istiyoruz.
 * Nasıl kullanırız?
 * 
 * Akla gelebilecek ihtimaller
 * 1. public class JLoggerManager implements JloggerService -> kişi projesinde bir interface kullanmışsa
 * ben de bu interface'i kendi projeme dependency injection yöntemiyle enjekte ederim kulanırım gibi bir mantık akla gelebilir.
 * Ancak bu yöntem projemizi bu kişinin yazdığı projeye tamamen bağımlı kılar. Bu kişi ilerde projesini değiştirdiği anda
 * biz de kodlarımızı değiştirmek zorunda kalacağız. Dolayısıyla interface'i enjekte etmek doğru bir yöntem olmaz
 * Zaten aşağıdaki örnekte de kişinin projesinde interface kullanmadığını görmekteyiz. 
 *
 *	Loglama asyrıca her projede kullanılabileceği için core paketinin içinde olması gerekir.
 *
 * 2. Başka paketlere bağımlı olmadan bu paketin kullanacağı bir service interface'i biz yazabiliriz. Ancak başka bir projeye
 * kendi iterface'imizi implemente edemeyiz. Burada devreye adaptasyon giriyor. Başkasının yazdığı servisleri sisteme
 * adapte etmek. "JLoggerManagerAdapter" bir sınıfın adının sonunda Adapter kelimesi varsa o sınıfın adaptasyon sınıfı olduğu 
 * anlamına gelir.
 */

public class JLoggerManager {
	public void log(String message) {
		System.out.println("J Logger ile loglandı " + message);
	}
}



