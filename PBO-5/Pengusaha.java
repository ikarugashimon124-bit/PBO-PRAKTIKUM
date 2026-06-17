/*
 * Nama File  : Pengusaha.java
 * Deskripsi  : Class yang merepresentasikan Pengusaha 
 * Pembuat    : Mutiara Ayu Pramono
 * Tanggal    : 17 Juni 2026
 */
public class Pengusaha extends Manusia implements Pajak {

    private String npwp;
    private static int counterPengusaha = 0;
    private static final int B = Character.getNumericValue(NIM.charAt(NIM.length() - 2));

    public Pengusaha(String nama, String tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public int hitungMasaKerja() {
        return hitungLamaTahunKerja() + B;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}