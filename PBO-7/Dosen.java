/* Nama File    : Dosen.java
 * Deskripsi   : Kelas Dosen yang mewarisi kelas Civitasakademika
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class Dosen extends Civitasakademika {
    /******************ATRIBUT*****************/
    String NIP;

    /******************KONSTRUKTOR*************/
    Dosen(String NIP, String Nama) {
        super(Nama);
        this.NIP = NIP;
    }

    /******************METHOD******************/
    String getNomor() {
        return NIP;
    }

    String getNIP() {
        return NIP;
    }
}
