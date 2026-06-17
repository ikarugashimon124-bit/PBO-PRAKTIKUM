/* Nama File    : MSeminar.java
 * Deskripsi   : Program utama untuk menguji kelas Seminar (Polimorfisme Universal Inclusion)
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class MSeminar {
    public static void main(String[] args) {

        Dosen D1 = new Dosen("1975010120050", "Dr. Ahmad");
        Dosen D2 = new Dosen("1980031520070", "Dr. Retno");

        Mahasiswa M1 = new Mahasiswa("2406012314011", "Mia Susila");
        Mahasiswa M2 = new Mahasiswa("2406012314012", "Budi Santoso");
        Mahasiswa M3 = new Mahasiswa("2406012314013", "Siti Rahayu");
        Mahasiswa M4 = new Mahasiswa("2406012314014", "Andi Wijaya");
        Mahasiswa M5 = new Mahasiswa("2406012314015", "Dewi Kusuma");

        M1.setWali(D1);
        M2.setWali(D1);
        M3.setWali(D2);
        M4.setWali(D2);
        M5.setWali(D1);

        Seminar seminar = new Seminar();

        seminar.registrasi(D1);
        seminar.registrasi(D2);
        seminar.registrasi(M1);
        seminar.registrasi(M2);
        seminar.registrasi(M3);
        seminar.registrasi(M4);
        seminar.registrasi(M5);

        System.out.println("4c. Jumlah Peserta Seminar");
        System.out.println("Banyak peserta: " + seminar.countPeserta());

        System.out.println("\n4g. Daftar Peserta Seminar");
        seminar.tampilPeserta();

        System.out.println("\n4h. Jumlah Peserta Mahasiswa");
        System.out.println("Banyak mahasiswa: " + seminar.countMahasiswa());

        System.out.println("\n4j. Data Lengkap Mahasiswa");
        M1.tampilDataMahasiswa();
        System.out.println();
        M2.tampilDataMahasiswa();
        System.out.println();
        M3.tampilDataMahasiswa();
        System.out.println();
        M4.tampilDataMahasiswa();
        System.out.println();
        M5.tampilDataMahasiswa();
    }
}