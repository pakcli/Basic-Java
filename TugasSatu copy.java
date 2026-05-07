public class TugasSatu {

    public static void main(String[] args) {

        // 1. Float
        float strukturBaris = 9.25f;
        System.out.println("struktur baris: " + strukturBaris);

        // 2. String
        String susunanKataBaru = "Pemrograman Struktur Data Java";
        System.out.println("susunan kata baru: " + susunanKataBaru);

        // 3. Array
        int[] delapanAngka = {10, 12, 18, 23, 33, 58, 67, 82};

        System.out.println("delapan angka:");

        for (int i = 0; i < delapanAngka.length; i++) {
            System.out.print(delapanAngka[i] + " ");
        }

        System.out.println();
    }
}