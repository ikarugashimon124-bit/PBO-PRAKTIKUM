/* Nama File    : MainOperatorGenerik.java
 * Deskripsi   : Program utama untuk menguji prosedur Tukar dan fungsi Bobot2
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class MainOperatorGenerik {
    public static void main(String[] args) {

        OperatorGenerik op = new OperatorGenerik();

        System.out.println("3b. Tukar sesama Integer");
        Datum<Integer> dInt1 = new Datum<>(3);
        Datum<Integer> dInt2 = new Datum<>(6);
        System.out.println("Sebelum tukar: a=" + dInt1.getIsi() + ", b=" + dInt2.getIsi());
        op.Tukar(dInt1, dInt2);
        System.out.println("Sesudah tukar: a=" + dInt1.getIsi() + ", b=" + dInt2.getIsi());

        System.out.println("\n3b. Tukar sesama String");
        Datum<String> dStr1 = new Datum<>("Apel");
        Datum<String> dStr2 = new Datum<>("Mangga");
        System.out.println("Sebelum tukar: a=" + dStr1.getIsi() + ", b=" + dStr2.getIsi());
        op.Tukar(dStr1, dStr2);
        System.out.println("Sesudah tukar: a=" + dStr1.getIsi() + ", b=" + dStr2.getIsi());

        System.out.println("\n3b. Tukar sesama keluarga Anabul");
        Anjing rex  = new Anjing("Rex");
        Kucing mimi = new Kucing("Mimi", 3.5);
        Datum<Anabul> dAnabul1 = new Datum<>(rex);
        Datum<Anabul> dAnabul2 = new Datum<>(mimi);
        System.out.println("Sebelum tukar:");
        System.out.print("  a -> "); dAnabul1.getIsi().Bersuara();
        System.out.print("  b -> "); dAnabul2.getIsi().Bersuara();
        op.Tukar(dAnabul1, dAnabul2);
        System.out.println("Sesudah tukar:");
        System.out.print("  a -> "); dAnabul1.getIsi().Bersuara();
        System.out.print("  b -> "); dAnabul2.getIsi().Bersuara();

        System.out.println("\n3c. Fungsi Bobot2");
        Kucing k1  = new Kucing("Biscuit", 5.0);
        Kucing k2  = new Kucing("Cream", 4.0);
        Anggora a1  = new Anggora("Mochi", 4.5);
        Anggora a2  = new Anggora("Luna", 3.8);
        Kembangtelon kt1 = new Kembangtelon("Oreo", 3.2);
        Kembangtelon kt2 = new Kembangtelon("Totie", 2.9);

        System.out.println("Bobot " + k1.Nama + " + " + k2.Nama + " = "
                + op.Bobot2(k1, k2) + " kg");
        System.out.println("Bobot " + a1.Nama + " + " + a2.Nama + " = "
                + op.Bobot2(a1, a2) + " kg");
        System.out.println("Bobot " + kt1.Nama + " + " + kt2.Nama + " = "
                + op.Bobot2(kt1, kt2) + " kg");
        System.out.println("Bobot " + a1.Nama + " + " + kt1.Nama + " = "
                + op.<Kucing>Bobot2(a1, kt1) + " kg");
    }
}
