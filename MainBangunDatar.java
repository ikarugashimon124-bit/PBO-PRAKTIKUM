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
    }

}

/* 

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

*/
