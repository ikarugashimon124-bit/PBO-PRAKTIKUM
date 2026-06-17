/* Nama File    : MData.java
 * Deskripsi   : Program utama untuk menguji kelas generik Data (larik generik)
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class MData {
    public static void main(String[] args) {

        System.out.println("4a. Data<Integer>");
        Data<Integer> dataInt = new Data<>();
        dataInt.setIsi(1, 10);
        dataInt.setIsi(2, 20);
        dataInt.setIsi(3, 30);
        System.out.println("Elemen ke-1: " + dataInt.getIsi(1));
        System.out.println("Elemen ke-2: " + dataInt.getIsi(2));
        System.out.println("Elemen ke-3: " + dataInt.getIsi(3));
        System.out.println("Ukuran: " + dataInt.getSize());

        System.out.println("\n4b. setIsi - Data<Anabul>");
        Data<Anabul> dataAnabul = new Data<>();
        dataAnabul.setIsi(1, new Kucing("Mimi", 3.5));
        dataAnabul.setIsi(2, new Anjing("Rex"));
        dataAnabul.setIsi(3, new Burung("Tweety"));
        dataAnabul.setIsi(4, new Anggora("Mochi", 4.5));
        dataAnabul.setIsi(5, new Kembangtelon("Oreo", 3.2));
        System.out.println("5 objek Anabul berhasil dimasukkan.");

        System.out.println("\n4c. getIsi - Data<Anabul>");
        System.out.print("Elemen ke-1: ");
        dataAnabul.getIsi(1).Bersuara();
        System.out.print("Elemen ke-2: ");
        dataAnabul.getIsi(2).Gerak();
        System.out.print("Elemen ke-3: ");
        dataAnabul.getIsi(3).Bersuara();
        System.out.print("Elemen ke-4: ");
        dataAnabul.getIsi(4).Bersuara();
        System.out.print("Elemen ke-5: ");
        dataAnabul.getIsi(5).Gerak();

        System.out.println("\n4d. getSize - Data<Anabul>");
        System.out.println("Banyak elemen efektif: " + dataAnabul.getSize());
    }
}
