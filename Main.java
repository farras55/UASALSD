import java.util.Scanner;

public class Main {
    public static Pasien inputPasien(Scanner sc) {
        System.out.print("Masukkan Nama Pasien: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIK: ");
        String nik = sc.nextLine();
        System.out.print("Masukkan Keluhan: ");
        String keluhan = sc.nextLine();
        System.out.print("Masukkan IPK: ");
        sc.nextLine();
        return new Pasien(nik, nama, keluhan);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SslPasien antrian = new SslPasien();

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
                Pasien p = 

                default:
                    break;
            }
        } while (pilihan != 0);
    }
}