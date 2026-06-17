/*
 * Nama File  : PNS.java
 * Deskripsi  : Class yang merepresentasikan Pegawai Negeri Sipil (PNS)
 * Pembuat    : Mutiara Ayu Pramono
 * Tanggal    : 17 Juni 2026
 */
public class PNS extends Manusia implements Pajak {

    private String nip;
    private static int counterPNS = 0;
    private static final int A = Character.getNumericValue(NIM.charAt(NIM.length() - 1));

    public PNS(String nama, String tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, String tglMulaiKerja, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public int hitungMasaKerja() {
        return hitungLamaTahunKerja() + A;
    }

    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}