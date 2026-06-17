/* Nama File: Anabul.java
 * Deskripsi: Kelas induk Anabul
 * Pembuat: Mutiara Ayu Pramono - 24060123140131
 * Tanggal: 17 Juni 2026
 */

public class Anabul {
    /******************ATRIBUT*****************/
    String Nama;
    String panggilan;

    /******************KONSTRUKTOR*************/
    Anabul(String Nama) {
        this.Nama      = Nama;
        this.panggilan = Nama;
    }

    Anabul(String Nama, String panggilan) {
        this.Nama      = Nama;
        this.panggilan = panggilan;
    }

    /******************METHOD******************/
    String getNama() {
        return panggilan;
    }

    void setNama(String nama) {
        panggilan = nama;
    }

    // Metode gerak - akan di-override oleh kelas anak
    void Gerak() {
        System.out.println(Nama + " bergerak.");
    }

    // Metode bersuara - akan di-override oleh kelas anak
    void Bersuara() {
        System.out.println(Nama + " bersuara.");
    }
}