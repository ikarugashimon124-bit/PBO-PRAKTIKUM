/* Nama File   : Piaraan.java
 * Deskripsi   : Kelas Piaraan yang mengelola koleksi antrean Queue<Anabul>
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    /******************ATRIBUT*****************/
    int nbelm;   
    Queue<Anabul> Lanabul;

    /******************KONSTRUKTOR*************/
    Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm   = 0;
    }

    /******************METHOD******************/
    int getNbelm() {
        return nbelm;
    }

     void enqueueAnabul(Anabul anabul) {
        Lanabul.offer(anabul);
        nbelm++;
    }

    boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    Anabul getAnabul() {
        return Lanabul.peek();
    }

    Anabul dequeueAnabul() {
        if (!Lanabul.isEmpty()) {
            nbelm--;
            return Lanabul.poll();
        }
        return null;
    }

    void showAnabul() {
        System.out.println("Antrean Piaraan (" + nbelm + " ekor) :");
        for (Anabul a : Lanabul) {
            System.out.println("  - " + a.getNama());
        }
    }

    int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) count++;
        }
        return count;
    }

    double bobotKucing() {
        double total = 0.0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                total += ((Kucing) a).getBobot();
            }
        }
        return total;
    }

    void showJenisAnabul() {
        System.out.println("Daftar Jenis Anabul :");
        for (Anabul a : Lanabul) {
            System.out.println("  " + a.getNama()
                             + " -> " + a.getClass().getName());
        }
    }
}
