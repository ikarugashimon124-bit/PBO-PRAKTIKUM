/* Nama File     MTeman.java
 * Deskripsi   : Program utama untuk menguji kelas Teman (List<String>)
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class MTeman {
    public static void main(String[] args) {
        Teman myTeman = new Teman();
        myTeman.tambahTeman("Adi");
        myTeman.tambahTeman("Bambang");
        myTeman.tambahTeman("Citra");
        myTeman.tambahTeman("Dimas");

        System.out.println("Tampil daftar teman :");
        myTeman.tampilTeman();

        System.out.println("\nMenghapus Bambang");
        myTeman.hapusTeman("Bambang");

        System.out.println("\nTampil daftar teman setelah penghapusan :");
        myTeman.tampilTeman();
    }
}
