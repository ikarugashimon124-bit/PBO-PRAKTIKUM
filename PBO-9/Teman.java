/* Nama File   : Teman.java
 * Deskripsi   : Kelas Teman yang mengelola koleksi List<String> dengan nama-nama teman
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

import java.util.ArrayList;

public class Teman {
    /******************ATRIBUT*****************/
    ArrayList<String> listNamaTeman;

    /******************KONSTRUKTOR*************/
    Teman() {
        listNamaTeman = new ArrayList<>();
    }

    /******************METHOD******************/
    void tambahTeman(String nama) {
        listNamaTeman.add(nama);
    }

    void hapusTeman(String nama) {
        listNamaTeman.remove(nama);
    }

    void tampilTeman() {
        System.out.println("Daftar Teman :");
        for (int i = 0; i < listNamaTeman.size(); i++) {
            System.out.println((i + 1) + ". " + listNamaTeman.get(i));
        }
    }
}
