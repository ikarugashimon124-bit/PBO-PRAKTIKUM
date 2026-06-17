/* Nama File    : Data.java
 * Deskripsi   : Kelas generik Data dengan larik statis 100 elemen bertipe T
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class Data<T> {
    /******************ATRIBUT*****************/
    Object[] ruang; 
    int banyak;

    /******************KONSTRUKTOR*************/
    Data() {
        ruang = new Object[100];
        banyak = 0;
    }

    /******************METHOD******************/
    void setIsi(int posisi, T objek) {
        ruang[posisi - 1] = objek;
        banyak++;
    }

    T getIsi(int posisi) {
        return (T) ruang[posisi - 1];
    }

    int getSize() {
        return banyak;
    }
}
