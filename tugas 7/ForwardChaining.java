public class ForwardChaining {
    public static void main(String[] args) {
        // Inisialisasi variabel untuk menyimpan nilai kebenaran dari setiap proposisi
        boolean A = true;   // Fakta awal: A benar
        boolean B = false;
        boolean C = false;
        boolean D = false;
        boolean E = true;   // Fakta awal: E benar
        boolean F = false;
        boolean G = false;
        boolean H = false;
        boolean I = false;
        boolean J = false;
        boolean K = false;

        // Proses forward chaining
        if (A && B) {
            C = true;  // R1: If A and B then C
        }
        if (C) {
            D = true;  // R2: If C then D
        }
        if (A && E) {
            F = true;  // R3: If A and E then F
        }
        if (A) {
            G = true;  // R4: If A then G
        }
        if (F && G) {
            D = true;  // R5: If F and G then D
        }
        if (G && E) {
            H = true;  // R6: If G and E then H
        }
        if (C && H) {
            I = true;  // R7: If C and H then I
        }
        if (I && A) {
            J = true;  // R8: If I and A then J
        }
        if (G) {
            J = true;  // R9: If G then J
        }
        if (J) {
            K = true;  // R10: If J then K
        }

        // Menampilkan hasil
        System.out.println("K bernilai " + K);
    }
}
