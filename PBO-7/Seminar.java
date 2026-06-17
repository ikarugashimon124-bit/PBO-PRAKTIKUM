/* Nama File    : Seminar.java
 * Deskripsi   : Kelas Seminar dengan larik statis peserta maksimal 100 orang
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class Seminar {
    /******************ATRIBUT*****************/
    Civitasakademika[] pesertas;
    int banyakpeserta;

    /******************KONSTRUKTOR*************/
    Seminar() {
        pesertas      = new Civitasakademika[100];
        banyakpeserta = 0;                       
    }

    /******************METHOD******************/
    int countPeserta() {
        return banyakpeserta;
    }

    void registrasi(Civitasakademika C) {
        if (banyakpeserta < 100) {
            pesertas[banyakpeserta] = C; 
            banyakpeserta++;
        } else {
            System.out.println("Kapasitas seminar sudah penuh!");
        }
    }

    void tampilPeserta() {
        System.out.println("Daftar Peserta Seminar");
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println((i + 1) + ". [" + pesertas[i].getNomor() + "] "
                               + pesertas[i].getNama());
        }
    }

    int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}