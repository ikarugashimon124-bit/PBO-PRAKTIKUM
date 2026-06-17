/* Nama File    : Anggora.java
 * Deskripsi   : Kelas Anggora yang mewarisi kelas Kucing (1b)
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class Anggora extends Kucing {
    /******************KONSTRUKTOR*************/
    Anggora(String Nama, double bobot) {
        super(Nama, bobot);
    }

    /******************METHOD******************/
    void Gerak() {
        System.out.println(Nama + " (Anggora) bergerak dengan melata anggun.");
    }

    void Bersuara() {
        System.out.println(Nama + " (Anggora) bersuara: Meooong...");
    }
}
