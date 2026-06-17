/*
 * Nama File  : MainBangunDatar.java
 * Deskripsi  : Main class untuk menguji class BangunDatar (abstract)
 * Pembuat    : Mutiara Ayu Pramono
 * Tanggal    : 17 Juni 2026
 */
public class MainBangunDatar {

    public static void main(String[] args) {

        Persegi p1 = new Persegi();
        p1.setSisi(5);
        p1.setWarna("Merah");
        p1.setBorder("Hitam");

        System.out.println("Persegi 1");
        p1.printInfo();

        Persegi p2 = new Persegi(7, "Biru", "Putih");
        System.out.println("\nPersegi 2");
        p2.printInfo();

        lingkaran l1 = new lingkaran(14, "Merah", "Hitam");

        System.out.println("\nLingkaran");
        System.out.println("Jari-jari: " + l1.getJari());
        System.out.println("Luas: " + l1.getLuas());
        System.out.println("Keliling: " + l1.getKeliling());

        l1.setJari(10);

        System.out.println("\nSetelah jari-jari diubah:");
        System.out.println("Jari-jari: " + l1.getJari());
        System.out.println("Luas: " + l1.getLuas());
        System.out.println("Keliling: " + l1.getKeliling());

        System.out.println("\n");
        BangunDatar.printCounterBangunDatar();
        System.out.println("\nEksperimen Abstract Class");
        BangunDatar P1 = new Persegi(10, "Hijau", "Hitam");
        Persegi P2 = new Persegi(5, "Kuning", "Coklat");
        BangunDatar L1 = new lingkaran(7, "Ungu", "Abu-abu");
         lingkaran L2 = new lingkaran(14, "Pink", "Putih");
        System.out.println("\nP1 (Persegi, diakses lewat reference BangunDatar):");
        P1.printInfo();
        System.out.println("Luas P1: " + P1.getLuas());
        System.out.println("Diagonal P1 (downcasting ke Persegi): " + ((Persegi) P1).getDiagonal());

        System.out.println("\nL1 (lingkaran, diakses lewat reference BangunDatar):");
        L1.printInfo();
        System.out.println("Luas L1: " + L1.getLuas());

        System.out.println("\nP2 (Persegi):");
        P2.printInfo();

        System.out.println("\nL2 (lingkaran):");
        L2.printInfo();
        System.out.println("\nEksperimen isEqualLuas() & isEqualKeliling()");
        System.out.println("P1.isEqualLuas(L1): " + P1.isEqualLuas(L1));
        System.out.println("P1.isEqualLuas(P2): " + P1.isEqualLuas(P2));
        System.out.println("L1.isEqualKeliling(L2): " + L1.isEqualKeliling(L2));
        System.out.println("P2.isEqualKeliling(L2): " + P2.isEqualKeliling(L2));

        System.out.println("\nEksperimen Interface IResize");

        IResize resizeP2 = P2;
        System.out.println("Sisi P2 sebelum zoomIn(): " + P2.getSisi());
        resizeP2.zoomIn();
        System.out.println("Sisi P2 setelah zoomIn(): " + P2.getSisi());

        resizeP2.zoomOut();
        System.out.println("Sisi P2 setelah zoomOut() : " + P2.getSisi());

        resizeP2.zoom(200);
        System.out.println("Sisi P2 setelah zoom(200) : " + P2.getSisi());

        System.out.println("\nJari-jari L2 sebelum zoomIn() : " + L2.getJari());
        L2.zoomIn();
        System.out.println("Jari-jari L2 setelah zoomIn() : " + L2.getJari());

        L2.zoomOut();
        System.out.println("Jari-jari L2 setelah zoomOut() : " + L2.getJari());

        L2.zoom(50);
        System.out.println("Jari-jari L2 setelah zoom(50): " + L2.getJari());
    }
}

/*

================= BAGIAN 1 (PRAKTIKUM 4, file lama) =================

1.) Apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut?
Mengapa?
public Persegi(double sisi, String warna, String border){
this.jmlSisi = 4;
this.warna = warna;
this.border = border;
this.sisi = sisi;
}

jawaban : tidak bisa. karena, atribut jmlSisi, warna, dan border dideklarasikan sebagai private di dalam class BangunDatar yang digambar awal. dan kala private artinya mereka cuma bisa diakses di dalam class bangun datar.

2. Coba lakukan overriding pada method printCounterBangunDatar(). Bagaimana hasilnya?jawaban 
jawaban : Overriding(penulisan ulang method dari superclass pada subclass) tidak terjadi. karena method tersebut bersifat static. Jika dibuat method dengan nama yang sama di subclass, yang terjadi adalah method hiding, bukan overriding.

3. Modifikasilah atribut class BangunDatar dengan access modifier protected. Setelah modifikasi
tersebut, apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut?
Mengapa?
public Persegi(double sisi, String warna, String border){
this.jmlSisi = 4;
this.warna = warna;
this.border = border;
this.sisi = sisi;
}

Ya. Konstruktor tersebut dapat direalisasikan karena modifier protected memungkinkan subclass mengakses langsung atribut yang diwarisi dari superclass.

4. Tambahkan keyword final pada kelas BangunDatar. Bagaimana pengaruhnya terhadap kelas
Persegi dan Lingkaran?

jawaban : Maka class tersebut tidak dapat dijadikan superclass, sehingga class Persegi dan Lingkaran tidak dapat melakukan inheritance dari class BangunDatar.

5. Hapus kembali keyword final pada kelas BangunDatar, lalu tambahkan keyword final pada
method printInfo() di dalam kelas BangunDatar. Bagaimana pengaruhnya dengan method
printInfo() pada kelas Persegi dan Lingkaran?

jawaban : method tersebut hanya dapat digunakan sebagaimana adanya dari class BangunDatar, dan tidak dapat diubah atau di-override oleh class Persegi maupun Lingkaran.


================= BAGIAN 1 - ABSTRACT CLASS (PRAKTIKUM 5) =================

Dari pembuatan objek BangunDatar B1, BangunDatar P1, Persegi P2, BangunDatar L1,
dan Lingkaran L1 pada modul. Adakah kode yang bermasalah pada saat dijalankan?

jawaban : Ada, dua baris berikut bermasalah kalau ditulis apa adanya seperti di modul:
1. "BangunDatar B1 = new BangunDatar();" tidak bisa di-compile, karena BangunDatar
   sudah dijadikan abstract class sehingga tidak boleh di-instansiasi langsung.
   Hanya subclass konkretnya (Persegi, lingkaran) yang boleh di-instansiasi.
2. "Lingkaran L1 = new Lingkaran(14);" juga tidak bisa di-compile, karena nama
   variabel L1 sudah dipakai sebelumnya pada baris "BangunDatar L1 = new Lingkaran(7);",
   sehingga terjadi duplicate variable declaration pada scope yang sama (di kode
   program ini makanya dipakai nama L2 supaya tetap bisa di-compile dan dijalankan).
Baris-baris lain (BangunDatar P1 = new Persegi(...), Persegi P2 = new Persegi(...),
BangunDatar L1 = new lingkaran(...)) tidak bermasalah, itu hanya upcasting biasa
dari subclass ke superclass-nya, dan method-method yang sudah ada (printInfo,
getLuas, getKeliling, dst) tetap bisa dipanggil lewat reference BangunDatar karena
method-method itu memang dideklarasikan di BangunDatar (walau abstract). Hanya
method yang khusus ada di Persegi/lingkaran saja (misalnya getDiagonal()) yang
tidak bisa dipanggil langsung lewat reference BangunDatar tanpa downcasting.

Apakah method yang dibuat pada langkah nomor 4 (isEqualLuas, isEqualKeliling) dapat
digunakan untuk membandingkan objek bangun datar yang berbeda?

jawaban : Bisa. Parameter method isEqualLuas() dan isEqualKeliling() bertipe
BangunDatar (superclass), sehingga method ini bisa menerima objek dari subclass
apapun, baik Persegi, lingkaran, ataupun bangun datar lain yang mungkin dibuat di
masa depan. Saat this.getLuas() dan X.getLuas() dipanggil, Java otomatis menjalankan
implementasi getLuas() sesuai objek aslinya masing-masing (dynamic binding /
polymorphism), jadi method ini tetap bisa dipakai untuk membandingkan dua bangun
datar walaupun bentuknya berbeda, contohnya P1.isEqualLuas(L1) pada kode di atas.

Jika BangunDatar tidak dijadikan sebagai abstract class, dapatkah Anda membuat
method isEqualLuas() dan isEqualKeliling pada class BangunDatar? Mengapa?

jawaban : Tetap bisa dibuat, tapi getLuas() dan getKeliling() di BangunDatar harus
diberi badan method/implementasi konkret (tidak boleh abstract lagi kalau class-nya
bukan abstract class), misalnya dikembalikan nilai default seperti 0. Konsekuensinya,
isEqualLuas() dan isEqualKeliling() tetap bisa meng-compile dan jalan, namun secara
desain ini kurang baik karena dua alasan: (1) tidak ada lagi compiler yang memaksa
subclass (Persegi, lingkaran) untuk meng-override getLuas()/getKeliling(), jadi kalau
programmer lupa override, errornya baru ketahuan saat runtime (hasilnya selalu 0),
bukan saat compile time; (2) nilai default getLuas()=0 pada BangunDatar itu sendiri
tidak punya makna yang jelas, karena "bangun datar" generik tanpa bentuk spesifik
sebenarnya tidak punya luas yang well-defined.

Apakah kelebihan saat class BangunDatar dijadikan sebagai abstract class daripada
non-abstract class?

jawaban : (1) Mencegah pembuatan objek BangunDatar generik secara langsung, yang
memang secara konsep tidak make sense karena tidak punya bentuk spesifik. (2) Memaksa
(enforce) setiap subclass konkret untuk mengimplementasikan getLuas() dan getKeliling()
sendiri, kalau lupa maka compiler akan error, sehingga bug terdeteksi sejak compile
time, bukan saat runtime. (3) BangunDatar tetap bisa menyimpan atribut dan method
yang dipakai bersama (jmlSisi, warna, border, printInfo, isEqualLuas, dst) sekaligus
mendefinisikan "kontrak" method yang wajib ada di semua turunannya, kombinasi reuse +
enforced contract yang tidak didapat kalau hanya pakai interface saja (interface
tidak bisa menyimpan atribut/field) ataupun class biasa saja (tidak ada kontrak
yang dipaksakan ke subclass-nya).


================= BAGIAN 2 - INTERFACE IResize =================

Lakukan eksperimen pemanggilan method yang telah dibuat dari IResize pada main
method. Bagaimana hasilnya?

jawaban : Semua method (zoomIn(), zoomOut(), zoom(int percent)) berhasil dipanggil
baik dari objek Persegi maupun lingkaran, baik lewat reference asli (Persegi/lingkaran)
maupun lewat reference interface IResize (lihat resizeP2 pada kode di atas), dan
masing-masing berhasil mengubah atribut ukuran utamanya (sisi untuk Persegi, jari
untuk lingkaran) sesuai rumus yang sudah diimplementasikan: zoomIn() membuat ukuran
10% lebih besar dari sebelumnya, zoomOut() membuat ukuran 10% lebih kecil dari
sebelumnya, dan zoom(percent) menskalakan ukuran sesuai persen yang diinput.

Apakah keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam interface
IResize dibanding dijadikan sebagai abstract method dalam class BangunDatar?

jawaban : (1) Java hanya mengizinkan sebuah class extends satu superclass saja
(single inheritance), tapi sebuah class boleh implements banyak interface sekaligus.
Kalau zoomIn/zoomOut/zoom dijadikan abstract method di BangunDatar, maka hanya class
yang merupakan turunan BangunDatar saja yang bisa punya kemampuan resize ini. Dengan
dijadikan interface IResize, class apapun yang punya sifat "bisa di-resize" bisa
mengimplementasikannya, walaupun class tersebut sama sekali tidak punya hubungan
pewarisan dengan BangunDatar, misalnya class Garis atau Bangun3D seperti yang
disebutkan pada modul. (2) Interface memisahkan kemampuan/behaviour (apa yang BISA
dilakukan objek) dari hierarki is-a (apa JENIS objek tersebut). Resize adalah sebuah
kemampuan, bukan bagian dari identitas "ini adalah bangun datar", sehingga lebih
tepat dipisah ke interface sendiri (loose coupling) daripada dipaksakan masuk ke
hierarki inheritance BangunDatar.

*/
