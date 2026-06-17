/* Nama File   : MGaris.java
* Deskripsi    : class MGaris
* Pembuat      : Mutiara Ayu Pramono
* Tanggal      : 16 Juni 2026
*/
public class MGaris {
    public static void main(String[] args) {
        System.out.println("Membuat Objek Garis");

        System.out.println("Garis G1:");
        Garis G1 = new Garis();
        Titik T3 = new Titik(4,5);
        Titik T4 = new Titik(6,4);
        G1.printGaris();
        G1.setTitikAwal(T3);
        G1.setTitikAkhir(T4);
        G1.printGaris();
        G1.printCounterGaris();
        System.out.println("Panjang G1: " + G1.getPanjang());
        System.out.println("Gradien G1: " + G1.getGradien());
        G1.tampilTitikGaris();

        System.out.println("\nGaris G2:");
        Titik T5 = new Titik(3,2);
        Titik T6 = new Titik(7,3);
        Garis G2 = new Garis(T5, T6);
        G2.printGaris();
        G2.printCounterGaris();
        System.out.println("Panjang G2: " + G2.getPanjang());
        System.out.println("Gradien G2: " + G2.getGradien());
        G2.tampilTitikGaris();

        Titik T1 = G1.getTitikTengah();
        System.out.println("\nTitik tengah G1: ");
        T1.printTitik();
        System.out.println("Apakah G1 Sejajar dengan G2: " + G1.isSejajar(G2));
        System.out.println("Apakah G1 Tegak Lurus dengan G2: " + G1.isTegakLurus(G2));
        G2.persamaanGaris();
    }
}