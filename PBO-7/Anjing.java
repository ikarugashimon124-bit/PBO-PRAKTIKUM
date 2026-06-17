/* Nama File    : Anjing.java
 * Deskripsi   : Kelas anak Anjing yang mewarisi kelas Anabul
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class Anjing extends Anabul {
    /******************KONSTRUKTOR*************/
    Anjing(String Nama) {
        super(Nama);
    }

    /******************METHOD******************/
    void Gerak() {
        System.out.println(Nama + " bergerak dengan melata.");
    }

    void Bersuara() {
        System.out.println(Nama + " bersuara: Guk-guk!");
    }
}
