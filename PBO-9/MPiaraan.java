/* Nama File     MPiaraan.java
 * Deskripsi   : Program utama untuk menguji kelas Piaraan (koleksi Queue<Anabul>)
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class MPiaraan {
    public static void main(String[] args) {

        Piaraan klinik = new Piaraan();
        Anjing rex = new Anjing("Rex");
        Kucing mimi = new Kucing("Mimi", 3.5);
        Burung tweety = new Burung("Tweety");
        Anggora mochi = new Anggora("Mochi", 4.5);
        Kembangtelon oreo = new Kembangtelon("Oreo", 3.2);

        rex.setNama("Gonggong");
        mimi.setNama("Meong");
        tweety.setNama("Cicit");
        mochi.setNama("Anggun");
        oreo.setNama("Lincah");

        System.out.println("2b.ii. enqueueAnabul - mengisi antrean klinik");
        klinik.enqueueAnabul(rex);
        klinik.enqueueAnabul(mimi);
        klinik.enqueueAnabul(tweety);
        klinik.enqueueAnabul(mochi);
        klinik.enqueueAnabul(oreo);
        System.out.println("5 objek Anabul berhasil dimasukkan.");

        System.out.println("\n2b.i. getNbelm : " + klinik.getNbelm() + " ekor");

        System.out.println("\n2b.iv. getAnabul (peek) :");
        System.out.print(" Anabul pertama -> ");
        klinik.getAnabul().Bersuara();

        System.out.println("\n2b.iii. isMember :");
        Anjing tamu = new Anjing("Tamu");
        System.out.println(" isMember(rex): " + klinik.isMember(rex));
        System.out.println(" isMember(tamu): " + klinik.isMember(tamu));

        System.out.println("\n2c. showAnabul :");
        klinik.showAnabul();

        System.out.println("\n2d. countKucing : " + klinik.countKucing() + " ekor");

        System.out.println("\n2e. bobotKucing : " + klinik.bobotKucing() + " kg");

        System.out.println("\n2f. showJenisAnabul :");
        klinik.showJenisAnabul();

        System.out.println("\n2b.v. dequeueAnabul :");
        System.out.print("  Keluar dari antrean -> ");
        klinik.dequeueAnabul().Bersuara();
        System.out.println("  Sisa antrean : " + klinik.getNbelm() + " ekor");
        klinik.showAnabul();
    }
}
