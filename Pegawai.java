public class Pegawai {

    private static final int HARI_INI = 28;
    private static final int BULAN_INI = 4;
    private static final int TAHUN_INI = 2026;

    protected String nip;
    protected String nama;
    protected int tanggalLahirHari;
    protected int tanggalLahirBulan;
    protected int tanggalLahirTahun;
    protected int tmtHari;
    protected int tmtBulan;
    protected int tmtTahun;
    protected double gajiPokok;

    public Pegawai() {
    }

    public Pegawai(String nip, String nama, int tanggalLahirHari, int tanggalLahirBulan, int tanggalLahirTahun, int tmtHari, int tmtBulan, int tmtTahun, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahirHari = tanggalLahirHari;
        this.tanggalLahirBulan = tanggalLahirBulan;
        this.tanggalLahirTahun = tanggalLahirTahun;
        this.tmtHari = tmtHari;
        this.tmtBulan = tmtBulan;
        this.tmtTahun = tmtTahun;
        this.gajiPokok = gajiPokok;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getTanggalLahirHari() {
        return tanggalLahirHari;
    }

    public void setTanggalLahirHari(int tanggalLahirHari) {
        this.tanggalLahirHari = tanggalLahirHari;
    }

    public int getTanggalLahirBulan() {
        return tanggalLahirBulan;
    }

    public void setTanggalLahirBulan(int tanggalLahirBulan) {
        this.tanggalLahirBulan = tanggalLahirBulan;
    }

    public int getTanggalLahirTahun() {
        return tanggalLahirTahun;
    }

    public void setTanggalLahirTahun(int tanggalLahirTahun) {
        this.tanggalLahirTahun = tanggalLahirTahun;
    }

    public int getTmtHari() {
        return tmtHari;
    }

    public void setTmtHari(int tmtHari) {
        this.tmtHari = tmtHari;
    }

    public int getTmtBulan() {
        return tmtBulan;
    }

    public void setTmtBulan(int tmtBulan) {
        this.tmtBulan = tmtBulan;
    }

    public int getTmtTahun() {
        return tmtTahun;
    }

    public void setTmtTahun(int tmtTahun) {
        this.tmtTahun = tmtTahun;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public String getNamaBulan(int bulan) {
        if (bulan == 1) {
            return "Januari";
        } else if (bulan == 2) {
            return "Februari";
        } else if (bulan == 3) {
            return "Maret";
        } else if (bulan == 4) {
            return "April";
        } else if (bulan == 5) {
            return "Mei";
        } else if (bulan == 6) {
            return "Juni";
        } else if (bulan == 7) {
            return "Juli";
        } else if (bulan == 8) {
            return "Agustus";
        } else if (bulan == 9) {
            return "September";
        } else if (bulan == 10) {
            return "Oktober";
        } else if (bulan == 11) {
            return "November";
        } else {
            return "Desember";
        }
    }

    public int getMasaKerjaTahun() {
        int tahun = TAHUN_INI - tmtTahun;
        int bulan = BULAN_INI - tmtBulan;
        if (bulan < 0) {
            tahun--;
        }
        return tahun;
    }

    public int getMasaKerjaBulan() {
        int bulan = BULAN_INI - tmtBulan;
        if (bulan < 0) {
            bulan = bulan + 12;
        }
        return bulan;
    }

    public String formatRupiah(double nominal) {
        long nominalLong = (long) nominal;
        String nominalStr = "" + nominalLong;
        String hasil = "";
        int counter = 0;
        for (int i = nominalStr.length() - 1; i >= 0; i--) {
            if (counter > 0 && counter % 3 == 0) {
                hasil = "." + hasil;
            }
            hasil = nominalStr.charAt(i) + hasil;
            counter++;
        }
        return "Rp " + hasil + ",00";
    }

    public void printInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahirHari + " " + getNamaBulan(tanggalLahirBulan) + " " + tanggalLahirTahun);
        System.out.println("TMT: " + tmtHari + " " + getNamaBulan(tmtBulan) + " " + tmtTahun);
        System.out.println("Gaji Pokok: " + formatRupiah(gajiPokok));
    }
}
