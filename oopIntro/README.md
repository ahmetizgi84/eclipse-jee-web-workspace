```java
//Primitive datatypes
boolean flag = true; 	// true ya da false değer alır. 8 bitlik yer kaplar.
char letter = 'A';  	// unicode karakterleri tutan değişken tipidir. 16 bitlik yer kaplar.
byte num1 = 5; 			// -128 ile 127 arasındaki tamsayı değerleri alan değişken tipidir. 8 bitlik yer kaplar.
short num2 = 167; 		// -32768 ile 32767 arasındaki tamsayı değerli alır. 16 bittir.
int num3 = 256500; 		// -(2^32)/2 ile ((2^32)/2)-1 arasındaki değerleri alır - 32 bittir.
long num4 = 45678900;  	// 64 bittir. -(2^64)/2 ile ((2^64)/2)-1 arasındaki değerleri alır.
float num5 = 199.33F;	// kayar noktalı sayıları tutar - 32 bittir.
double num6 = 12.5;		// kayar noktalı sayıları tutar - 64 bittir.

```


```java
package oopIntro;

/**
 * @author Ahmet İZGİ
 * Bir ürünün alabileceği tüm değişkenleri ve fonksiyonları
 * düşünüp buradaki class içinde tanımlamak kendi complex variable'ımızı oluşturduğumuz anlamına geliyor.
 */
 
public class Product {
	// encapsulation
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;

/*
	final ifadesi değişkenlere dışardan erişimi sınırlar ayrıca bu değişkenlerin getter ve setter fnları
    içinde de değiştirilmesini engeller. Bu yüzden final yerine private kullanmamız gerekir.
*/

	
	// sağ click -> source -> Generate Constructor using fields
	/*
	public Product(int id, String name, double unitPrice, String detail) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	*/

/*
	 sağ click -> source -> generate Getters and Setters
	 getter ve setter lar bir değişkenin okunabilir mi ya da yazılabilir mi sorularına cevap vermemizi sağlar.
	 class içindeki değişkenleri direk değiştirmemekte fayda var. 
     Eğer bir değişiklik yapılmak istenirse dolaylı değiştirme işlemi olan Getter ve Setter fnlarını kullanmak lazım. 
     Neden böyle kullanmamız gerektiğine bir örnek vermek gerekirse 
     örneğin bir değişkene 0 ile 10 arası bir değer atansın istiyoruz direk değişiklik ile bu kontrolü yapamayız. 
     Yazılımcı bunu bilemez ve herhangi bir değer atayabilir. 
     Ancak setter fnu içinde bir kontrol yazarak istenmeyen durumların önüne geçebiliriz.
	 Bu yüzden class içindeki değişkenleri private yapmakta fayda var. Dışardan erişilmesini önlemek için.
*/
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * this.discount / 100);
	}

	/**
	 * Yapıcı blok - constructor
	 * new anahtar kelimesi ile hype'de oluşturulan sınıf referansı oluşturulurken çalıştırılacak fonksiyondur
	 */
	public Product() {
		System.out.println("Ben Çalıştım");
	}
	
	// constructor'u tekrar kullanarak overloading yaptık.
	// hangi imzaya göre kullanım olursa o constructur çalışacaktır.
	public Product(int id, String name, double unitPrice, String detail, double discount) {
		this(); // Parametresiz constructor'ın da akıllı constructorlar içinde çalışmasını istersek 
        //parametresiz constructoru çalıştıran "this()" satırını yazmalıyız.
		// "this" anahtar kelimesi class içindeki variable'ları işaret etmek için kullanılır.
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount; 
		
	}
}
```