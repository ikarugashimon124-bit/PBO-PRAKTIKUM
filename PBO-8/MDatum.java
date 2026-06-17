/* Nama File    : MDatum.java
 * Deskripsi   : Program utama yang mengilustrasikan kelas generik Datum dan aplikasinya menggunakan keluarga kelas Anabul
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class MDatum {
    public static void main(String[] args) {

        System.out.println("2. Datum<Integer>");
        Datum<Integer> datumInt = new Datum<>(65);
        System.out.println("Isi awal: " + datumInt.getIsi());
        datumInt.setIsi(99);
        System.out.println("Isi baru: " + datumInt.getIsi());

        System.out.println("\n2. Datum<String>");
        Datum<String> datumStr = new Datum<>("Halo");
        System.out.println("Isi awal: " + datumStr.getIsi());
        datumStr.setIsi("Selamat Datang");
        System.out.println("Isi baru: " + datumStr.getIsi());

        System.out.println("\n2. Datum<Double>");
        Datum<Double> datumDbl = new Datum<>(3.14);
        System.out.println("Isi awal: " + datumDbl.getIsi());
        datumDbl.setIsi(2.718);
        System.out.println("Isi baru: " + datumDbl.getIsi());

        System.out.println("\n2. Datum<Anabul> - aplikasi keluarga Anabul");
        Anggora mochi = new Anggora("Mochi", 4.5);
        Kembangtelon oreo = new Kembangtelon("Oreo", 3.2);
        Anjing rex = new Anjing("Rex");
        Burung tweety = new Burung("Tweety");

        Datum<Anabul> datumAnabul = new Datum<>(mochi);
        System.out.println("Isi awal:");
        datumAnabul.getIsi().Bersuara();
        datumAnabul.getIsi().Gerak();

        datumAnabul.setIsi(rex);
        System.out.println("Setelah setIsi(Rex):");
        datumAnabul.getIsi().Bersuara();
        datumAnabul.getIsi().Gerak();

        datumAnabul.setIsi(tweety);
        System.out.println("Setelah setIsi(Tweety):");
        datumAnabul.getIsi().Bersuara();
        datumAnabul.getIsi().Gerak();

        System.out.println("\n2. Datum<Kucing> - akses atribut bobot");
        Datum<Kucing> datumKucing = new Datum<>(oreo);
        System.out.println("Nama: " + datumKucing.getIsi().Nama);
        System.out.println("Bobot: " + datumKucing.getIsi().getBobot() + " kg");

        Kucing mimi = new Kucing("Mimi", 3.8);
        datumKucing.setIsi(mimi);
        System.out.println("Setelah setIsi(Mimi):");
        System.out.println("Nama: " + datumKucing.getIsi().Nama);
        System.out.println("Bobot: " + datumKucing.getIsi().getBobot() + " kg");
    }
}
