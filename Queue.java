public class Queue {
    int size;
    int front;
    int rear;
    int max;
    TransaksiLayanan[] data;

    public void AntrianLayanan(int max) {
        this.max = max;
        this.data = new TransaksiLayanan[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public Queue(int n) {
        max = n;
        data = new TransaksiLayanan[max];
        size = 0;
        front = 0;
        rear = -1;
    }
    
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void tambah(TransaksiLayanan t) {
        if (IsFull()) {
            System.out.println("Riwayat Transaksi penuh");
            return;
        }
        rear++;
        data[rear] = t;
        size++;
    }
    public void tampil() {
        System.out.println("-- RIWAYAT TRANSAKSI --");

        if (IsEmpty()) {
            System.out.println("Riwayat Transaksi kosong. ");
            return;
        }
        System.out.println("Daftar Transaksi: ");
        int idx = front;
        for (int i = 0; i < size; i++) {
            data[idx].tampil();
            idx = (idx + 1) % data.length;
        }
    }

    public void cariPasienBerdasarkanDurasiLayanan(int durasi) {
        if (IsEmpty()) {
            System.out.println("Riwayat Transaksi kosong.");
            return;
        }
        boolean found = false;
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % data.length;
            if (data[idx].durasiLayanan == durasi) {
                data[idx].tampil();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada transaksi dengan durasi layanan " + durasi + " jam.");
        }
    }

    public void tampilPasienPembayaranTerbanyak() {
        if (IsEmpty()) {
            System.out.println("Riwayat Transaksi kosong.");
            return;
        }
        int maxBiaya = 0;
        TransaksiLayanan pasienTerbanyak = null;

        for (int i = 0; i < size; i++) {
            int idx = (front + i) % data.length;
            if (data[idx].hitungBiaya() > maxBiaya) {
                maxBiaya = data[idx].hitungBiaya();
                pasienTerbanyak = data[idx];
            }
        }

        if (pasienTerbanyak != null) {
            System.out.println("Pasien dengan pembayaran terbanyak:");
            pasienTerbanyak.tampil();
        } else {
            System.out.println("Tidak ada transaksi yang ditemukan.");
        }
    }
}