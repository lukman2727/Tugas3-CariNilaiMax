class Cari NilaiMax {
	public static void main (String[] args) {
		int angka1 = 82;
		int angka2 = 32;
		int angka3 = 70;

		int max = 0;

		max = angka1 >= max ? angka1 : max;
		max = angka2 >= max ? angka2 : max;
		max = angka3 >= max ? angka3 : max;

		System.out.println("Angka terbesar adalah "+max);
	}
   }
