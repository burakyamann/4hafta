package hafta5;

public class metotlarýnasiriyüklenmesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sayi1 = 3;
		int sayi2 = 4;
		int sayi3 = 5;
		String sayi4 = "6";
		String sayi5 = "7";
		
		int toplamaParametreliiki = topla(sayi1,sayi2);
		int toplamaParametreliuc = topla(sayi1,sayi2,sayi3);
		int toplamaStringParametreli = topla(sayi4,sayi5);
		
		System.out.println(toplamaParametreliiki);
		System.out.println(toplamaParametreliuc);
 		

	}
	
	static int topla(int sayi1, int sayi2) {
		int sonuc;
		sonuc =sayi1 +sayi2;
		return sonuc;
	}
	
	static int topla(int sayi1, int sayi2, int sayi3) {
		int sonuc;
		sonuc =sayi1 +sayi2+sayi3;
		return sonuc;
	}
	
	static int topla(String sayi1, String sayi2) {
		int sonuc;
		sonuc = Integer.parseInt(sayi1) + Integer.parseInt(sayi2);
		return sonuc;
	}
}
