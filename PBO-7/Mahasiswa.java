/* Nama File    : Mahasiswa.java
 * Deskripsi   : Kelas Mahasiswa yang mewarisi Civitasakademika, dengan method overloading setProgramStudi, setWali, dan tampilDataMahasiswa
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class Mahasiswa extends Civitasakademika {
    /******************ATRIBUT*****************/
    String NIM;      
    String Programstudi;
    Dosen  wali;  

    /******************KONSTRUKTOR*************/
    Mahasiswa() {
        super("n/a");
        NIM = "n/a";
        Programstudi = "n/a";
        wali = null;
    }

    Mahasiswa(String NIM, String Nama) {
        super(Nama);
        this.NIM = NIM;
        this.Programstudi = "n/a";
        this.wali = null;
    }

    Mahasiswa(String NIM, String Nama, String Programstudi) {
        super(Nama);
        this.NIM = NIM;
        this.Programstudi = Programstudi;
        this.wali = null;
    }

    Mahasiswa(int NIM, String Nama, String Programstudi) {
        super(Nama);
        this.NIM = String.valueOf(NIM);
        this.Programstudi = Programstudi;
        this.wali = null;
    }

    Mahasiswa(Mahasiswa M) {
        super(M.Nama);
        this.NIM          = M.NIM;
        this.Programstudi = M.Programstudi;
        this.wali         = M.wali;
    }

    /******************METHOD******************/
    @Override
    String getNomor() {
        return NIM;
    }

    void setNIM(String NIM) {
        this.NIM = NIM;
    }

    void setNama(String Nama) {
        this.Nama = Nama;
    }

    void setWali(Dosen wali) {
        this.wali = wali;
    }

    void setProgramStudi() {
        Programstudi = "Kosong";
    }

    void setProgramStudi(String prodi) {
        Programstudi = prodi;
    }

    void setProgramStudi(Mahasiswa M) {
        Programstudi = M.Programstudi;
    }

    String getNIM() {
        return NIM;
    }

    String getProgramstudi() {
        return Programstudi;
    }

    Dosen getWali() {
        return wali;
    }

    void printMahasiswa() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Program Studi: " + Programstudi);
    }

    void tampilDataMahasiswa() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Program Studi: " + Programstudi);
        if (wali != null) {
            System.out.println("Dosen Wali: " + wali.getNama()
                               + " (NIP: " + wali.getNIP() + ")");
        } else {
            System.out.println("Dosen Wali: -");
        }
    }
}
