public class Dosen extends Pegawai {

    protected String fakultas;

    public Dosen() {
    }

    public Dosen(String nip, String nama, int tanggalLahirHari, int tanggalLahirBulan, int tanggalLahirTahun, int tmtHari, int tmtBulan, int tmtTahun, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahirHari, tanggalLahirBulan, tanggalLahirTahun, tmtHari, tmtBulan, tmtTahun, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas: " + fakultas);
    }
}
