/* Nama File   : MTeman.java
 * Deskripsi   : Program utama untuk menguji kelas Teman (koleksi List<String>)
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class MTeman {
    public static void main(String[] args) {

        Teman teman = new Teman();

        // 1d. addNama
        System.out.println("1d. addNama - mengisi daftar teman");
        teman.addNama("Budi");
        teman.addNama("Sari");
        teman.addNama("Andi");
        teman.addNama("Sari");
        teman.addNama("Dewi");
        System.out.println("5 nama berhasil ditambahkan.");

        System.out.println("\n1a. getNbelm : " + teman.getNbelm());

        System.out.println("\n1i. showTeman :");
        teman.showTeman();

         System.out.println("\n1b. getNama(2): " + teman.getNama(2));

        System.out.println("\n1c. setNama(0, \"Bambang\")");
        teman.setNama(0, "Bambang");
        teman.showTeman();

        System.out.println("\n1f. isMember(\"Sari\"): " + teman.isMember("Sari"));
        System.out.println("isMember(\"Budi\"): " + teman.isMember("Budi"));
        System.out.println("isMember(\"Bambang\"): " + teman.isMember("Bambang"));

        System.out.println("\n1h. countNama(\"Sari\"): " + teman.countNama("Sari"));

        System.out.println("\n1g. gantiNama(\"Sari\", \"Wulan\") - ganti semua kemunculan");
        teman.gantiNama("Sari", "Wulan");
        teman.showTeman();

        System.out.println("\n1e. delNama(\"Andi\")");
        teman.delNama("Andi");
        teman.showTeman();
    }
}
