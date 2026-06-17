public class DosenTamu extends Dosen {

    private static final int HARI_INI = 28;
    private static final int BULAN_INI = 4;
    private static final int TAHUN_INI = 2026;

    private String nidk;
    private int berakhirKontrakHari;
    private int berakhirKontrakBulan;
    private int berakhirKontrakTahun;

    public DosenTamu() {
    }

    public DosenTamu(String nip, String nidk, String nama, int tanggalLahirHari, int tanggalLahirBulan, int tanggalLahirTahun, int tmtHari, int tmtBulan, int tmtTahun, double gajiPokok, String fakultas, int berakhirKontrakHari, int berakhirKontrakBulan, int berakhirKontrakTahun) {
        super(nip, nama, tanggalLahirHari, tanggalLahirBulan, tanggalLahirTahun, tmtHari, tmtBulan, tmtTahun, gajiPokok, fakultas);
        this.nidk = nidk;
        this.berakhirKontrakHari = berakhirKontrakHari;
        this.berakhirKontrakBulan = berakhirKontrakBulan;
        this.berakhirKontrakTahun = berakhirKontrakTahun;
    }

    public String getNidk() {
        return nidk;
    }

    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public int getBerakhirKontrakHari() {
        return berakhirKontrakHari;
    }

    public void setBerakhirKontrakHari(int berakhirKontrakHari) {
        this.berakhirKontrakHari = berakhirKontrakHari;
    }

    public int getBerakhirKontrakBulan() {
        return berakhirKontrakBulan;
    }

    public void setBerakhirKontrakBulan(int berakhirKontrakBulan) {
        this.berakhirKontrakBulan = berakhirKontrakBulan;
    }

    public int getBerakhirKontrakTahun() {
        return berakhirKontrakTahun;
    }

    public void setBerakhirKontrakTahun(int berakhirKontrakTahun) {
        this.berakhirKontrakTahun = berakhirKontrakTahun;
    }

    public double getTunjangan() {
        return 0.025 * gajiPokok;
    }

    public int getSisaKontrakBulan() {
        int totalBulanBerakhir = berakhirKontrakTahun * 12 + berakhirKontrakBulan;
        int totalBulanSekarang = TAHUN_INI * 12 + BULAN_INI;
        int sisaBulan = totalBulanBerakhir - totalBulanSekarang;
        if (sisaBulan < 0) {
            sisaBulan = 0;
        }
        return sisaBulan;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP : " + nip);
        System.out.println("NIDK : " + nidk);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahirHari + " " + getNamaBulan(tanggalLahirBulan) + " " + tanggalLahirTahun);
        System.out.println("TMT: " + tmtHari + " " + getNamaBulan(tmtBulan) + " " + tmtTahun);
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Masa Kerja: " + getMasaKerjaTahun() + " tahun " + getMasaKerjaBulan() + " bulan");
        System.out.println("Berakhir Kontrak: " + berakhirKontrakHari + " " + getNamaBulan(berakhirKontrakBulan) + " " + berakhirKontrakTahun + " (" + getSisaKontrakBulan() + " bulan lagi)");
        System.out.println("Gaji Pokok: " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan: 2,5% x " + formatRupiah(gajiPokok) + " = Rp. " + formatRupiah(getTunjangan()).substring(3));
    }
}
