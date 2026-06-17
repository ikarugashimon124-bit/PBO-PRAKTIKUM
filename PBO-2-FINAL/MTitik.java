/* Nama File   : MTitik.java
* Deskripsi    : class MTitik
* Pembuat      : Mutiara Ayu Pramono
* Tanggal      : 16 Juni 2026
*/
public class MTitik {
    public static void main(String[] args) {
        System.out.println("Membuat Objek Titik");
        System.out.println("Titik T1:");
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();
        System.out.println("Kuadran T1 : " + T1.getKuadran());
        System.out.println("\nTitik T2:");
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();
        System.out.println("Kuadran T2 : " + T2.getKuadran());

        System.out.println("\nTitik T3:");
        Titik T3 = new Titik(5,6);
        T3.printTitik();
        T3.refleksIX();
        T3.refleksIY();
        T3.printTitik();
        System.out.println("Kuadran T3 : " + T3.getKuadran());
        System.out.println("\nTitik T4:");
        Titik T4 = T3.getRefleksiX();
        T4.printTitik();
        System.out.println("Kuadran T4 : " + T4.getKuadran());
        System.out.println("\nJumlah Objek titik: " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek titik: " + Titik.getCounterTitik());
        T1.printCounterTitik();
        System.out.println("Jarak T1 ke pusat : " + T1.getJarakPusat());
        System.out.println("Jarak T1 ke T3 : " + T1.getJarak(T3));     
    }
}