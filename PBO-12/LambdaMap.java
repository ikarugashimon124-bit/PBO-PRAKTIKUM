/* Nama File    : LambdaMap.java
 * Deskripsi    : Implementasi lambda pada Map, menampilkan NIM sebagai key dan nama mahasiswa sebagai value.
 * Pembuat      : Mutiara Ayu Pramono - 24060123140131
 * Tanggal      : 17 Juni 2026
 */

import java.util.HashMap;

public class LambdaMap {
    public static void main(String[] args) {
        HashMap<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("24060123140131", "Mutiara Ayu Pramono");
        mahasiswaMap.put("24060123140132", "Budi Santoso");
        mahasiswaMap.put("24060123140133", "Citra Dewi");
        mahasiswaMap.put("24060123140134", "Doni Kusuma");

        mahasiswaMap.forEach((nim, nama) ->
            System.out.println("NIM: " + nim + " | Nama: " + nama));
    }
}
