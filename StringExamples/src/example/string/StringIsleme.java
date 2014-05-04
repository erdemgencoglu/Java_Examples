package example.string;

public class StringIsleme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String cumle = "Hangi takımı tutuyorsun? " + "Cimbom(!) " +
				"Allah başka dert vermesin :("
				+ "Bir gün herkes Fenerbahçeli olmasın; "
				+ "Bırakın da o ŞEREF bizde kalsın... ";
		String cumle2 ="Yoksa sizde Çekoslovakyalılaştıramadıklarımızdan mısınız?";
		System.out.println("Birinci cümlede ki en uzun kelimedeki harf sayısı : " + uzunluk(cumle));
		System.out.println("İkinci cümlede ki en uzun kelimedeki harf sayısı : " + uzunluk(cumle2));

	}

	public static int uzunluk(String cümle) {
		int max;
		String[] kelimeler = cümle.replaceAll("\\p{P}", "").split("\\s");
		max = kelimeler[0].length();
		for (int i = 1; i < kelimeler.length; i++) {
			if (kelimeler[i].length() > max) {
				max = kelimeler[i].length();
			}
		}
		return max;
	}
}
