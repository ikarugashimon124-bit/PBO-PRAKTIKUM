/*
 * Nama File  : Manusia.java
 * Deskripsi  : Abstract class yang merepresentasikan data umum seorang manusia
 * Pembuat    : Mutiara Ayu Pramono
 * Tanggal    : 17 Juni 2026
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Manusia {
    protected static final String NIM = "24060123140131";

    private static final DateTimeFormatter FORMAT_TANGGAL = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia(String nama, String tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = LocalDate.parse(tglMulaiKerja, FORMAT_TANGGAL);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public Manusia(String nama, String tglMulaiKerja, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = LocalDate.parse(tglMulaiKerja, FORMAT_TANGGAL);
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTglMulaiKerja() {
        return tglMulaiKerja;
    }

    public void setTglMulaiKerja(String tglMulaiKerja) {
        this.tglMulaiKerja = LocalDate.parse(tglMulaiKerja, FORMAT_TANGGAL);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tglMulaiKerja.format(FORMAT_TANGGAL));
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    protected int hitungLamaTahunKerja() {
        return Period.between(tglMulaiKerja, LocalDate.now()).getYears();
    }

    public abstract int hitungMasaKerja();
}
