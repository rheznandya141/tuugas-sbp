public class RumahMakan {
    public static void main(String[] args) {
        // Membuat objek pelanggan dan pelayan
        Pelanggan pelanggan = new Pelanggan("Agung");
        Pelayan pelayan = new Pelayan("Siti");

        // Pelanggan memasuki rumah makan
        pelanggan.masukRumahMakan();

        // Pelayan menyambut pelanggan
        pelayan.sambutPelanggan(pelanggan.getNama());

        // Pelanggan memesan makanan
        String pesanan = "Nasi Goreng";
        pelanggan.pesanMakanan(pesanan);

        // Pelayan mencatat pesanan
        pelayan.catatPesanan(pelanggan.getNama(), pesanan);

        // Pelayan mengantarkan makanan
        pelayan.antarMakanan(pelanggan.getNama(), pesanan);

        // Pelanggan menerima makanan
        pelanggan.terimaMakanan(pesanan);

        // Pelanggan makan
        pelanggan.makan();

        // Pelanggan membayar
        pelanggan.bayar(50000);

        // Pelanggan meninggalkan rumah makan
        pelanggan.keluarRumahMakan();
    }
}

class Pelanggan {
    private String nama;

    public Pelanggan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void masukRumahMakan() {
        System.out.println(nama + " memasuki rumah makan.");
    }

    public void pesanMakanan(String makanan) {
        System.out.println(nama + " memesan " + makanan + ".");
    }

    public void terimaMakanan(String makanan) {
        System.out.println(nama + " menerima " + makanan + ".");
    }

    public void makan() {
        System.out.println(nama + " mulai makan.");
    }

    public void bayar(int jumlah) {
        System.out.println(nama + " membayar Rp" + jumlah + ".");
    }

    public void keluarRumahMakan() {
        System.out.println(nama + " meninggalkan rumah makan.");
    }
}

class Pelayan {
    private String nama;

    public Pelayan(String nama) {
        this.nama = nama;
    }

    public void sambutPelanggan(String namaPelanggan) {
        System.out.println("Pelayan " + nama + " menyambut " + namaPelanggan + ".");
    }

    public void catatPesanan(String namaPelanggan, String pesanan) {
        System.out.println("Pelayan " + nama + " mencatat pesanan " + namaPelanggan + " yaitu " + pesanan + ".");
    }

    public void antarMakanan(String namaPelanggan, String pesanan) {
        System.out.println("Pelayan " + nama + " mengantarkan " + pesanan + " ke meja " + namaPelanggan + ".");
    }
}
