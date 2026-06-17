/* Nama File    : Kembangtelon.java
 * Deskripsi   : Kelas Kembangtelon yang mewarisi kelas Kucing (1b)
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class Kembangtelon extends Kucing {
    /******************KONSTRUKTOR*************/
    Kembangtelon(String Nama, double bobot) {
        super(Nama, bobot);
    }

    /******************METHOD******************/
    void Gerak() {
        System.out.println(Nama + " (Kembangtelon) bergerak dengan melata lincah.");
    }

    void Bersuara() {
        System.out.println(Nama + " (Kembangtelon) bersuara: Meong nyaring!");
    }
}
