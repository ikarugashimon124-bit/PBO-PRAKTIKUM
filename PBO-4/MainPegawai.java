public class MainPegawai {

    public static void main(String[] args) {

        DosenTetap dt1 = new DosenTetap();
        dt1.setNip("9545647548");
        dt1.setNidn("78647324");
        dt1.setNama("Andi");
        dt1.setTanggalLahirHari(5);
        dt1.setTanggalLahirBulan(5);
        dt1.setTanggalLahirTahun(1990);
        dt1.setTmtHari(1);
        dt1.setTmtBulan(1);
        dt1.setTmtTahun(2015);
        dt1.setGajiPokok(5000000);
        dt1.setFakultas("Fakultas Sains dan Matematika");

        System.out.println("Dosen Tetap");
        dt1.printInfo();

        DosenTetap dt2 = new DosenTetap("1122334455", "99887766", "Budi", 10, 3, 1985, 1, 8, 2010, 6000000, "Fakultas Teknik");

        System.out.println("\nDosen Tetap 2");
        dt2.printInfo();

        DosenTamu dta1 = new DosenTamu();
        dta1.setNip("6677889900");
        dta1.setNidk("55443322");
        dta1.setNama("Citra");
        dta1.setTanggalLahirHari(20);
        dta1.setTanggalLahirBulan(7);
        dta1.setTanggalLahirTahun(1992);
        dta1.setTmtHari(1);
        dta1.setTmtBulan(3);
        dta1.setTmtTahun(2023);
        dta1.setGajiPokok(4000000);
        dta1.setFakultas("Fakultas Ilmu Sosial");
        dta1.setBerakhirKontrakHari(31);
        dta1.setBerakhirKontrakBulan(12);
        dta1.setBerakhirKontrakTahun(2027);

        System.out.println("\nDosen Tamu");
        dta1.printInfo();

        DosenTamu dta2 = new DosenTamu("7788990011", "11223344", "Dewi", 15, 9, 1988, 1, 6, 2024, 4500000, "Fakultas Ekonomi", 30, 6, 2026);

        System.out.println("\nDosen Tamu 2");
        dta2.printInfo();

        Tendik t1 = new Tendik();
        t1.setNip("3344556677");
        t1.setNama("Eko");
        t1.setTanggalLahirHari(12);
        t1.setTanggalLahirBulan(4);
        t1.setTanggalLahirTahun(1980);
        t1.setTmtHari(1);
        t1.setTmtBulan(7);
        t1.setTmtTahun(2005);
        t1.setGajiPokok(3500000);
        t1.setBidang("Akademik");

        System.out.println("\nTenaga Kependidikan");
        t1.printInfo();

        Tendik t2 = new Tendik("8899001122", "Fitri", 25, 11, 1990, 1, 1, 2018, 3000000, "Kemahasiswaan");

        System.out.println("\nTenaga Kependidikan 2");
        t2.printInfo();

        Tendik t3 = new Tendik("9900112233", "Galih", 8, 6, 1985, 1, 4, 2012, 3200000, "Sumber Daya");

        System.out.println("\nTenaga Kependidikan 3");
        t3.printInfo();
    }
}
