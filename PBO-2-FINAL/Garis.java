/* Nama File   : Garis.java
 * Deskripsi    : class Garis
 * Pembuat      : Mutiara Ayu Pramono
 * Tanggal      : 16 Juni 2026
 */
public class Garis {
    Titik T0;
    Titik T1;
    static int counterGaris = 0;
    
    Garis(){
        T0 = new Titik();
        T1 = new Titik(1,1);
        counterGaris++;
    }

    Garis(Titik T0, Titik T1){
        this.T0 = T0;
        this.T1 = T1;
        counterGaris++;
    }

    Titik getTitikAwal(){
        return T0;
    }

    Titik getTitikAkhir(){
        return T1;
    }

    void setTitikAwal(Titik T0){
        this.T0 = T0;
    }

    void setTitikAkhir(Titik T1){
        this.T1 = T1;
    }

    static int getCounterGaris() {
        return counterGaris;
    }

    void printGaris() {
        System.out.println("Garis (" + T0.getAbsis() + ", " + T0.getOrdinat() + "),(" + T1.getAbsis() + ", " + T1.getOrdinat() + ")" );
    }

    void printCounterGaris(){
        System.out.println("Jumlah Objek Garis : " + Garis.counterGaris);
    }

    double getPanjang(){
        double dx = T1.getAbsis() - T0.getAbsis();
        double dy = T1.getOrdinat() - T0.getOrdinat();
        return Math.sqrt(dx*dx + dy*dy);
    }

    double getGradien(){
        double dx = T1.getAbsis() - T0.getAbsis();
        double dy = T1.getOrdinat() - T0.getOrdinat();
        if(dx != 0){
            return dy/dx;
        }
        else{
            return 0;
        }
    }

    Titik getTitikTengah(){
        double dx = (T0.getAbsis() + T1.getAbsis())/2;
        double dy = (T0.getOrdinat() + T1.getOrdinat())/2;
        return new Titik(dx, dy);
    }

    boolean isSejajar(Garis G){
        double gradien1 = this.getGradien();
        double gradien2 = G.getGradien();
        return gradien1 == gradien2;
    }

    boolean isTegakLurus(Garis G){
        double gradien1 = this.getGradien();
        double gradien2 = G.getGradien();
        return (gradien1 * gradien2) == -1;
    }

    void tampilTitikGaris(){
        System.out.println("Titik Awal : (" + T0.getAbsis() + ", " + T0.getOrdinat() + ")");
        System.out.println("Titik Akhir : (" + T1.getAbsis() + ", " + T1.getOrdinat() + ")");
    }

    void persamaanGaris(){
        double m = getGradien();
        double c = T0.getOrdinat() - (m * T0.getAbsis());
        System.out.println("y = " + m + "x + " + c);
    }
}
