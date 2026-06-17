/* Nama File    : Mahasiswa.java
 * Deskripsi   : Kelas Mahasiswa yang mewarisi kelas Civitasakademika
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class Mahasiswa extends Civitasakademika {
    /******************ATRIBUT*****************/
    String NIM;
    Dosen  Dosenwali;

    /******************KONSTRUKTOR*************/
    Mahasiswa(String NIM, String Nama) {
        super(Nama);
        this.NIM       = NIM;
        this.Dosenwali = null; // belum memiliki dosenwali
    }

    /******************METHOD******************/
    // Mengembalikan NIM sebagai nomor identitas mahasiswa
    String getNomor() {
        return NIM;
    }

    // Mengembalikan nilai NIM
    String getNIM() {
        return NIM;
    }

    // Mengubah isian komponen Dosenwali dengan parameter input Dosen
    void setWali(Dosen D) {
        Dosenwali = D;
    }

    // Menampilkan NIM, Nama Mahasiswa, dan Nama Dosenwali
    void tampilDataMahasiswa() {
        System.out.println("NIM        : " + NIM);
        System.out.println("Nama       : " + Nama);
        if (Dosenwali != null) {
            System.out.println("Dosen Wali : " + Dosenwali.getNama());
        } else {
            System.out.println("Dosen Wali : (belum ditentukan)");
        }
    }
}
