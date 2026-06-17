/* Nama File    : Kucing.java
 * Deskripsi   : Kelas anak Kucing yang mewarisi kelas Anabul
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class Kucing extends Anabul {
    /******************KONSTRUKTOR*************/
    Kucing(String Nama) {
        super(Nama);
    }

    /******************METHOD******************/
    void Gerak() {
        System.out.println(Nama + " bergerak dengan melata.");
    }

    void Bersuara() {
        System.out.println(Nama + " bersuara: Meong!");
    }
}
