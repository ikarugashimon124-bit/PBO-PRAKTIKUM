/*
 * Nama File  : Persegi.java
 * Deskripsi  : Class yang merepresentasikan bangun datar persegi. 
 * Pembuat    : Mutiara Ayu Pramono
 * Tanggal    : 17 Juni 2026
 */
public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + (sisi * sisi));
    }

    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent) {
        sisi = sisi * percent / 100;
    }
}
