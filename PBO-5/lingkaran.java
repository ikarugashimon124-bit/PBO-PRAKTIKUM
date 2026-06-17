/*
 * Nama File  : lingkaran.java
 * Deskripsi  : Class yang merepresentasikan bangun datar lingkaran.
 * Pembuat    : Mutiara Ayu Pramono
 * Tanggal    : 17 Juni 2026
 */
public class lingkaran extends BangunDatar implements IResize {

    private double jari;

    public lingkaran() {
        setJmlSisi(0);
    }

    public lingkaran(double diameter, String warna, String border) {
        this.jari = diameter / 2;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(0);
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari = jari * percent / 100;
    }
}
