/* Nama File    : MAnabul.java
 * Deskripsi   : Program utama untuk mensimulasikan bunyi dan gerakan Anabul
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class MAnabul {
    public static void main(String[] args) {

        Anabul[] koleksiAnabul = new Anabul[3];
        koleksiAnabul[0] = new Kucing("Mimi"); 
        koleksiAnabul[1] = new Anjing("Rex");  
        koleksiAnabul[2] = new Burung("Tweety");

        System.out.println("Koleksi Anabul");
        for (int i = 0; i < koleksiAnabul.length; i++) {
            koleksiAnabul[i].Bersuara(); 
            koleksiAnabul[i].Gerak();
            System.out.println();
        }
    }
}
