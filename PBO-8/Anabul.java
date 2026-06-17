/* Nama File    : Anabul.java
 * Deskripsi   : Kelas induk yang merepresentasikan hewan peliharaan (Anabul)
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class Anabul {
    /******************ATRIBUT*****************/
    String Nama;

    /******************KONSTRUKTOR*************/
    Anabul(String Nama) {
        this.Nama = Nama;
    }

    /******************METHOD******************/
    // Metode gerak - akan di-override oleh kelas anak
    void Gerak() {
        System.out.println(Nama + " bergerak.");
    }

    // Metode bersuara - akan di-override oleh kelas anak
    void Bersuara() {
        System.out.println(Nama + " bersuara.");
    }
}
