package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String subeButonu = "�nternet �ubesi";
		System.out.println(subeButonu);
		
		String[] krediler = {
				"H�zl� Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"�ift�i Kredisi",
				"Msb Kredisi",
				"Meb Kredisi",
				"�htiya� Kredisi",
		};
		
		// foreach d�ng�s�
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		
		// primitive variables - stack �zerinde tutuluyor.
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		// Complex variables - refference type - hype �zerinde tutulur
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		
		System.out.println(sayilar1[0]);
		
		// �stisnai durum. Burada referans tip olsa da basit de�i�kenler gibi davran�r.
		String s1 = new String("Ankara");
		String s2 = new String("�stanbul");
		s1 = s2;
		s2 = "�zmir";
		System.out.println(s1);
 
	}

}
