package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String subeButonu = "Ýnternet Þubesi";
		System.out.println(subeButonu);
		
		String[] krediler = {
				"Hýzlý Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"Çiftçi Kredisi",
				"Msb Kredisi",
				"Meb Kredisi",
				"Ýhtiyaç Kredisi",
		};
		
		// foreach döngüsü
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		
		// primitive variables - stack üzerinde tutuluyor.
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		// Complex variables - refference type - hype üzerinde tutulur
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		
		System.out.println(sayilar1[0]);
		
		// Ýstisnai durum. Burada referans tip olsa da basit deðiþkenler gibi davranýr.
		String s1 = new String("Ankara");
		String s2 = new String("Ýstanbul");
		s1 = s2;
		s2 = "Ýzmir";
		System.out.println(s1);
 
	}

}
