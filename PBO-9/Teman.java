/* Nama File    : Teman.java
 * Deskripsi   : Kelas Teman yang mengelola koleksi List<String> nama-nama teman
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

import java.util.ArrayList;
import java.util.List;

public class Teman {
    /******************ATRIBUT*****************/
    int          nbelm;
    List<String> Lnama;

    /******************KONSTRUKTOR*************/
    Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    /******************METHOD******************/
    int getNbelm() {
        return nbelm;
    }

    String getNama(int indeks) {
        return Lnama.get(indeks);
    }

    void setNama(int indeks, String nama) {
        Lnama.set(indeks, nama);
    }

    void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }

    boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    void gantiNama(String nama, String namabaru) {
        for (int i = 0; i < Lnama.size(); i++) {
            if (Lnama.get(i).equals(nama)) {
                Lnama.set(i, namabaru);
            }
        }
    }

    int countNama(String nama) {
        int count = 0;
        for (String s : Lnama) {
            if (s.equals(nama)) count++;
        }
        return count;
    }

    void showTeman() {
        System.out.println("Daftar Teman (" + nbelm + " orang) :");
        for (int i = 0; i < Lnama.size(); i++) {
            System.out.println("  [" + i + "] " + Lnama.get(i));
        }
    }
}
