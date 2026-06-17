/* Nama File    : Civitasakademika.java
 * Deskripsi   : Kelas induk Civitasakademika dengan atribut Nama dan fungsi getNomor
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class Civitasakademika {
    /******************ATRIBUT*****************/
    String Nama;

    /******************KONSTRUKTOR*************/
    Civitasakademika(String Nama) {
        this.Nama = Nama;
    }

    /******************METHOD******************/
    String getNama() {
        return Nama;
    }

    String getNomor() {
        return "-";
    }
}
