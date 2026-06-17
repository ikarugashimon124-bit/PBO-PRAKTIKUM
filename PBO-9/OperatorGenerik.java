/* Nama File    : OperatorGenerik.java
 * Deskripsi   : Kelas berisi prosedur generik Tukar dan fungsi generik Bobot2
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class OperatorGenerik {
    /******************METHOD******************/

    <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    <T extends Kucing> double Bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot();
    }
}
