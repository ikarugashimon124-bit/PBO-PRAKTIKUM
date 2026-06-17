/* Nama File    : Kucing.java
 * Deskripsi   : Kelas anak Kucing yang mewarisi Anabul, ditambah atribut bobot (1a)
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class Kucing extends Anabul {
    /******************ATRIBUT*****************/
    double bobot;

    /******************KONSTRUKTOR*************/
    Kucing(String Nama, double bobot) {
        super(Nama);
        this.bobot = bobot;
    }

    /******************METHOD******************/
    double getBobot() {
        return bobot;
    }

    void setBobot(double bobot) {
        this.bobot = bobot;
    }

    void Gerak() {
        System.out.println(Nama + " bergerak dengan melata.");
    }

    void Bersuara() {
        System.out.println(Nama + " bersuara: Meong!");
    }
}
