public class DosenTetap extends Dosen {

    private static final int BUP = 65;
    private String nidn;

    public DosenTetap() {
    }

    public DosenTetap(String nip, String nidn, String nama, int tanggalLahirHari, int tanggalLahirBulan, int tanggalLahirTahun, int tmtHari, int tmtBulan, int tmtTahun, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahirHari, tanggalLahirBulan, tanggalLahirTahun, tmtHari, tmtBulan, tmtTahun, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public double getTunjangan() {
        return 0.02 * getMasaKerjaTahun() * gajiPokok;
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
        System.out.println("NIDN: " + nidn);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahirHari + " " + getNamaBulan(tanggalLahirBulan) + " " + tanggalLahirTahun);
        System.out.println("TMT: " + tmtHari + " " + getNamaBulan(tmtBulan) + " " + tmtTahun);
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Masa Kerja: " + getMasaKerjaTahun() + " tahun " + getMasaKerjaBulan() + " bulan");
        System.out.println("Tanggal Pensiun: " + getTanggalPensiunHari() + " " + getNamaBulan(getTanggalPensiunBulan()) + " " + getTanggalPensiunTahun());
        System.out.println("Gaji Pokok: " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan: 2% x " + getMasaKerjaTahun() + " x " + formatRupiah(gajiPokok) + " = Rp. " + formatRupiah(getTunjangan()).substring(3));
    }
}
