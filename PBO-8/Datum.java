/* Nama File    : Datum.java
 * Deskripsi   : Kelas generik Datum dengan atribut isi bertipe parameter T
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class Datum<T> {
    /******************ATRIBUT*****************/
    T isi;

    /******************KONSTRUKTOR*************/
    Datum(T isi) {
        this.isi = isi;
    }

    /******************METHOD******************/
    T getIsi() {
        return isi;
    }

    void setIsi(T isibaru) {
        isi = isibaru;
    }
}
