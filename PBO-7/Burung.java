/* Nama File    : Burung.java
 * Deskripsi   : Kelas anak Burung yang mewarisi kelas Anabul
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class Burung extends Anabul {
    /******************KONSTRUKTOR*************/
    Burung(String Nama) {
        super(Nama);
    }

    /******************METHOD******************/
    // Burung bergerak dengan terbang
    void Gerak() {
        System.out.println(Nama + " bergerak dengan terbang.");
    }

    // Burung berbunyi cuit
    void Bersuara() {
        System.out.println(Nama + " bersuara: Cuit!");
    }
}
