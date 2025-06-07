import java.util.Scanner;

public class Main {
    public static Pasien inputPasien(Scanner sc) {
        System.out.print("Masukkan Nama Pasien: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIK: ");
        String nik = sc.nextLine();
        System.out.print("Masukkan Keluhan: ");
        String keluhan = sc.nextLine();
        return new Pasien(nik, nama, keluhan);
    }
    public static Dokter inputDokter(Scanner sc) {
        System.out.print("Masukkan ID Dokter: ");
        String idDokter = sc.nextLine();
        System.out.print("Masukkan Nama Dokter: ");
        String nama = sc.nextLine();
        return new Dokter(idDokter, nama);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SslPasien antrian = new SslPasien();
        Queue transaksi = new Queue(50);

        int pilihan;
        do {
            System.out.println("\n=== SISTEM ANTRIAN KLINIK ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {

                case 1:
                Pasien p = inputPasien(sc) ;
                antrian. tambahPasien(p);
                    break;
            
                case 2:
                antrian.tampilAntrian();
                break;

                case 3:
                Pasien a = antrian.layaniDanAmbilPasien();
                if (a == null) {
                    System.out.println("Antrian Kosong");
                    break;
                }
                System.out.println("Pasien " + a.nama + " dipanggil");
                Dokter d = inputDokter(sc);
                System.out.print("Masukkan Durasi Layanan (jam): ");
                int durasilayanan = sc.nextInt();
                sc.nextLine();
                TransaksiLayanan t = new TransaksiLayanan(a, d, durasilayanan);
                transaksi. tambah(null);
                System.out.println("Pasien Telah Dilayani, Transaksi berhasil dicatat. ");
                break;

                case 4:
                int sisa = antrian.hitungSisa();
                System.out.println("Sisa pasien dalam antrian: " + sisa);
                break;

                case 5:
                transaksi.tampil();
                break;

                case 0:
                System.out.println("Program Selesai.");
                break;

                default:
            }
        } while (pilihan != 0);
        sc.close();
    }
}