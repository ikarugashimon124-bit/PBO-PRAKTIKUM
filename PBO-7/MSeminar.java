/* Nama File    : MSeminar.java
 * Deskripsi   : Program utama untuk menguji kelas Seminar
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class MSeminar {
    public static void main(String[] args) {

        Seminar seminar = new Seminar();

        Mahasiswa m1 = new Mahasiswa("1001", "Budi Santoso", "Informatika");
        Mahasiswa m2 = new Mahasiswa(1002, "Siti Rahayu", "Teknik Komputer");

        Dosen d1 = new Dosen("2001", "Dr. Andi Wijaya");
        Dosen d2 = new Dosen("2002", "Prof. Rini Susanti");

        // Registrasi peserta ke seminar
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(d1);
        seminar.registrasi(d2);

        System.out.println("Total peserta seminar: " + seminar.countPeserta());
        System.out.println("Jumlah mahasiswa dalam seminar: " + seminar.countMahasiswa());
        System.out.println();
        seminar.tampilPeserta();
    }
}
