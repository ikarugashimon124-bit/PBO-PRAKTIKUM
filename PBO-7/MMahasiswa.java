/* Nama File    : MMahasiswa.java
 * Deskripsi   : Program utama untuk menguji kelas Mahasiswa (Overloading)
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {

        System.out.println("2c. Konstruktor Default");
        Mahasiswa M1 = new Mahasiswa();
        M1.printMahasiswa();

        System.out.println("\n2d. Konstruktor Tiga Parameter");
        Mahasiswa M2 = new Mahasiswa(1001, "Budi Santoso", "Informatika");
        M2.printMahasiswa();

        System.out.println("\n2b. Varian 1: setProgramStudi() tanpa parameter");
        M1.setProgramStudi();
        M1.printMahasiswa();

        System.out.println("\n2b. Varian 2: setProgramStudi(String)");
        M2.setProgramStudi("Teknik Komputer");
        M2.printMahasiswa();

        System.out.println("\n2b. Varian 3: setProgramStudi(Mahasiswa)");
        Mahasiswa M3 = new Mahasiswa(1002, "Siti Rahayu", "n/a");
        M3.setProgramStudi(M2);
        M3.printMahasiswa();

        System.out.println("\n2e. Konstruktor Kloning (dari M2)");
        Mahasiswa M4 = new Mahasiswa(M2);  // kloning M2
        M4.printMahasiswa();
    }
}
