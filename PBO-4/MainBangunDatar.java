public class MainBangunDatar {

    public static void main(String[] args) {

        Persegi p1 = new Persegi();
        p1.setSisi(5);
        p1.setWarna("Merah");
        p1.setBorder("Hitam");

        System.out.println("Persegi 1");
        p1.printInfo();

        Persegi p2 = new Persegi(7, "Biru", "Putih");
        System.out.println("\nPersegi 2");
        p2.printInfo();

        lingkaran l1 = new lingkaran(14, "Merah", "Hitam");

        System.out.println("\nLingkaran");
        System.out.println("Jari-jari: " + l1.getJari());
        System.out.println("Luas: " + l1.getLuas());
        System.out.println("Keliling: " + l1.getKeliling());

        l1.setJari(10);

        System.out.println("\nSetelah jari-jari diubah:");
        System.out.println("Jari-jari: " + l1.getJari());
        System.out.println("Luas: " + l1.getLuas());
        System.out.println("Keliling: " + l1.getKeliling());

        System.out.println("\n");
        BangunDatar.printCounterBangunDatar();
    }

}
