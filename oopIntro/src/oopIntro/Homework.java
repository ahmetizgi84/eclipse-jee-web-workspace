package oopIntro;

public class Homework {

	public static void main(String[] args) {
		// 1
		System.out.println("Hello Java :)");
		
		// 2
		int numberOfStudents = 19;
		String messageBody = "Öğrenci sayısı";
		System.out.println(messageBody + numberOfStudents);
		
		// 3 - Primitive datatypes
		boolean flag = true; 	// true ya da false değer alır. 8 bitlik yer kaplar.
		char letter = 'A';  	// unicode karakterleri tutan değişken tipidir. 16 bitlik yer kaplar.
		byte num1 = 5; 			// -128 ile 127 arasındaki tamsayı değerleri alan değişken tipidir. 8 bitlik yer kaplar.
		short num2 = 167; 		// -32768 ile 32767 arasındaki tamsayı değerli alır. 16 bittir.
		int num3 = 256500; 		// -(2^32)/2 ile ((2^32)/2)-1 arasındaki değerleri alır - 32 bittir.
		long num4 = 45678900;  	// 64 bittir. -(2^64)/2 ile ((2^64)/2)-1 arasındaki değerleri alır.
		float num5 = 199.33F;	// kayar noktalı sayıları tutar - 32 bittir.
		double num6 = 12.5;		// kayar noktalı sayıları tutar - 64 bittir.
		
		// 4 if, if-else, if-else if-else
		// 5 switch case
		// 6 for loop, foreach
		for (int i = 0; i < args.length; i++) {
			
		}
		
		for (String string : args) {
			
		}
		
		// 7-8 while döngüsü - do while döngüsü
		// 9 Diziler
		int[] numbers = {1,2,3,4,5};
		String[][] cities = new String[3][4];
	}

}
