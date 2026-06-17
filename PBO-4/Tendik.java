public class Tendik extends Pegawai {

    private static final int BUP = 55;
    private String bidang;

    public Tendik() {
    }

    public Tendik(String nip, String nama, int tanggalLahirHari, int tanggalLahirBulan, int tanggalLahirTahun, int tmtHari, int tmtBulan, int tmtTahun, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahirHari, tanggalLahirBulan, tanggalLahirTahun, tmtHari, tmtBulan, tmtTahun, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public double getTunjangan() {
        return 0.01 * getMasaKerjaTahun() * gajiPokok;
    }

    public int getTanggalPensiunHari() {
        return 1;
    }

    public int getTanggalPensiunBulan() {
        int bulanPensiun = tanggalLahirBulan + 1;
        if (bulanPensiun > 12) {
            bulanPensiun = 1;
        }
        return bulanPensiun;
    }

    public int getTanggalPensiunTahun() {
        int bulanPensiun = tanggalLahirBulan + 1;
        int tahunPensiun = tanggalLahirTahun + BUP;
        if (bulanPensiun > 12) {
            tahunPensiun = tahunPensiun + 1;
        }
        return tahunPensiun;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahirHari + " " + getNamaBulan(tanggalLahirBulan) + " " + tanggalLahirTahun);
        System.out.println("TMT: " + tmtHari + " " + getNamaBulan(tmtBulan) + " " + tmtTahun);
        System.out.println("Jabatan: Tenaga Kependidikan");
        System.out.println("Bidang: " + bidang);
        System.out.println("Masa Kerja: " + getMasaKerjaTahun() + " tahun " + getMasaKerjaBulan() + " bulan");
        System.out.println("Tanggal Pensiun: " + getTanggalPensiunHari() + " " + getNamaBulan(getTanggalPensiunBulan()) + " " + getTanggalPensiunTahun());
        System.out.println("Gaji Pokok: " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan: 1% x " + getMasaKerjaTahun() + " x " + formatRupiah(gajiPokok) + " = Rp. " + formatRupiah(getTunjangan()).substring(3));
    }
}
