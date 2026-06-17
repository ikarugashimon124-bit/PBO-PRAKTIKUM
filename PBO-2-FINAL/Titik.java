/* Nama File   : Titik.java
 * Deskripsi    : class Titik
 * Pembuat      : Mutiara Ayu Pramono
 * Tanggal      : 16 Juni 2026
 */

public class Titik {
    double absis;
    double ordinat;
    static int counterTitik = 0;

    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    static int getCounterTitik() {
        return counterTitik;
    }

    void setAbsis(double x) {
        this.absis = x;
    }

    void setOrdinat(double y) {
        this.ordinat = y;
    }

    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    void printCounterTitik(){
        System.out.println("Jumlah Objek Titik : " + Titik.counterTitik);
    }

    int getKuadran(){
        if(absis > 0 && ordinat > 0){
            return 1;
        }
        else if(absis < 0 && ordinat > 0){
            return 2;
        }
        else if(absis < 0 && ordinat < 0){
            return 3;
        }
        else if(absis > 0 && ordinat < 0){
            return 4;
        }
        else{
            return 0;
        }
    }

    double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    double getJarak(Titik T) {
        double dx = this.absis - T.absis;
        double dy = this.ordinat - T.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    void refleksIX() {
        ordinat = -ordinat;
    }

    void refleksIY() {
        absis = -absis;
    }

    Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }   
}
