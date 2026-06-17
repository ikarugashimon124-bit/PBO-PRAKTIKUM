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

/*
 * ============================================================
 * RENUNGAN - Konsep Koleksi
 * ============================================================
 * Koleksi adalah struktur data dinamis dari paket java.util
 * yang memungkinkan penyimpanan sekumpulan objek tanpa harus
 * menentukan kapasitas tetap sejak awal.
 *
 * Berbeda dengan larik (array) biasa yang ukurannya bersifat
 * statis, koleksi dapat tumbuh dan menyusut secara otomatis
 * sesuai kebutuhan program. Java menyediakan beberapa jenis
 * koleksi berdasarkan pola akses yang dibutuhkan :
 *
 *   - List<T>  : menyimpan elemen secara berurutan dengan
 *                indeks, memperbolehkan duplikat. Cocok untuk
 *                daftar yang perlu diakses secara acak.
 *                Contoh implementasi : ArrayList, LinkedList.
 *
 *   - Queue<T> : antrean berprinsip FIFO (First In, First Out).
 *                Elemen masuk di belakang melalui offer() dan
 *                keluar dari depan melalui poll(). Cocok untuk
 *                simulasi antrean. Contoh : LinkedList.
 *
 *   - Set<T>   : koleksi tanpa elemen duplikat.
 *
 *   - Map<K,V> : koleksi pasangan kunci-nilai.
 *
 * Pada praktikum ini :
 *   - List<String> pada kelas Teman merepresentasikan daftar
 *     nama yang dapat ditambah, dihapus, dan diganti secara
 *     fleksibel menggunakan metode bawaan ArrayList.
 *   - Queue<Anabul> pada kelas Piaraan merepresentasikan
 *     antrean hewan yang menunggu dirawat di klinik, mengikuti
 *     prinsip FIFO sehingga yang datang lebih dulu akan
 *     dilayani lebih dulu (dequeueAnabul).
 *
 * Dengan koleksi, pengelolaan data menjadi jauh lebih mudah
 * dan fleksibel dibandingkan larik statis biasa.
 * ============================================================
 */
