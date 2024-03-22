public class BackwardChaining {
    public static void main(String[] args) {
        // Fakta gejala pasien
        boolean A1 = true; // Suhu tubuh > 38°C (demam)
        boolean A2 = true; // Batuk
        boolean A3 = false; // Pilek
        boolean A4 = true; // Batuk terus menerus di malam hari
        boolean A5 = false; // Nafas berbunyi

        // Mencoba membuktikan hipotesis P4 (batuk rejan)
        if (backwardChainingForP4(A1, A2, A3, A4)) {
            System.out.println("Hipotesis batuk rejan (P4) terbukti.");
        } else {
            System.out.println("Hipotesis batuk rejan (P4) tidak terbukti.");
        }

        // Mencoba membuktikan hipotesis P5 (infeksi saluran nafas)
        if (backwardChainingForP5(A1, A2, A3, A5)) {
            System.out.println("Hipotesis infeksi saluran nafas (P5) terbukti.");
        } else {
            System.out.println("Hipotesis infeksi saluran nafas (P5) tidak terbukti.");
        }
    }

    // Metode untuk membuktikan P4 (batuk rejan) menggunakan backward chaining
    public static boolean backwardChainingForP4(boolean A1, boolean A2, boolean A3, boolean A4) {
        boolean P1 = A1; // R1: IF A1 THEN P1 (demam biasa)
        boolean P2 = A2; // R2: IF A2 THEN P2 (batuk biasa)
        boolean P3 = P1 && (P2 || A3); // R3: IF P1 AND (P2 OR A3) THEN P3 (influenza)
        return P3 && A4; // R4: IF P3 AND A4 THEN P4 (batuk rejan)
    }

    // Metode untuk membuktikan P5 (infeksi saluran nafas) menggunakan backward chaining
    public static boolean backwardChainingForP5(boolean A1, boolean A2, boolean A3, boolean A5) {
        boolean P1 = A1; // R1: IF A1 THEN P1 (demam biasa)
        boolean P2 = A2; // R2: IF A2 THEN P2 (batuk biasa)
        boolean P3 = P1 && (P2 || A3); // R3: IF P1 AND (P2 OR A3) THEN P3 (influenza)
        return P3 && A5; // R5: IF P3 AND A5 THEN P5 (infeksi saluran nafas)
    }
}
