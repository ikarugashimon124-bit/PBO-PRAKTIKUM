/* Nama File    : MCoersion.java
 * Deskripsi   : Program utama yang mengilustrasikan Polimorfisme Ad Hoc Coersion
 * Pembuat     : Mutiara Ayu Pramono - 24060123140131
 * Tanggal     : 17 Juni 2026
 */

public class MCoersion {
    public static void main(String[] args) {

        int nilaiInt = 65;
        char nilaiChar = (char) nilaiInt;   
        double nilaiDouble = (double) nilaiInt;  

        System.out.println("1a. Polimorfisme Coersion");
        System.out.println("Sebagai Integer: " + nilaiInt);
        System.out.println("Sebagai Karakter: " + nilaiChar);
        System.out.println("Sebagai Real: " + nilaiDouble);

        System.out.println("\n1b. Real ke Integer");
        double nilaiReal  = (double) nilaiInt;  
        int kembaliInt = (int) nilaiReal;    
        System.out.println("nilaiReal: " + nilaiReal);
        System.out.println("kembaliInt: " + kembaliInt);

        System.out.println("\n1c. Konkatenasi dan Penjumlahan Integer");
        String X = "1234";
        String Y = "5678";
        String S = X + Y;                                     
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y); 
        System.out.println("X = " + X);
        System.out.println("Y = " + Y);
        System.out.println("S (konkatenasi X+Y) = " + S);
        System.out.println("Z (penjumlahan X+Y) = " + Z);

        System.out.println("\n1d. Konkatenasi dan Penjumlahan Double");
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;                                              
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);     
        System.out.println("P = " + P);
        System.out.println("Q = " + Q);
        System.out.println("R (konkatenasi P+Q) = " + R);
        System.out.println("D (penjumlahan P+Q) = " + D);

        System.out.println("\n1e. Integer A dari konversi S");
        Integer A = Integer.parseInt(S);
        System.out.println("A = " + A);

        System.out.println("\n1f. String T dari konversi A");
        String T = A.toString();
        System.out.println("T = " + T);
    }
}
