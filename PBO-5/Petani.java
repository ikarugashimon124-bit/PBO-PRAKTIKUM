/*
 * Nama File  : Petani.java
 * Deskripsi  : Class yang merepresentasikan Petani 
 * Pembuat    : Mutiara Ayu Pramono
 * Tanggal    : 17 Juni 2026
 */
public class Petani extends Manusia implements Pajak {

    private String asalKota;
    private static int counterPetani = 0;
    private static final int C = Character.getNumericValue(NIM.charAt(NIM.length() - 3));

    public Petani(String nama, String tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    public String getAsalKota() {
        return asalKota;
    }

    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja() {
        return hitungLamaTahunKerja() + C;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asalKota);
    }
}